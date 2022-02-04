grammar Beat;
root            :       functiondef+ #treeroot
                ;

stat            :       expr  # statexpr
                |       ID '=' (expr | relational)  # assign
                |       'write' '(' wargs ')'   # write
                |       'read' '(' ID ')'  # read
                |       'array' '(' ID ',' expr')' #newarray
                |       'set' '(' ID ',' expr ',' expr ')' #setarrayvalue
                |       relational  # relat
                |       loop  # bucle
                |       condicional  # cond
                |       functiondef #fdef
                ;

expr            :       <assoc=right> expr ELEV expr # Potencia
                |       expr PER expr # Producte
                |       expr ENTRE expr # Divisio
                |       expr MENYS expr # Resta
                |       expr MES expr # Suma
                |       expr MOD expr # Mod
                |       NUM # Valor
                |       'get' '(' ID ',' expr ')' #getarrayvalue
                |       functioncall  #funcio
                |       ID # id
                ;

condicional     :       'if' '(' relational ')' '{'  statblock '}' ('else' '{'  statblock '}')?#if
                ;

statblock       :       stat* # stblock
                ;

relational      :       expr '<' expr # LowerThan
                |       expr '>' expr # BiggerThan
                |       expr '<>' expr # Different
                |       expr '==' expr # Equal
                |       expr '<=' expr # LowerEq
                |       expr '>=' expr # BiggerEq
                ;

functioncall    :       ID '(' arguments? ')' #funcall
                ;

functiondef     :       'void' ID '(' argumentsdef? ')'  '{' statblock '}' #funcdef
                ;

argumentsdef    :       ID ( ',' ID)* #argdef
                ;

wargs           :       (expr | relational | anytext) (',' (expr | relational | anytext))*    # writeargs
                ;

arguments       :       expr ( ',' expr)* #argcall
                ;

loop            :       'while' '(' relational ')'  '{'  statblock  '}' # while
                |       'for' '(' stat ';' relational ';' stat ')'  '{'  statblock  '}' #for
                ;

anytext         :       ANYTEXT #text
                ;
              
                
NUM             :       [0-9]+ ;
ID              :       [a-zA-Z_]+ ;
ANYTEXT         :       '"' .+? '"';
ELEV            :       '^' ;
PER             :       '*' ;
ENTRE           :       '/' ;
MENYS           :       '-' ;
MES             :       '+' ;
MOD             :       '%' ;
LINE_COMMENT    :       '#' ~[\r\n]+ -> skip;
WS              :       [ \r\t\n]+ -> skip ;
ANY             :       .;