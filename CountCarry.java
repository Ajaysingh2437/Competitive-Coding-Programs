
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CountCarry {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        String[] s=br.readLine().split(" ");
        char[] a=s[0].toCharArray();
        char[] b=s[1].toCharArray();
        int c=0,cnt=0;
        for(int i=a.length-1;i>=0;i--)
        {
            int t1=(int)a[i]-48;
            int t2=(int)b[i]-48;
            if((t1+t2+c)>9){
            cnt++;
            c=1;
            }
            else
                c=0;
        }
        if(cnt==0)
            System.out.println("No carry operation");
        else
            if(cnt==1)
                System.out.println("1 carry operation");
        else
                
        System.out.println(cnt+" carry operations");
    }
}

}

