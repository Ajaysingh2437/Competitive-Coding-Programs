
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class MonkFrnd {
 

    
   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long t=Integer.parseInt(br.readLine());
        while(t!=0)
        {
            String[] s=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            String[] s1=br.readLine().split(" ");
            ArrayList a=new ArrayList();
            for(int i=0;i<n;i++)
                a.add(s1[i]);
            for(int i=n;i<n+m;i++)
            {
                if(a.contains(s1[i]))
            System.out.println("YES");
                else
                {
                    a.add(s1[i]);
             System.out.println("NO");
                }   
            }
            
        t--;
        }
        
    }
       

   
}
