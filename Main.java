
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        String s = br.readLine();
        int[] a=new int[s.length()];
        Arrays.fill(a, 0);
        if(s.charAt(0)=='O')
            a[0]=1;
        int sum=0;
        sum+=a[0];
        for(int i=1;i<s.length();i++)
        {   
            if(s.charAt(i)=='O')
            a[i]=a[i-1]+1;
            sum+=a[i];
        }
        System.out.println(sum);
    }    
}
}
