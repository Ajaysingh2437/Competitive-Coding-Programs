
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Enlight{

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    String[] s1=s.split(" ");
    int t=Integer.parseInt(s1[0]);
    int n=Integer.parseInt(s1[1]);
    //ArrayList a=new ArrayList(t);
    String s2=br.readLine();
    String[] s3=s2.split(" ");
    System.out.println(t-1);
}
}
