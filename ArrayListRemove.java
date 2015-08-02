
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class ArrayListRemove {
 public static void main(String[] args) throws IOException {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    ArrayList a=new ArrayList();
    for(Integer j=1;j<=t;j++)
    {   
        a.add(j.toString());
    }
    int n=Integer.parseInt(br.readLine());
    for(int j=0;j<n;j++)
    {   
        String s = br.readLine();
        String[] s1=s.split(" ");
        a.remove(s1[1]);
    }  
     System.out.println(a.size());
}
}
