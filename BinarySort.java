
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class BinarySort {
   public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int tx=Integer.parseInt(br.readLine());
    for(int p=0;p<tx;p++)
    {
    int t=Integer.parseInt(br.readLine());
    String[] s=br.readLine().split(" ");
    Integer[] a=new Integer[t];
    for(int j=0;j<t;j++)
    {
        a[j]=Integer.parseInt(s[j]);
    }
    int[] cnt1=new int[t];
    //int[] cnt2=new int[t];
    Arrays.fill(cnt1,0);
   
    for(int i=0;i<t;i++)
    {
        String x1=Integer.toBinaryString(a[i]);
        for(int k=0;k<x1.length();k++)
        {if(x1.charAt(k)=='1') cnt1[i]++;}
    }
    for(int i=0;i<t;i++)
    {
    for(int j=0;j<t-1;j++)
    {
        if(cnt1[j]>cnt1[j+1])
        {
            int t1=cnt1[j];
            int t2=a[j];
            
            cnt1[j]=cnt1[j+1];
            a[j]=a[j+1];
            
            cnt1[j+1]=t1;
            a[j+1]=t2;
            
        }
    }
    }
    for(int j=0;j<t;j++)
    {
        System.out.print(a[j]+" ");
    }
    }
   }
}
