
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class CycleNo {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        long n=Integer.parseInt(s[0]);
        long m=Integer.parseInt(s[1]);
        ArrayList a=new ArrayList();
        for(long i=0;i<n;i++)
            a.add(i+1);
        long i=m-1;
        while(a.size()>1)
        {
            a.remove(i);
            i=(i+m-1)%a.size();
        }
        System.out.println(a.get(0).toString());
    }
    
}
