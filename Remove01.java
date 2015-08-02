
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Remove01 {
      public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        String s=br.readLine();
        int l=s.length();
        while(s.contains("01")||s.contains("10"))
        {if(s.contains("01"))
            s = s.replaceFirst("01", "");
        else 
       s = s.replaceFirst("10", "");
       
            //System.out.println(s);
            l-=2;
        }
        System.out.println(l);
    }
  }
}
