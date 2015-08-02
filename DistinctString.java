
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class DistinctString {

   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
        ArrayList a=new ArrayList();
        int cnt=0;
    for(int j=0;j<t;j++)
    {
        String s=br.readLine();
        if(!a.contains(s))
       a.add(s);
        cnt++;
    }
        System.out.println(cnt);
    }
}   

    
