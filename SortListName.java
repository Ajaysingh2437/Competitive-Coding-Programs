import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class SortListName {
    

    
   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long t=Integer.parseInt(br.readLine());
        ArrayList a=new ArrayList();
    for(long j=0;j<t;j++)
       a.add(br.readLine());
    Collections.sort(a);
    String[] s=new String[a.size()];
    for(int j=0;j<a.size();j++)
        s[j]=a.get(j).toString();
    for(int j=0;j<s.length-1;j++)
    {    for(int i=0;i<s.length-1;i++)
    {
        String[] s1=s[i].split(" ");
        String[] s2=s[i+1].split(" ");
        int f=Integer.parseInt(s1[1]);
        int g=Integer.parseInt(s2[1]);
        if(f<g)
        {    String tx=s[i+1];
        s[i+1]=s[i];
        s[i]=tx;
            System.out.println("swap:"+s[i]);
        }
    }
    }
     for(int j=0;j<s.length;j++)
    {
        System.out.println(s[j]);
    }
    
    }
    
    
}   



