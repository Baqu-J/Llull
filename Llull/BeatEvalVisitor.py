import sys
from termcolor import colored

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

class BeatEvalVisitor(LlullVisitor):
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
            funcid = ctx.ID().getText()
            funcargs = ctx.argumentsdef()
            funcblock = ctx.statblock()
            outp = f"{colored('void', 'red', attrs={'bold'})} {colored(funcid, 'magenta', attrs={'bold'})} ("
            if funcargs != None:
                args = ', '.join(self.visit(funcargs))
                outp += args
            outp += ") {\n"
            if funcblock != None:
                self.nivell += 1
                outp += self.visit(funcblock)
                self.nivell -= 1
            outp += "}"
            print(outp)
            print()


    def visitFuncall(self, ctx: LlullParser.FuncallContext):
            funcid = ctx.ID().getText()
            retStr = colored(funcid, 'cyan', attrs={'bold'}) + f"({ ', '.join(self.visit(ctx.arguments())) })"
            return retStr


    def visitArgdef(self, ctx: LlullParser.ArgdefContext):
        l = list(ctx.getChildren())
        ids = []
        for ch in l:
            if ch.getText() != ',':
                ids.append(colored(ch.getText(), 'yellow'))
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
        return colored(l[0].getText(), 'cyan')

    def visitStatexpr(self, ctx: LlullParser.StatexprContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitId(self, ctx: LlullParser.IdContext):
        var = ctx.ID().getText()
        return colored(var, 'yellow')

    def visitAssign(self, ctx: LlullParser.AssignContext):
        l = list(ctx.getChildren())
        ident = l[0].getText()
        value = self.visit(l[2])
        return f"{colored(ident, 'yellow')} = {value}"

    def visitWrite(self, ctx: LlullParser.WriteContext):
        retStr = colored("write", 'cyan', attrs={'bold'}) + "("
        retStr += self.visit(ctx.wargs()) + ")"
        return retStr
        

    def visitText(self, ctx: LlullParser.TextContext):
        return colored(ctx.ANYTEXT().getText(), 'green')

    def visitWriteargs(self, ctx: LlullParser.WriteargsContext):
        l = list(ctx.getChildren())
        s = []
        for ch in l:
            if ch.getText() != ',':
                s.append(self.visit(ch))
        return ', '.join(s)
    
    def visitRead(self, ctx: LlullParser.ReadContext):
        retStr = colored("read", 'cyan', attrs={'bold'}) + "("
        l = list(ctx.getChildren())
        ident = l[2].getText()
        retStr += colored(ident, 'yellow') + ")"
        return retStr

    def visitNewarray(self, ctx: LlullParser.NewarrayContext):
        retStr = colored("array", 'cyan', attrs={'bold'}) + "("
        ident = ctx.ID().getText()
        leng = self.visit(ctx.expr())
        retStr += colored(ident, 'yellow') + ", " + leng + ")"
        return retStr


    def visitGetarrayvalue(self, ctx: LlullParser.GetarrayvalueContext):
        ident = ctx.ID().getText()
        pos = self.visit(ctx.expr())
        retStr = colored("get", 'cyan', attrs={'bold'}) + f"({colored(ident, 'yellow')}"
        retStr += f", {pos})"
        return retStr

    def visitSetarrayvalue(self, ctx: LlullParser.SetarrayvalueContext):
        ident = ctx.ID().getText()
        pos = self.visit(ctx.expr(0))
        val = self.visit(ctx.expr(1))
        retStr = colored("set", 'cyan', attrs={'bold'}) + f"({colored(ident, 'yellow')}"
        retStr += f", {pos}, {val})"
        return retStr


    def visitSuma(self, ctx: LlullParser.SumaContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} + {expr2}"

    def visitResta(self, ctx: LlullParser.RestaContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} - {expr2}"
    
    def visitProducte(self, ctx: LlullParser.ProducteContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} * {expr2}"
    
    def visitDivisio(self, ctx: LlullParser.DivisioContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} / {expr2}"

    def visitMod(self, ctx: LlullParser.ModContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} % {expr2}"

    def visitPotencia(self, ctx: LlullParser.PotenciaContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} ^ {expr2}"

    def visitLowerThan(self, ctx: LlullParser.LowerThanContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} < {expr2}"
    
    def visitLowerEq(self, ctx: LlullParser.LowerEqContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} <= {expr2}"
  
    def visitBiggerThan(self, ctx: LlullParser.BiggerThanContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} > {expr2}"
    
    def visitBiggerEq(self, ctx: LlullParser.BiggerEqContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} >= {expr2}"

    def visitEqual(self, ctx: LlullParser.EqualContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} == {expr2}"

    def visitDifferent(self, ctx: LlullParser.DifferentContext):
        l = list(ctx.getChildren())
        expr1 = self.visit(l[0])
        expr2 = self.visit(l[2])
        return f"{expr1} <> {expr2}"

    def visitStblock(self, ctx: LlullParser.StblockContext):
        l = list(ctx.getChildren())
        stringblock = ""
        for ch in l:
            stringblock += "    "*self.nivell + self.visit(ch) + '\n'
        return stringblock

    def visitIf(self, ctx: LlullParser.IfContext):
        l = list(ctx.getChildren())
        retStr = colored("if", 'red', attrs={'bold'}) + "("
        retStr += self.visit(ctx.relational()) + ") {\n"
        bl = ctx.statblock(0)
        if bl != None:
            self.nivell += 1
            retStr += self.visit(bl)
            self.nivell -= 1
        retStr += "    " * self.nivell +  "}"
        bl2 = ctx.statblock(1)
        if bl2 != None:
            retStr+= colored("else", 'red', attrs={'bold'}) + " {\n"
            self.nivell += 1
            retStr += self.visit(bl2)
            self.nivell -= 1
        return retStr

    def visitWhile(self, ctx: LlullParser.WhileContext):
        retStr = colored("while", 'red', attrs={'bold'}) + "("
        retStr += self.visit(ctx.relational()) + ") {\n"
        bl = ctx.statblock()
        if bl != None:
            self.nivell += 1
            retStr += self.visit(bl)
            self.nivell -= 1
        retStr += "    " * self.nivell +  "}"
        return retStr
    
    def visitFor(self, ctx: LlullParser.ForContext):
        l = list(ctx.getChildren())
        retStr = colored("for", 'red', attrs={'bold'}) + "("
        retStr += f"{self.visit(l[2])}; {self.visit(ctx.relational())}; {self.visit(l[6])}" + ") {\n"
        bl = ctx.statblock()
        if bl != None:
            self.nivell += 1
            retStr += self.visit(bl)
            self.nivell -= 1
        retStr += "    " * self.nivell +  "}"
        return retStr
            