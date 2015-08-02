
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class MagicCandy {
    

    
   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long t=Integer.parseInt(br.readLine());
        while(t!=0)
        {
            String[] s=br.readLine().split(" ");
            long size=Integer.parseInt(s[0]);
            long k=Integer.parseInt(s[1]);
            String[] s1=br.readLine().split(" ");
            int[] arr=new int[s1.length];
            for(int i=0;i<size;i++)
                arr[i]=Integer.parseInt(s1[i]);
            int cnt=0;
            while(k!=0)
            {
                Arrays.sort(arr);
                cnt+=arr[arr.length-1];
                arr[arr.length-1]=arr[arr.length-1]/2;
            k--;
            }
            System.out.println(cnt);
        t--;
        }
        
    }
    
    
    
    
}   

