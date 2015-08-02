
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringMan {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String[] s=br.readLine().split(" ");
    Integer t1=Integer.parseInt(s[0]);
    Integer t2=Integer.parseInt(s[1]);
    String str=br.readLine();
    String str1 = null;
    for(int i=0;i<t2;i++)
    {
        s=br.readLine().split(" ");
        if(s[0].equals("0")){
            str1=str.substring(0,Integer.parseInt(s[1])-1);
            str=str1+s[2]+str.substring(Integer.parseInt(s[1]),s.length);
        }
        else
        {
            str1=str.substring(Integer.parseInt(s[1])-1,Integer.parseInt(s[2]));
            System.out.println(str1.substring(Integer.parseInt(s[3])-1,Integer.parseInt(s[3])));
        }
        
    }
}
}
