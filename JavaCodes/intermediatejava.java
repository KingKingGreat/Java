// Intermediate Java
// By KingKingGreat

// Create Class Inside Class
public class IntermediateClass {
  class MyClass {
    int a = 1;
    int b = 1;
    public void calc() {
      System.out.println(a + b);
    }
    public void setVar(n, v) {
      if (n == "a") {
        a = v;
      } else if (n == "b") {
        b = v;
      } else {
        System.out.println("Error : Insert Parameters! serVar()");
      }
    }
  }

  MyClass calculate = new MyClass();

  calculate.setVar(10, 10);
  calculate.calc();
}
