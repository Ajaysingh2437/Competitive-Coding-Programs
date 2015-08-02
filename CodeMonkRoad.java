
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class CodeMonkRoad {

    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
        ArrayList arr=new ArrayList();
    for(int j=0;j<t;j++)
    {
        int t1=Integer.parseInt(br.readLine());
        for(int i=0;i<t1;i++)
        {
            String[] s=br.readLine().split(" ");
            int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[1]);
            if(!arr.contains(a))
                arr.add(a);
            if(!arr.contains(b))
                arr.add(b);
        }
        System.out.println(arr.size());
    
    }
}
}