
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class DiffPer {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        int cnt=0;
        
        int n=Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] s1=s.split(" ");
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int x=Integer.parseInt(s1[i]);
            if(!a.contains(x)){
                a.add(x);
                cnt++;}
        }
        System.out.println(cnt);
    }
   
}

}

