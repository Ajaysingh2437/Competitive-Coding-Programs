
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RowColMajorAdd {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        String[] s = br.readLine().split(" ");
        int m=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        int cnt=1,sum=0;
        for(int i=0;i<m;i++)
        {
            for(int k=0;k<m;k++)
            {
                a[i][k]=cnt;
                b[k][i]=cnt;
                cnt++;
                    //sum+=a[i][k]+b[i][k];
            }
    }
        for(int i=0;i<Math.min(m, n);i++)
            sum+=a[i][i]+b[i][i];
        System.out.println(sum);
    }
}
}
