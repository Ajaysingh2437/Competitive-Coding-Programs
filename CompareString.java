
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CompareString {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++)
    {
    String s1=br.readLine();
    String s2=br.readLine();
    if(s1.equals(s2))
            System.out.println("Exact");
    else
    {
        long ct=0,j=0;
        for(;j<Math.min(s1.length(), s2.length());j++)
        {
            if(s1.charAt((int) j)!=s2.charAt((int) j))
                ct++;
        }
        int x=Math.max(s1.length(), s2.length());
        ct+=x-j;
        System.out.println("Not Exact"+" "+ct);
    }
}}
}
