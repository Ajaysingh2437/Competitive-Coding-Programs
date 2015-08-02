import java.io.*;
class chandu
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        String s = br.readLine();
 
        s = s + " "; 
        int l=s.length(); 
        String ans=""; 
        char ch1,ch2;
 
        for(int i=0; i<l-1; i++)
        {
            ch1=s.charAt(i); 
            ch2=s.charAt(i+1); 
            if(ch1!=ch2)
            {
            ans = ans + ch1;
            }
        }
        System.out.println(ans);
    }
    }
}