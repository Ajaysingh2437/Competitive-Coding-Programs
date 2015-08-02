
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class SubstringMatch {
 public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    int tx=Integer.parseInt(br.readLine());
    for(int p=0;p<tx;p++)
    {
    String[] s=br.readLine().split(" ");
    String str1=str.substring(Integer.parseInt(s[0])-1, Integer.parseInt(s[1]));
    String str2=str.substring(Integer.parseInt(s[2])-1, Integer.parseInt(s[3]));
    if(str1.equals(str2))
            System.out.println("Yes");
    else
            System.out.println("No");
    }
 }
}

