import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



class Monkiness{

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    int n=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++)
    {
            String s=br.readLine();
    String[] s1=s.split(" ");
    ArrayList a=new ArrayList(n);
    String s2=br.readLine();
    String[] s3=s2.split(" ");
        for(int j=0;j<n;j++)
        {
    a.add(Integer.parseInt(s1[j]));
        }   
        int j=0;
        int x=0;
        for(j=0;j<n;j++)
        {
        x=Integer.parseInt(s3[j]);
        if(a.contains(x))
            break;
        }
        
        System.out.println(j);
    }
}

}