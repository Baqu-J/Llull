import sys


if __name__ is not None and "." in __name__:
    from .LlullParser import LlullParser
    from .LlullVisitor import LlullVisitor
else:
    from LlullParser import LlullParser
    from LlullVisitor import LlullVisitor

class Error(Exception):
    pass

class WrongFunctionArgs(Error):
    pass

class FuncExists(Error):
    pass

class WrongID(Error):
    pass

class IndexOutofRange(Error):
    pass

class WrongArrayID(Error):
    pass

class WrongOp(Error):
    pass

class DivideByZero(Error):
    pass

class EvalVisitor(LlullVisitor):
    mem = [] #PILA de "memories" per les funcions, per fer-les "stackable" consevant regla de visibilitat
    funcs = dict()

    def __init__(self, mainprog="main"):
        self.main = mainprog
        self.nivell = 0

    def visitTreeroot(self, ctx: LlullParser.TreerootContext):
        l = list(ctx.getChildren())
        for ch in l:
            self.visit(ch)
        

    def visitFuncdef(self, ctx: LlullParser.FuncdefContext):
        try:
            funcid = ctx.ID().getText()
            if funcid in self.funcs:
                raise FuncExists
            funcargs = ctx.argumentsdef()
            funcblock = ctx.statblock()
            self.funcs[funcid] = (funcargs, funcblock)
        except FuncExists:
            print(f"multiple definitions of function {funcid}")
            print()
            raise

    def visitFuncall(self, ctx: LlullParser.FuncallContext):
        try:
            funcid = ctx.ID().getText()
            if funcid not in self.funcs:
                print(f"Function {funcid} does not exsist")
                return 1
            idpointer, blockpointer = self.funcs[funcid]
            if idpointer == None: 
                argids = []
                argvalues = []
            else: 
                argids = self.visit(idpointer)
                argvalues = self.visit(ctx.arguments())
            if len(argids) != len(argvalues): raise WrongFunctionArgs
            self.mem.append(dict())
            for arg, val in zip(argids, argvalues):
                self.mem[-1][arg] = val
            self.visit(blockpointer)
            self.mem.pop()
        except WrongFunctionArgs:
            print(f"{funcid} has {len(argids)} arguments, not {len(argvalues)}")
            print()
            raise

    def visitArgdef(self, ctx: LlullParser.ArgdefContext):
        l = list(ctx.getChildren())
        ids = []
        for ch in l:
            if ch.getText() != ',':
                ids.append(ch.getText())
        return ids

    def visitArgcall(self, ctx: LlullParser.ArgcallContext):
        l = list(ctx.getChildren())
        vals = []
        for ch in l:
            if ch.getText() != ',':
                vals.append(self.visit(ch))
        return vals

    def visitValor(self, ctx: LlullParser.ValorContext):
        l = list(ctx.getChildren())
        return int(l[0].getText())

    def visitStatexpr(self, ctx: LlullParser.StatexprContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitId(self, ctx: LlullParser.IdContext):
        try:
            var = ctx.ID().getText()
            if var not in self.mem[-1]:
                raise WrongID
            return self.mem[-1][var]
        except WrongID:
            print(f"Variable does not exist")
            print()
            raise

    def visitAssign(self, ctx: LlullParser.AssignContext):
        l = list(ctx.getChildren())
        ident = l[0].getText()
        value = self.visit(l[2])
        self.mem[-1][ident] = value
        return value

    def visitWrite(self, ctx: LlullParser.WriteContext):
        self.visit(ctx.wargs())

    def visitText(self, ctx: LlullParser.TextContext):
        return(ctx.ANYTEXT().getText()[1:-1])

    def visitWriteargs(self, ctx: LlullParser.WriteargsContext):
        l = list(ctx.getChildren())
        s = []
        for ch in l:
            if ch.getText() != ',':
                s.append(self.visit(ch))

        print(' '.join(map(str, s)))
    
    def visitRead(self, ctx: LlullParser.ReadContext):
        l = list(ctx.getChildren())
        ident = l[2].getText()
        value = int(sys.stdin.readline())
        self.mem[-1][ident] = value

    def visitNewarray(self, ctx: LlullParser.NewarrayContext):
        #Si array existeix, es sobreescriu
        ident = ctx.ID().getText()
        leng = self.visit(ctx.expr())
        self.mem[-1][ident] = [0]*leng

    def visitGetarrayvalue(self, ctx: LlullParser.GetarrayvalueContext):
        try:
            ident = ctx.ID().getText()
            pos = self.visit(ctx.expr())
            if ident in self.mem[-1]:
                var = self.mem[-1][ident]
                if isinstance(var, list):
                    if pos < len(var): return var[pos]
                    else:
                        raise IndexOutofRange
                else:
                    raise WrongArrayID
            else:
                raise WrongArrayID
        except IndexOutofRange:
            print("Index out of range")
            print()
            raise
        except WrongArrayID:
            print("Array does not exist")
            print()
            raise

    def visitSetarrayvalue(self, ctx: LlullParser.SetarrayvalueContext):
        try:
            ident = ctx.ID().getText()
            pos = self.visit(ctx.expr(0))
            val = self.visit(ctx.expr(1))
            if ident in self.mem[-1]:
                var = self.mem[-1][ident]
                if isinstance(var, list):
                    if pos < len(var): var[pos] = val
                    else:
                        raise IndexOutofRange
                else:
                    raise WrongArrayID
            else:
                raise WrongArrayID
        except IndexOutofRange:
            print("Index out of range")
            print()
            raise
        except WrongArrayID:
            print("Array does not exist")
            print()
            raise


    def visitSuma(self, ctx: LlullParser.SumaContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            return expr1 + expr2
        except WrongOp:
            print("Can't sum arrays")
            print()
            raise

    def visitResta(self, ctx: LlullParser.RestaContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            return expr1 - expr2
        except WrongOp:
            print("Can't sub arrays")
            print()
            raise
    
    def visitProducte(self, ctx: LlullParser.ProducteContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            return expr1 * expr2
        except WrongOp:
            print("Can't multiply arrays")
            print()
            raise
    
    def visitDivisio(self, ctx: LlullParser.DivisioContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            if(expr2 == 0): 
                raise DivideByZero
            return expr1 / expr2
        except WrongOp:
            print("Can't divide arrays")
            print()
            raise
        except DivideByZero:
            print("Can't divide by zero")
            print()
            raise

    def visitMod(self, ctx: LlullParser.ModContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            return expr1 % expr2
        except WrongOp:
            print("Can't mod arrays")
            print()
            raise

    def visitPotencia(self, ctx: LlullParser.PotenciaContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            return expr1 ** expr2
        except WrongOp:
            print("Can't multiply arrays")
            print()
            raise
    def visitLowerThan(self, ctx: LlullParser.LowerThanContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            if expr1 < expr2:
                return 1
            else: return 0
        except WrongOp:
            print("Can't compare arrays")
            print()
            raise
    
    def visitLowerEq(self, ctx: LlullParser.LowerEqContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            if expr1 <= expr2:
                return 1
            else: return 0
        except WrongOp:
            print("Can't compare arrays")
            print()
            raise
  
    def visitBiggerThan(self, ctx: LlullParser.BiggerThanContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            if expr1 > expr2:
                return 1
            else: return 0
        except WrongOp:
            print("Can't compare arrays")
            print()
            raise
    
    def visitBiggerEq(self, ctx: LlullParser.BiggerEqContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            if expr1 >= expr2:
                return 1
            else: return 0
        except WrongOp:
            print("Can't compare arrays")
            print()
            raise

    def visitEqual(self, ctx: LlullParser.EqualContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            if expr1 == expr2:
                return 1
            else: return 0
        except WrongOp:
            print("Can't compare arrays")
            print()
            raise

    def visitDifferent(self, ctx: LlullParser.DifferentContext):
        try:
            l = list(ctx.getChildren())
            expr1 = self.visit(l[0])
            expr2 = self.visit(l[2])
            if isinstance(expr1, list) or isinstance(expr2, list):
                raise WrongOp
            if expr1 != expr2:
                return 1
            else: return 0
        except WrongOp:
            print("Can't compare arrays")
            print()
            raise

    def visitStblock(self, ctx: LlullParser.StblockContext):
        l = list(ctx.getChildren())
        for ch in l:
            self.visit(ch)

    def visitIf(self, ctx: LlullParser.IfContext):
        l = list(ctx.getChildren())
        if(self.visit(ctx.relational())): self.visit(ctx.statblock(0))
        else:
            if ctx.statblock(1) != None:
                self.visit(ctx.statblock(1))

    def visitWhile(self, ctx: LlullParser.WhileContext):
        while(self.visit(ctx.relational())):
            self.visit(ctx.statblock())
    
    def visitFor(self, ctx: LlullParser.ForContext):
        l = list(ctx.getChildren())
        self.visit(l[2])
        while(self.visit(ctx.relational())):
            self.visit(ctx.statblock())
            self.visit(l[6])