
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class ChefString {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       long t= Integer.parseInt(br.readLine());
       for(long i=0;i<t;i++)
       {
           String s1=br.readLine();
           String s2=br.readLine();
           int cntmin=0,cntmax=0;
           for(int j=0;j<s1.length();j++){
               if(s1.charAt(j)!='?'&&s2.charAt(j)!='?'&&s1.charAt(j)!=s2.charAt(j))
                   cntmin++;
           if(s1.charAt(j)=='?'||s2.charAt(j)=='?')
                   cntmax++;
           }
           System.out.println(cntmin+" "+(cntmin+cntmax));
       }
    }
}
