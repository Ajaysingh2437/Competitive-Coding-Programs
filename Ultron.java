import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ultron {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        int cnt=0;
        
        long n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
                cnt+=i;
        }
        System.out.println(cnt);
    }
   
}

}

