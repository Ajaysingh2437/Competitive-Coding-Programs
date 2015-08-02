
import com.sun.jmx.snmp.BerEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

class ByteLandRemove {
       public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int t1=Integer.parseInt(s[0]);
        int t2=Integer.parseInt(s[1]);
        ArrayList a=new ArrayList();
    for(int j=0;j<t1;j++)
    {
        a.add(j+1);
    }    
    s=br.readLine().split(" ");
    for(int j=0;j<t2;j++)
    {
        for(int k=0;k<s.length;k++)
        {
            int t=Integer.parseInt(s[k]);
            
        }    
    }
}
}