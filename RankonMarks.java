
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class RankonMarks {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer t=Integer.parseInt(br.readLine());
    String[] s=br.readLine().split(" ");
        int[] a=new int[t];
       Arrays.fill(a, 1);
        for(int i=0;i<t;i++)
        {
            for(int k=0;k<t;k++)
            {
                int x=Integer.parseInt(s[i]);
                int y=Integer.parseInt(s[k]);
                if(x<y)
                a[i]++;
            }
        }
    for(int j=0;j<t;j++)
        System.out.println(a[j]);
    }     
}