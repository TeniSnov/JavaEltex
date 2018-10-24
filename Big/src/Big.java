import java.math.*;
import java.util.*;
class Big{
  public static void main(String[] args) {
    BigInteger tmp = new BigInteger("2");
    BigInteger b = new BigInteger("2");
    int i;
    for(i=0;i<1000;i++) {
        tmp = tmp.multiply(b);
    }
    System.out.println(tmp);
  }
}
