
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class PalindromePer {
    public static void main(String[] args) throws IOException
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
        if( check(s) )
            System.out.println("Yes");
        else
            System.out.println("No");
    
    }
    public static boolean check(String s)
    {
        int [] cnt1 = new int[26];
        for( int i = 0; i < s.length(); i++ )
        {
            char ch = s.charAt(i);
            cnt1[ch-'a']++;
        }
        int oddOccur = 0;
        for( int cnt:cnt1 )
        {
            if( oddOccur > 1)
                return false;
            if( cnt%2 == 1 )
                oddOccur++;
        }
        return true;
    }
}

