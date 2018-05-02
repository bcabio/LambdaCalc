public class LambdaNode {
  String nodetype; // "num", "plus', "minus", "multiply", "divide", "if"
  double value;
  LambdaNode child1, child2, child3;

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

}
