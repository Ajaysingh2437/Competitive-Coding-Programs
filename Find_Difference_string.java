
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Find_Difference_string {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        String a=br.readLine();
        String b=br.readLine();
        int cnt=0;
        for(int i=0;i<Math.min(b.length(), a.length());i++)
    {   
    if(a.charAt(i)!=b.charAt(i))
        cnt++;
    }
        System.out.println(cnt);
    
}
}
