
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ApGp {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String[] s=br.readLine().split(" ");
    while(!(s[0].equals("0")&&s[1].equals("0")&&s[2].equals("0")))
    {
        int a,b,c,d;
        a=Integer.parseInt(s[0]);
        b=Integer.parseInt(s[1]);
        c=Integer.parseInt(s[2]);
        if(c-b==b-a)
            System.out.println("AP "+(c+(c-b)));
        else
            System.out.println("GP "+(c*(c/b)));
        
        
        s=br.readLine().split(" ");
    }
}
}
