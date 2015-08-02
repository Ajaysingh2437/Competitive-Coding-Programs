
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EvenDiv {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        int cnt=0;
        int n=Integer.parseInt(br.readLine());
        if(n%2==1)
            System.out.println(0);
        else
        {
        for(int i=n;i>1;i=i/2)
        {
            if(i%2==0)
            cnt++;
        }
        System.out.println(cnt);
        }
    }
}

}
