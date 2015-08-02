
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OrDishFrnd {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        String s = br.readLine();
        String[] s1=s.split(" ");
        int f=Integer.parseInt(s1[0]);
        int d=Integer.parseInt(s1[1]);
        Integer sum=0,cnt=0;
        for(int i=0;i<f;i++)
            sum|=Integer.parseInt(br.readLine());
        s=sum.toString();
        for(int i=0;i<d;i++)
            if(s.charAt(i)=='1')
                cnt++;
        System.out.println(cnt);
    }
}
}
