
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class LexicographIntegers {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer t=Integer.parseInt(br.readLine());
for(int j=0;j<t;j++)
    {
        Integer n=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
}
    
