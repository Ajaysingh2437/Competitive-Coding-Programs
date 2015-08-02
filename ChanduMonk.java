
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;


class ChanduMonk {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       long t= Integer.parseInt(br.readLine());
    for (long  i = 0 ; i <t ; i++ )
    {
        long x= Integer.parseInt(br.readLine());
         long cnt=0;
         long j=0;
    for (j = 1 ; j <=x &&cnt<4; j++ )
    {if(x%j==0)
            cnt++;
    }
    if(cnt==4)
    System.out.println("YES");
    else
        System.out.println("NO");
    }
    
  }

}

