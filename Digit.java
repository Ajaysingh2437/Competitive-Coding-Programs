
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;


class Digit {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s = br.readLine();
       String[] s1=s.split(" ");
    long a=Integer.parseInt(s1[0]);
    long b=Integer.parseInt(s1[1]);
    long x=Integer.parseInt(s1[2]);
    long y=Integer.parseInt(s1[3]);
    long k=Integer.parseInt(s1[4]);
    long i=0,cnt=0;
    for ( i = a ; i <= b ; i++ )
    {
    if(i%k==0)
        break;
    }
    for (  ; i <= b ; i=i+k )
    {
        long sum=0;
        long in=i;
    while(in!=0){
        long ld=in%10;
    sum+=ld;
    in/=10;
    }
        if(sum>=x&&sum<=y)
            cnt++;
    }
    System.out.println(cnt);
  }

}

