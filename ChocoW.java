
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class ChocoW {
   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
        int t=Integer.parseInt(br.readLine());
        ArrayList a=new ArrayList();
        String[] s=br.readLine().split(" ");
        for(int j=0;j<t;j++)
        a.add(s[j]);
        
    int x=Integer.parseInt(br.readLine());
        
    for(int j=0;j<x;j++)
    {
        String cv=br.readLine();
        //String[] arr;
            //Object[] toArray = a.toArray(arr);
        if(a.contains(cv))
            System.out.println("I Hate You");
        else
        {
         int i=0;
            for(i=0;i<t;i++)
            {
             int k=0;
                for(k=0;k<t&&k!=i;k++)
                {
                    if(Integer.parseInt(a.get(i).toString())+Integer.parseInt(a.get(k).toString())==Integer.parseInt(cv))
                        
                    break;
                }
                if(k!=t)
                {    System.out.println("I Hate You");
                break;
                }
                }
            if(i==t)
            System.out.println("I Hate You");
    
            }
            
        }
    }
}   

