
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseDash {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    for(int j=0;j<s.length();j++)
    {   
        System.out.print(s.charAt(j));
        if(j<s.length()-1)
            System.out.print("-");
    }
    System.out.println("");
    for(int j=s.length()-1;j>=0;j--)
    {   
        System.out.print(s.charAt(j));
        if(j>0)
            System.out.print("-");
    }
    System.out.println("");
}
}
