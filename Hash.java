
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Hash {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        int n=Integer.parseInt(br.readLine());
        int cnt=0;
        String[] s=br.readLine().split(" ");
        Integer[] arr=new Integer[10];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++)
        {
            Integer x=Integer.parseInt(s[i])-1;
            if(arr[x%10]==0)
                arr[x%10]=1;
            else
                cnt++;
    
        }
        System.out.println(cnt);
    }   }
}
