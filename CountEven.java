
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountEven {
  public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    for(int j=0;j<s.length();j++)
    {   
        int cnt=0;
        for(int i=j;i<s.length();i++)
        {
            if(((int)s.charAt(i))%2==0)
                cnt++;
        }    
        System.out.print(cnt+" ");
    }
  }
}
