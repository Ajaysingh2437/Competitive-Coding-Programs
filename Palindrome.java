
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Palindrome {
   public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    String[] s=new String[t];
    for(int j=0;j<t;j++)
        s[j]=br.readLine();
    int cnt=0;
    for(int j=0;j<t;j++)
    {
        String temp="";
        for(int k=s[j].length()-1;k>=0;k--)
            temp+=s[j].charAt(k);
    for(int i=j+1;i<t;i++)
    {
        if(temp.equals(s[i]))
            cnt++;
    }
    }
       System.out.println(cnt);
    
   }
}
