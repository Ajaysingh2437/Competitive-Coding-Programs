import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class EncPoly{

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    
    for(int i=0;i<t;i++)
    {long sum=0;
        String s=br.readLine();
        String[] s1=s.split(" ");
        int a=Integer.parseInt(s1[0]);
        int b=Integer.parseInt(s1[1]);
        int c=Integer.parseInt(s1[2]);
        long k=Integer.parseInt(s1[3]);
        int x=0;
    while(sum<k)
    {
     sum=((a*(x*x))+(b*x)+c);
        x++;
    }
            System.out.println(x-1);
    }
}

}