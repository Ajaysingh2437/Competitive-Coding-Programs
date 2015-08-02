
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ClearTrip {

     public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        String url="http://www.cleartrip.com/signin/service?username=test&pwd=test&profile=developer&role=ELITE&key=manager";
        url=br.readLine();
        for(int i=0;i<url.length()-1;i++)
        {
        if(url.charAt(i)=='='&&url.charAt(i+1)=='&')
            url.replace('&', ' ');
        }
        String[] url1=new String[5];
        url1=url.split("=");
        if(url1[1].replace("&pwd", "").isEmpty())
        System.out.println("username: ");
        else
            System.out.println("username: "+url1[1].replace("&pwd", ""));
        if(url1[2].replace("&profile", "").isEmpty())
        System.out.println("pwd: ");
        else
        System.out.println("pwd: "+url1[2].replace("&profile", ""));
        
        if(url1[3].replace("&role", "").isEmpty())
        System.out.println("profile: ");
        else
            System.out.println("profile: "+url1[3].replace("&role", ""));
        if(url1[4].replace("&key", "").isEmpty())
        System.out.println("role: ");
        else
        System.out.println("role: "+url1[4].replace("&key", ""));
            if(url.length()<6)
                url1[5]=" ";
        if(url1[5].isEmpty())
        System.out.println("key: ");
        else
            System.out.println("key: "+url1[5]);
    }
}
