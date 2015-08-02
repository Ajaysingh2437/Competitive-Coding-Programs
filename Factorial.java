
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Factorial {
public static BigInteger getFactorial(BigInteger num) {
      if (num.intValue() == 0) return BigInteger.valueOf(1);

      if (num.intValue() == 1) return BigInteger.valueOf(1);

      return num.multiply(getFactorial(num.subtract(BigInteger.valueOf(1))));
  }
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        Factorial fx=new Factorial();
        int f=Integer.parseInt(br.readLine());
        BigInteger b=BigInteger.valueOf(f);
        System.out.println(Factorial.getFactorial(b));
    }
    }
    
}
