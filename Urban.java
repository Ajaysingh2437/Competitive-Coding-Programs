
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Urban {

     public static void main(String args[])throws IOException
    {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int x=Integer.parseInt(br.readLine());
            int m=0;
            int digcnt=0;
                  while(x!=0){
        int ld=x%10;
    digcnt++;
    x/=10;
    }
                  int[] tx=new int[digcnt];
           int cnt=0;
            Arrays.fill(tx, 0);
           
            while(x!=0){
        int ld=x%10;
    tx[m++]=ld;
    x/=10;
    }
            for(int j=0;j<digcnt;j++)
            {
                for(int k=0;k<digcnt;k=k%(j+1))
                {
                if((tx[j]+tx[k])%6==0)
                {
                cnt++;
                }
                }
            }
            System.out.println(cnt);
        }
    }
}