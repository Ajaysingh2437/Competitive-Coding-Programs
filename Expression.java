
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Expression {
    public static Integer getFactorial(Integer num) {
      if (num == 0) return 1;

      if (num == 1) return 1;

      return num*getFactorial(num-1);
  }
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int a=Integer.parseInt(s[0]);
    int b=Integer.parseInt(s[1]);
    int c=Integer.parseInt(s[2]);
    int sum=-1;
    int n=0;
    while(sum<0)
    {   
        sum=((n*n*a)+(n*b))-c;
        n++;
    }
    n--;
    System.out.println(getFactorial(n));
}
}
