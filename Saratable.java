
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Saratable {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long t=Long.parseLong(br.readLine());
    for(int j=0;j<t;j++)
    {
        String[] s=br.readLine().split(" ");
        long a=Long.parseLong(s[0]);
        long b=Long.parseLong(s[1]);
        long n=Long.parseLong(s[2]);
        long c=b-a;
        c=a+((n-1)*c);
        System.out.println(c);
    }
    }
}
