
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

 class Frequency {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        ArrayList a=new ArrayList();
        int[] arr=new int[t];
        Arrays.fill(arr, 0);
        for(int i=0;i<t;i++)
        {
            if(a.contains(s[i]))
            arr[a.indexOf(s[i])]+=1;
            else
            {
            a.add(s[i]);
            arr[a.indexOf(s[i])]+=1;
            }
        }
        String[] s2=new String[a.size()];
        for(int i=0;i<a.size();i++)
        {
            s2[i]=a.get(i).toString();
        }
        
        for(int i=0;i<a.size();i++)
        {
         for(int j=0;j<a.size()-1;j++)
        {
            if(arr[j]<arr[j+1])
            {
                String tmp;
                int tp;
                tmp=s2[j];
                tp=arr[j];
                
                s2[j]=s2[j+1];
                arr[j]=arr[j+1];
                
                s2[j+1]=tmp;
                arr[j+1]=tp;
                
            }
            
        }
         
         
        }
        for(int j=0;j<a.size();j++)
        {
            System.out.println(s2[j]+" "+arr[j]);
        }
    }
 }
