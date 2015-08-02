import java.io.*;
import java.util.Arrays;
class CarNames
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        String s = br.readLine();
 int x=0;
        s = s + " "; 
        int l=s.length(); 
        String ans=""; 
        char ch1,ch2;
 int[] cnt=new int[3];
 Arrays.fill(cnt,0);
        for(int i=0; i<l-1; i++)
        {
            ch1=s.charAt(i); 
            ch2=s.charAt(i+1); 
            if(ch1!=ch2)
            {
            ans = ans + ch1;
            }
        }
        if(ans.length()>3)
        System.out.println("Not OK");
        else
        {
            for(int i=0; i<l-1; i++)
            {
                ch1=s.charAt(i); 
                ch2=s.charAt(i+1); 
                if(ch1==ch2)
                {
                cnt[x]++;
                }
                else
                    x++;
        }
            if(cnt[0]==cnt[1]&&cnt[1]==cnt[2])
                System.out.println("OK");
            else
                System.out.println("Not OK");
            
        }
            
        
    }
    }
}