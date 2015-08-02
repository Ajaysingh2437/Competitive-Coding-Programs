
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GreddyDogCC {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long t=Integer.parseInt(br.readLine());
    for(long j=0;j<t;j++)
    {   
        String s = br.readLine();
        String[] s1=s.split(" ");
        Long a=Long.parseLong(s1[0]);
        Long b=Long.parseLong(s1[1]);
        Long cnt=(long)0;
        while((a--)%b!=0){
            cnt++;
        }
        System.out.println(cnt);
    }
}
}