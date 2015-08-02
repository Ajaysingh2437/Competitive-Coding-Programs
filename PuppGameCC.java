
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PuppGameCC {
      public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long t=Integer.parseInt(br.readLine());
    for(long j=0;j<t;j++)
    {   
        String s = br.readLine();
        String[] s1=s.split(" ");
        Long a=Long.parseLong(s1[0]);
        Long b=Long.parseLong(s1[1]);
        if(b%2==0)
            System.out.println("Tuzik");
        else
            System.out.println("Vanka");
    }
}
}