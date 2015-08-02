
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;


class MonkFood {

   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
        int[] x=new int[t];
        int[] y=new int[t];
      for(int i=0;i<t;i++)
      {
          String[] s=br.readLine().split(" ");
          int p=Integer.parseInt(s[0]);
          if(p==1)
          {
              int cnt=i;
              while(cnt!=0)
              {
              
                  if(cnt==0)
                      System.out.println("No food");
                  else
                  {
              if(x[cnt]==1)
                  cnt--;
                  else
                  {
                      System.out.println(y[cnt]);
                   x[cnt]=1;   
                   break;
                  }
                  }
              }
          }
          else
          {
          int q=Integer.parseInt(s[1]);
                  x[i]=2;
                  y[i]=q;
          }
      }
}
}