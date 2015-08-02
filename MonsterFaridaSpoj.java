
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MonsterFaridaSpoj {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    int cas=1;
    for(int j=0;j<t;j++)
    {   
        int n=Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] s1=s.split(" ");
        int[] a=new int[n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i=i+2)
            sum1+=Integer.parseInt(s1[i]);
        for(int i=1;i<n;i=i+2)
            sum2+=Integer.parseInt(s1[i]);
        if(sum1>sum2)
            System.out.println("Case "+(cas++)+": "+sum1);
        else
            System.out.println("Case "+(cas++)+": "+sum2);
        
    }
    }
}
