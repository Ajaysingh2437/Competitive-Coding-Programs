
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class ChefSet {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String[] s=br.readLine().split(" ");
    int t1=Integer.parseInt(s[0]);
       long t2= Integer.parseInt(s[1]);
       ArrayList<String> a=new ArrayList<>();
       for(Integer i=1;i<=t1;i++)
       {
           a.add(i.toString());
       }
       for(Integer i=0;i<t2;i++)
       {
           s=br.readLine().split(" ");
           if(s[0].equals("UNION"))
           {
               a.add(a.get(Integer.parseInt(s[1])-1)+" "+a.get(Integer.parseInt(s[2])-1));
               a.remove(Integer.parseInt(s[1])-1);
               a.add(Integer.parseInt(s[1])-1, "");
               a.remove(Integer.parseInt(s[2])-1);
               a.add(Integer.parseInt(s[2])-1, "");
           }
           else
           {
           String s2=a.get(Integer.parseInt(s[1])-1);
               //System.out.println(s2);
               String[] s3=s2.split(" ");
             int index=Integer.parseInt(s[2])-1;
             if(s3.length>1)
               System.out.println(s3[index]);
             else
                 
               System.out.println(s2);
           }
       }
    }
}