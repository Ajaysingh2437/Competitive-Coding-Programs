
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MarutString {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer t=Integer.parseInt(br.readLine());
    if(t>10)
        System.out.println("Invalid Test");
    else{
        for(int j=0;j<t;j++)
        {
        String s=br.readLine();
        int cnt1=0,cnt2=0;
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90)
                cnt1++;
            if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122)
                cnt2++;
        }
        if(cnt1==0&&cnt2==0)
                System.out.println("Invalid Input");
        else{
            if(cnt1==0||cnt1==0)
                System.out.println(0);
        else
                System.out.println(Math.min(cnt1, cnt2));
        }
        }
    }
}}
//j=65;j<91 A-Z
//j=97;j<123 a-z