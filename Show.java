
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Show {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
        String[] s1=br.readLine().split(" ");
        String[] s2=br.readLine().split(" ");
        int[] a1=new int[t];
        int[] a2=new int[t];
        for(int i=0;i<t;i++)
        {
            a1[i]=Integer.parseInt(s1[i]);
            a2[i]=Integer.parseInt(s2[i]);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i=0;
        int cnt=0;
        for(int k=t-1;k>=1;k--)
        {
            if(a2[k]==a1[i])
                cnt+=50;
             else
            {   if(a2[k]<a1[i])
                    cnt+=100;
            }
            i++;
        }
        System.out.println(cnt);
}
}