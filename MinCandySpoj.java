
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class MinCandySpoj {
    
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    while(n!=0)
    {
        String[] s1=br.readLine().split(" ");
        String[] s2=br.readLine().split(" ");
        Integer[] a=new Integer[n];
        Integer[] b=new Integer[n];
        Integer[] c=new Integer[n];
        int i=0;
        for(String s: s1)
        {
            a[i]=Integer.parseInt(s);
            i++;
        }
        i=0;
        for(String s: s2)
        {
            b[i]=Integer.parseInt(s);
            i++;
        }
        Arrays.sort(a);
        Arrays.sort(b);    
        Integer k=0,m=0;
        i=n-1;
        for(int x: b)
            c[i--]=x;
        k=0;
        for(i=n-1;i>=n/2;i--){
            k+=a[i]*c[i];
            m+=a[i-n/2]*c[i-n/2];
        }
        System.out.println((k+m));
        n=Integer.parseInt(br.readLine());
    }
}
}
