// name must match file name
grammar Lambda;

// Grammar rules

lambdaStart returns [LambdaNode val] : 
  l1=lambda SEMI 
  { 
    $val = $l1.val; 
  }
;

atomicLambda returns [LambdaNode val] : 
    n=NUMBER 
  { LambdaNode n = new LambdaNode();
    n.setNodeType("num");
    n.setValue(Double.parseDouble($n.text));
    $val = n;
  }
  | LPAREN PLUS l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("plus");
    n.setChild1($l1.val);
    n.setChild2($l2.val);
    $val = n;
  }
  | LPAREN MINUS l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("minus");
    n.setChild1($l1.val);
    n.setChild2($l2.val);
    $val = n;
  }
  | LPAREN TIMES l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("multiply");
    n.setChild1($l1.val);
    n.setChild2($l2.val);
    $val = n;
  }
  | LPAREN DIV l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("divide");
    n.setChild1($l1.val);
    n.setChild2($l2.val);
    $val = n;
  }
;

applicationLambdas :
  atomicLambda
  | applicationLambdas atomicLambda
;


definition returns [LambdaNode val] :
  LAMBDA VAR DOT LPAREN applicationLambdas RPAREN 
  {

  }
;

lambda returns [LambdaNode val]: 
  LAMBDA VAR DOT l1=lambda 
  {
    $val = $l1.val;
  }
  | applicationLambdas
;

binding : 
  VAR EQUALS lambda
;

bindings :
  binding
  | binding COMMA bindings
;



// Lexer rules
// fragments are not tokens
fragment VALID_ID_START : ('a'..'z') | ('A'..'Z') | '_';
fragment VALID_ID_CHAR : VALID_ID_START | ('0'..'9');
fragment D          : ('d') ;
fragment E          : ('e') ;
fragment F          : ('f') ;

//tokens
NUMBER : ('0'..'9')+;
LPAREN : '(';
RPAREN : ')';
SEMI : ';';
PLUS : '+';
MINUS : '-';
TIMES : '*';
DIV : '/';
VAR : VALID_ID_START VALID_ID_CHAR;
DEF : 'def';
LAMBDA : '\\';
DOT : '.';
EQUALS : '=';
COMMA : ',';

//ID : VALID_ID_START VALID_ID_CHAR*;
//White Space
WS : [ \r\n\t]+ -> skip;
