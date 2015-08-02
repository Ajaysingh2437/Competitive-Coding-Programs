

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;



public class Jump {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
       String s = br.readLine();
       String[] s1=s.split(" ");
       int cnt=0,cnt1=0;
       int n=Integer.parseInt(s1[0]);
      float p=Integer.parseInt(s1[1]);
      float o=1;
      while(n!=0)
      {
        while(n>=3)
      {
          cnt++;
          n=n-3;
          o=o*(1-(p/100));
      }
      while(n>=2)
      {
          cnt++;
      n=n-2;
      o=o*(p/100);
      }
      }
      DecimalFormat df=new DecimalFormat("0.000000");
       System.out.println(df.format(o*cnt));
}

}