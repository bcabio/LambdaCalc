// name must match file name
grammar Lambda;

// Grammar rules

lambdaStart returns [LambdaNode value] : 
    l1=atomicLambda SEMI { $value = $l1.value; };

atomicLambda returns [LambdaNode value] : 
    n=NUMBER 
  { LambdaNode n = new LambdaNode();
    n.setNodeType("num");
    n.setValue(Double.parseDouble($n.text));
    $value = n;
  }
  | LPAREN PLUS l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("plus");
    n.setChild1($l1.value);
    n.setChild2($l2.value);
    $value = n;
  }
  | LPAREN MINUS l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("minus");
    n.setChild1($l1.value);
    n.setChild2($l2.value);
    $value = n;
  }
  | LPAREN TIMES l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("multiply");
    n.setChild1($l1.value);
    n.setChild2($l2.value);
    $value = n;
  }
  | LPAREN DIV l1=atomicLambda l2=atomicLambda RPAREN
  { LambdaNode n = new LambdaNode();
    n.setNodeType("divide");
    n.setChild1($l1.value);
    n.setChild2($l2.value);
    $value = n;
  }
;

// Lexer rules
// fragments are not tokens
//fragment VALID_ID_START : ('a'..'z') | ('A'..'Z') | '_';
//fragment VALID_ID_CHAR : VALID_ID_START | ('0'..'9');
fragment I          : ('I'|'i') ;
fragment F          : ('F'|'f') ;
//tokens
NUMBER : ('0'..'9')+;
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
SEMI : ';';
PLUS : '+';
MINUS : '-';
TIMES : '*';
DIV : '/';
IF : I F;
//ID : VALID_ID_START VALID_ID_CHAR*;
//White Space
WS : [ \r\n\t]+ -> skip;
