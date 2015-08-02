
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoPrime {
private static int gcd(int a, int b) {
    int t;
    while(b != 0){
        t = a;
        a = b;
        b = t%b;
    }
    return a;
}
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    int t=Integer.parseInt(br.readLine());
    String[] s = br.readLine().split(" ");
    int cnt=0;
    for(int j=0;j<t;j++)
    {   
        if(gcd(n,Integer.parseInt(s[j]))>1)
            cnt++;
    }
    System.out.println(cnt);
}



}
