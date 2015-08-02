
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class DayOfWeek {
         public static void main(String[] args) throws IOException, ParseException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
                     
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        String[] s=br.readLine().split(" ");
        String s1=s[0]+"/"+s[1]+"/"+s[2];
        SimpleDateFormat df = new SimpleDateFormat( "dd/MM/yyyy" );  
        Date dt=df.parse(s1);
        System.out.println(dt.getDay());
        
    }
  }
}
