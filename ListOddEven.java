
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class ListOddEven {


public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
       
        String[] s=br.readLine().split(" ");
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        for(int i=0;i<s.length;i++)
        {
            long tx=Integer.parseInt(s[i]);
            if(tx%2==0)
                a.add(tx);
            else
                b.add(tx);
        }
        long cnt=0;
        for(int i=0;i<a.size();i++)
        {
            long tx=Integer.parseInt(a.get(i).toString());
            System.out.print(tx+" ");
            cnt+=tx;
        }
        System.out.print(cnt+" ");
        cnt=0;
        for(int i=0;i<b.size();i++)
        {
            long tx=Integer.parseInt(b.get(i).toString());
            System.out.print(tx+" ");
            cnt+=tx;
        }
        
        System.out.print(cnt+" ");
    
   
}

}
