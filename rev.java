
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class rev {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
       String s = br.readLine();
       String reverse = s.substring(s.length()-1);
      int length = s.length();
      for ( int i = length - 2 ; i >= 0 ; i-- )
         reverse =reverse+s.charAt(i);
      System.out.println(reverse);
   }
}

}

