
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Vnumber {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        long x = Integer.parseInt(br.readLine());
        long k=x;
        int cnt=0;
        while(k!=0){
        long ld=k%10;
    k/=10;
    cnt++;
    } k=x;
        long[] a=new long[cnt];
        int i=0;
        while(k!=0){
        a[i]=k%10;
    k/=10;
    i++;
    }
        if(cnt%2==0)
        {
            long sum1=0,sum2=0;
            for(int h=0;h<(cnt/2);h++)
                sum1+=a[h];
            
            for(int h=(cnt/2);h<cnt;h++)
                sum2+=a[h];
            if(sum1==sum2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
        {
        long sum1=0,sum2=0;
            for(int h=0;h<=(cnt/2);h++)
                sum1+=a[h];
            for(int h=(cnt/2);h<cnt;h++)
                sum2+=a[h];
            if(sum1==sum2)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
   
}

}

