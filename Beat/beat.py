import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from BeatLexer import BeatLexer
from BeatParser import BeatParser
from BeatEvalVisitor import BeatEvalVisitor

source_file = ""

class WrongArguments(Exception):
    pass

try:
    if len(sys.argv) != 2: raise WrongArguments
    else: source_file = sys.argv[1]
except WrongArguments:
    print("USAGE: llull.py source.llull [main_name args..]")
    print()
    raise
    
with open(source_file) as sf:
    content = sf.read()
    input_stream = InputStream(content)

    lexer = BeatLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = BeatParser(token_stream)
    tree = parser.root()
    visitor = BeatEvalVisitor()
    print(Trees.toStringTree(tree, None, parser))
    visitor.visit(tree)