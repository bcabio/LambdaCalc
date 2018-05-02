import java.util.HashMap;
import java.util.ArrayList;

public class LambdaNode {
  String nodetype; // "num", "plus', "minus", "multiply", "divide", "if"
  double value;
  LambdaNode child1, child2, child3;
  LambdaNode parent;
  ArrayList<LambdaNode> applicationBody;

  HashMap<String,LambdaNode> context;

  LambdaNode () {
  }

  public void setNodeType(String n) {
    nodetype = n;
  }

  public void setValue(double v) {
    value = v;
  }

  public void setChild1(LambdaNode n) {
    child1 = n;
  }

  public void setChild2(LambdaNode n) {
    child2 = n;
  }

  public void setChild3(LambdaNode n) {
    child3 = n;
  }

  public String getNodeType() {
    return nodetype;
  }

  public double getValue() {
    return value;
  }

  public LambdaNode getChild1() {
    return child1;
  }

  public LambdaNode getChild2() {
    return child2;
  }

  public LambdaNode getChild3() {
    return child3;
  }


  public void setParent(LambdaNode n) {
    this.parent = n;
  }

  public LambdaNode getParent() {
    return this.parent;
  }


  // Class methods for acquiring context
  public HashMap<String, LambdaNode> getContext() {
    return context;
  }

  public void setContext(HashMap<String,LambdaNode> ctx) {
    this.context = ctx;
  }


  public void addToContext(String variableName, LambdaNode n) {
    this.context.put(variableName, n); // edit to check for existing things in setContext
  }

  // Class methods for lambda applications
  public void setApplicationBody(ArrayList<LambdaNode> ab) {
    applicationBody = ab;
  }

  public ArrayList<LambdaNode> getApplicationBody() {
    return applicationBody;
  }

}
