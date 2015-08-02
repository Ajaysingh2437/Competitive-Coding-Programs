
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Urban2 {

     public static void main(String args[])throws IOException
    {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        String s=br.readLine();
        String s1=br.readLine();
        
        String sx1[]=s.split(" ");
        String sx2[]=s1.split(" ");
        boolean flag=true;
        int cnt=0,cnt2=0;
        for(int i=0;i<Integer.parseInt(sx1[0]);i++)
        {
        if((flag==true)&&(Integer.parseInt(sx2[i])<Integer.parseInt(sx1[1]))&&cnt<Integer.parseInt(sx1[2]))
                {cnt2++;  
          cnt++;
                if(cnt==Integer.parseInt(sx1[2]))
                    flag=false;}
        }
        System.out.println(cnt2);
    }
}