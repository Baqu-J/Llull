# Generated from Llull.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LlullParser import LlullParser
else:
    from LlullParser import LlullParser

# This class defines a complete generic visitor for a parse tree produced by LlullParser.

class LlullVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by LlullParser#treeroot.
    def visitTreeroot(self, ctx:LlullParser.TreerootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#statexpr.
    def visitStatexpr(self, ctx:LlullParser.StatexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#assign.
    def visitAssign(self, ctx:LlullParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#write.
    def visitWrite(self, ctx:LlullParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#read.
    def visitRead(self, ctx:LlullParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#newarray.
    def visitNewarray(self, ctx:LlullParser.NewarrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#setarrayvalue.
    def visitSetarrayvalue(self, ctx:LlullParser.SetarrayvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#relat.
    def visitRelat(self, ctx:LlullParser.RelatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#bucle.
    def visitBucle(self, ctx:LlullParser.BucleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#cond.
    def visitCond(self, ctx:LlullParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#fdef.
    def visitFdef(self, ctx:LlullParser.FdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Producte.
    def visitProducte(self, ctx:LlullParser.ProducteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Suma.
    def visitSuma(self, ctx:LlullParser.SumaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Mod.
    def visitMod(self, ctx:LlullParser.ModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Divisio.
    def visitDivisio(self, ctx:LlullParser.DivisioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#funcio.
    def visitFuncio(self, ctx:LlullParser.FuncioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#getarrayvalue.
    def visitGetarrayvalue(self, ctx:LlullParser.GetarrayvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#id.
    def visitId(self, ctx:LlullParser.IdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Potencia.
    def visitPotencia(self, ctx:LlullParser.PotenciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Valor.
    def visitValor(self, ctx:LlullParser.ValorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Resta.
    def visitResta(self, ctx:LlullParser.RestaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#if.
    def visitIf(self, ctx:LlullParser.IfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#stblock.
    def visitStblock(self, ctx:LlullParser.StblockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#LowerThan.
    def visitLowerThan(self, ctx:LlullParser.LowerThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#BiggerThan.
    def visitBiggerThan(self, ctx:LlullParser.BiggerThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Different.
    def visitDifferent(self, ctx:LlullParser.DifferentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#Equal.
    def visitEqual(self, ctx:LlullParser.EqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#LowerEq.
    def visitLowerEq(self, ctx:LlullParser.LowerEqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#BiggerEq.
    def visitBiggerEq(self, ctx:LlullParser.BiggerEqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#funcall.
    def visitFuncall(self, ctx:LlullParser.FuncallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#funcdef.
    def visitFuncdef(self, ctx:LlullParser.FuncdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#argdef.
    def visitArgdef(self, ctx:LlullParser.ArgdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#writeargs.
    def visitWriteargs(self, ctx:LlullParser.WriteargsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#argcall.
    def visitArgcall(self, ctx:LlullParser.ArgcallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#while.
    def visitWhile(self, ctx:LlullParser.WhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#for.
    def visitFor(self, ctx:LlullParser.ForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LlullParser#text.
    def visitText(self, ctx:LlullParser.TextContext):
        return self.visitChildren(ctx)



del LlullParser