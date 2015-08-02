
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Group {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++)
    {
        int tx=Integer.parseInt(br.readLine());
    String[] s=br.readLine().split(" ");
        int[] a=new int[tx];
        for(int k=0;k<tx;k++)
        a[k]=Integer.parseInt(s[k]);
        int cnt=0;
        for(int k=0;k<tx;k++)
            {
                for(int l=k+1;l<tx;l++)
                {
                    if(a[k]!=a[l]&&(a[k]+a[l])%2==0)
                        cnt++;
                }
            }
        System.out.println(cnt);
    }
}    
}
