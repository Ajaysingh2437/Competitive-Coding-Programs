
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

 class ArrayListSortedName {
    
   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long x=Integer.parseInt(br.readLine());
    while(x!=0){
        long t=Integer.parseInt(br.readLine());
        ArrayList a=new ArrayList();
    for(long j=0;j<t;j++)
    {
        String s=br.readLine();
        if(!a.contains(s))
       a.add(s);
    }
    Collections.sort(a);
    for(int j=0;j<a.size();j++)
    {
        System.out.println(a.get(j).toString());
    }
    x--;
    }
    }
    
    
}   

