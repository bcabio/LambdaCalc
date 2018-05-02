import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.BailErrorStrategy;
//import org.antlr.v4.runtime.ANTLRErrorStrategy;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Lambda {

  static boolean evalError = false;

  static public void main(String argv[]) {    
    System.out.print("Lambda> ");
    do {
      String input = readInput().trim();
      if (input.equals("exit")) 
        break;
      else input += ";";
      try {
        CharStream in = CharStreams.fromString(input);
        LambdaLexer lexer = new LambdaLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LambdaParser parser = new LambdaParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());
        LambdaNode tree = (LambdaNode) parser.lambdaStart().val;
        //Integer level = new Integer(1);
        //displayTree(tree,level);
        evalError = false;
        double answer = evalTree(tree);
        if (evalError)
          System.out.println("\nEVALUATION ERROR\n");
        else
          System.out.println("\nThe value is "+answer+"\n");
      } catch (Exception e) {
          System.out.println("\nSYNTAX ERROR\n");
          //e.printStackTrace();
        }
    } while (true); 
  }

  static double evalTree(LambdaNode t) {
    if (t.getNodeType().equals("num")) {
            System.out.println("num");

      return t.getValue();
    }
    else if (t.getNodeType().equals("plus")) {
            System.out.println("plus");

      double v1 = evalTree(t.getChild1());
      if (evalError) return 0;
      double v2 = evalTree(t.getChild2());
      if (evalError) return 0;
      return v1+v2;
    }
    else if (t.getNodeType().equals("minus")) {
            System.out.println("minus");

      double v1 = evalTree(t.getChild1());
      if (evalError) return 0;
      double v2 = evalTree(t.getChild2());
      if (evalError) return 0;
      return v1-v2;
    }
    else if (t.getNodeType().equals("multiply")) {
            System.out.println("multiply");

      double v1 = evalTree(t.getChild1());
      if (evalError) return 0;
      double v2 = evalTree(t.getChild2());
      if (evalError) return 0;
      return v1*v2;
    }
    else if (t.getNodeType().equals("divide")) {
            System.out.println("divide");

      double v1 = evalTree(t.getChild1());
      if (evalError) return 0;
      double v2 = evalTree(t.getChild2());
      if (evalError) return 0;
      if (v2 != 0)
        return v1/v2;
      else {
        evalError = true;
        return 0;
      }
    }
    else if (t.getNodeType().equals("if")) {
      double v1 = evalTree(t.getChild1());
      if (evalError) return 0;
      if (v1 != 0)
        return evalTree(t.getChild2());
      else
        return evalTree(t.getChild3());
    } 
    // else if(t.getNodeType().equals("lambda")) {
    //   // ArrayList<LambdaNode> applicationBody = 
    // }
    else { 
      evalError = true;
      return 0;
    }
  }

  static void displayTree(LambdaNode t,Integer level) {
    for (int i=1; i<level.intValue(); i++)
      System.out.print("    ");
    System.out.print("NodeType="+t.getNodeType()+"  ");
    if (t.getNodeType().equals("num"))
      System.out.println("Value="+t.value);
    else if (t.getNodeType().equals("plus") || 
             t.getNodeType().equals("minus") ||
             t.getNodeType().equals("multiply") ||
             t.getNodeType().equals("divide")) {
      System.out.println();
      int lval = level.intValue();
      lval++;
      level = new Integer(lval);
      displayTree(t.getChild1(),level);
      displayTree(t.getChild2(),level);
    }
    else {
      System.out.println("");
      int lval = level.intValue();
      lval++;
      level = new Integer(lval);
      displayTree(t.getChild1(),level);
      displayTree(t.getChild2(),level);
      displayTree(t.getChild3(),level);
    }
  }

  static String readInput() {
     try {
       StringBuffer buffer = new StringBuffer();
       System.out.flush();
       int c = System.in.read();
       while(c != ';' && c != -1) {
         if (c != '\n') 
           buffer.append((char)c);
         else {
           buffer.append(" ");
           System.out.print("Lambda> ");
           System.out.flush();
         }
         c = System.in.read();
       }
       return buffer.toString().trim();
     } catch (IOException e) {
         return "";
       }
   }
}
