
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListName {
   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
    for(int j=0;j<t;j++)
    {
       a.add(br.readLine());
    }
    Collections.sort(a);
        for (Object a1 : a) {
            String x = a1.toString();
            if(!b.contains(x))
                b.add(x);
        }
for(int j=0;j<b.size();j++)
    {
        String x=b.get(j).toString();
            System.out.println(x+" "+Collections.frequency(a, x));
         
    }
    }
}   

