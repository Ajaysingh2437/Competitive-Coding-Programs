
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Funny {
    public static int hex2decimal(String s) {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++) {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
         }
 public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        Integer n = Integer.parseInt(br.readLine());
        String s1=Integer.toBinaryString(n);
        int k=hex2decimal(n.toString());
        String s2 = Integer.toBinaryString(k);
        int b1=0,b2=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1')
                b1++;
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='1')
             b2++;
        }
        System.out.println(b1+" "+b2);
    }
}
}