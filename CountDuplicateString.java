
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class CountDuplicateString {
     public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    ArrayList a=new ArrayList();
    ArrayList b=new ArrayList();
    int cnt=0;
    for(int j=0;j<t;j++)
    {  
        String s=br.readLine();
        if(a.contains(s))
        {    cnt++; 
        if(!b.contains(s))
            b.add(s);
        }
        else
            a.add(s);
    }
         System.out.println(cnt);
         for (Object b1 : b) {
             System.out.println(b1.toString());
         }
     }
}
