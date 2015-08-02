
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Roman {
   
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
        int t=Integer.parseInt(br.readLine());
         String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int decimal[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
         for (int j=0; j<t; j++) {
    int num=Integer.parseInt(br.readLine());
    String str=null;
            for (int i=0; i<13; i++) {
            while (num >= decimal[i])
                {
                num = num-decimal[i];
                str = str+roman[i];
                }
            }
            str=str.replaceAll("null", "");
         System.out.println(str);
        }
 }
}