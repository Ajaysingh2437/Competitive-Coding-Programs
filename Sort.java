
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Sort{

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
       int n=Integer.parseInt(br.readLine());
         String s = br.readLine();
       String[] s1=s.split(" ");
       int[] arr=new int[n];
      for ( int i = 0 ; i <n ; i++ )  
       arr[i]=Integer.parseInt(s1[i]);
    for ( int i = 0 ; i <n-1 ; i++ )  {
        { for ( int k = 0 ; k <n-1 ; k++ )  
      if(arr[k+1]>arr[k])
      {
          int x=arr[k+1];
          arr[k+1]=arr[k];
          arr[k]=x;
          
      }}}
    for ( int i = 0 ; i <n ; i++ )  
        System.out.print(arr[i]+" ");
}
}
}
