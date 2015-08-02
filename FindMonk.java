
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


class FindMonk{

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    String[] s1=s.split(" ");
    int t=Integer.parseInt(s1[0]);
    int n=Integer.parseInt(s1[1]);
    ArrayList a=new ArrayList(t);
    String s2=br.readLine();
    String[] s3=s2.split(" ");
    for(int j=0;j<t;j++)
    {a.add(Integer.parseInt(s3[j]));
        
    }
    for(int j=0;j<n;j++)
    {long x=Integer.parseInt(br.readLine());
        if(a.contains(x))
        System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
}
