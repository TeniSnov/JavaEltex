import java.util.*;
class Main{
  public static void main(String[] args) {
    ArrayList<Integer> test1 = new ArrayList();
    TreeSet<Integer> test2 = new TreeSet();
    LinkedList<Integer> test3 = new LinkedList();
    int i;
    for(i=0;i<1000000;i++){
      test1.add(i);
      test2.add(i);
      test3.add(i);
    }
    System.out.print("Время добавления в ArrayList: ");
    long s = System.nanoTime();
    test1.add(1686213);
    long f = System.nanoTime();
    long rez = f-s;
    System.out.print(rez);
    System.out.println("мс");
    System.out.print("Время удаления из ArrayList: ");
    s = System.nanoTime();
    test1.remove(3);
    f = System.nanoTime();
    rez = f-s;
    System.out.print(rez);
    System.out.println("мс");
    System.out.print("Время добавления в TreeSet: ");
    s = System.nanoTime();
    test2.add(1686213);
    f = System.nanoTime();
    rez = f-s;
    System.out.print(rez);
    System.out.println("мс");
    System.out.print("Время удаления из TreeSet: ");
    s = System.nanoTime();
    test2.remove(2);
    f = System.nanoTime();
    rez = f-s;
    System.out.print(rez);
    System.out.println("мс");
    System.out.print("Время добавления в LinkedList: ");
    s = System.nanoTime();
    test3.add(1686213);
    f = System.nanoTime();
    rez = f-s;
    System.out.print(rez);
    System.out.println("мс");
    System.out.print("Время удаления из LinkedList: ");
    s = System.nanoTime();
    test3.remove(3);
    f = System.nanoTime();
    rez = f-s;
    System.out.print(rez);
    System.out.println("мс");
  }
}
