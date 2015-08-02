import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Number {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        int s = Integer.parseInt(br.readLine());
       s=(s*(s+1))/2;
        System.out.println(s);
    }
   
}

}

