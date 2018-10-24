import java.util.*;
class Main{
  public static void main(String[] args) {
    //String s ="";
    Scanner in = new Scanner(System.in);
    double a, b;
    a = in.nextDouble();
    b = in.nextDouble();
    Calc c = new Calc();
    c.add(a,b);
    System.out.println(c.getrez());
    c.min(a,b);
    System.out.println(c.getrez());
    c.mul(a,b);
    System.out.println(c.getrez());
    c.div(a,b);
    System.out.println(c.getrez());
  }
}

class Calc{
  private double rez;
  public double getrez(){
    return this.rez;
  }
  public void add(double a, double b){
    rez=a+b;
  }
  public void min(double a, double b){
    rez=a-b;
  }
  public void mul(double a, double b){
    rez=a*b;
  }
  public void div(double a, double b){
    rez=a/b;
  }
};
