
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StudentMarks {
    


    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // int t=Integer.parseInt(br.readLine());
         String s = br.readLine();
       String[] s1=s.split(" ");
       int i,cnt=0,sum=0;
       Integer[] n=new Integer[s1.length];
       for(i=0;i<s1.length;i++)
       {
           n[i]=Integer.parseInt(s1[i]);
           if(n[i]>0)
               break;
       }
        if(i==s1.length)
            System.out.println(0);
        else
        {  
        for(int k=i;k<s1.length;k++)
       {
           
         n[k]=Integer.parseInt(s1[k]);
           if(n[k]<0)
               cnt++;
           if(cnt==2) 
               break;
           
           sum+=n[k];
               
       }
            System.out.println(sum);
        
       }
        }
            
    }

