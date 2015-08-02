
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class pokemon {
  public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int tx=Integer.parseInt(br.readLine());
    for(int p=0;p<tx;p++)
    {
    int t=Integer.parseInt(br.readLine());
    int cnt=0;
        ArrayList a=new ArrayList();
    for(int i=0;i<t;i++)
    {
    
    String[] s=br.readLine().split(" ");
    a.add(s[0]);
    if(!a.contains(s[1]))
        cnt++;
    }
        System.out.println(cnt);
    }
  }
}
