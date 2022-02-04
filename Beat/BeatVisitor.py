# Generated from ../Beat/Beat.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .BeatParser import BeatParser
else:
    from BeatParser import BeatParser

# This class defines a complete generic visitor for a parse tree produced by BeatParser.

class BeatVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by BeatParser#treeroot.
    def visitTreeroot(self, ctx:BeatParser.TreerootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#statexpr.
    def visitStatexpr(self, ctx:BeatParser.StatexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#assign.
    def visitAssign(self, ctx:BeatParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#write.
    def visitWrite(self, ctx:BeatParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#read.
    def visitRead(self, ctx:BeatParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#newarray.
    def visitNewarray(self, ctx:BeatParser.NewarrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#setarrayvalue.
    def visitSetarrayvalue(self, ctx:BeatParser.SetarrayvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#relat.
    def visitRelat(self, ctx:BeatParser.RelatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#bucle.
    def visitBucle(self, ctx:BeatParser.BucleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#cond.
    def visitCond(self, ctx:BeatParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#fdef.
    def visitFdef(self, ctx:BeatParser.FdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Producte.
    def visitProducte(self, ctx:BeatParser.ProducteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Suma.
    def visitSuma(self, ctx:BeatParser.SumaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Mod.
    def visitMod(self, ctx:BeatParser.ModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Divisio.
    def visitDivisio(self, ctx:BeatParser.DivisioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#funcio.
    def visitFuncio(self, ctx:BeatParser.FuncioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#getarrayvalue.
    def visitGetarrayvalue(self, ctx:BeatParser.GetarrayvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#id.
    def visitId(self, ctx:BeatParser.IdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Potencia.
    def visitPotencia(self, ctx:BeatParser.PotenciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Valor.
    def visitValor(self, ctx:BeatParser.ValorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Resta.
    def visitResta(self, ctx:BeatParser.RestaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#if.
    def visitIf(self, ctx:BeatParser.IfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#stblock.
    def visitStblock(self, ctx:BeatParser.StblockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#LowerThan.
    def visitLowerThan(self, ctx:BeatParser.LowerThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#BiggerThan.
    def visitBiggerThan(self, ctx:BeatParser.BiggerThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Different.
    def visitDifferent(self, ctx:BeatParser.DifferentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#Equal.
    def visitEqual(self, ctx:BeatParser.EqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#LowerEq.
    def visitLowerEq(self, ctx:BeatParser.LowerEqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#BiggerEq.
    def visitBiggerEq(self, ctx:BeatParser.BiggerEqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#funcall.
    def visitFuncall(self, ctx:BeatParser.FuncallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#funcdef.
    def visitFuncdef(self, ctx:BeatParser.FuncdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#argdef.
    def visitArgdef(self, ctx:BeatParser.ArgdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#writeargs.
    def visitWriteargs(self, ctx:BeatParser.WriteargsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#argcall.
    def visitArgcall(self, ctx:BeatParser.ArgcallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#while.
    def visitWhile(self, ctx:BeatParser.WhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#for.
    def visitFor(self, ctx:BeatParser.ForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by BeatParser#text.
    def visitText(self, ctx:BeatParser.TextContext):
        return self.visitChildren(ctx)



del BeatParser