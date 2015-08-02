package gcolor;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Sort1{

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
           String sj = br.readLine();
       String[] narr=sj.split(" ");
         
       int n=Integer.parseInt(narr[0]);
       int n2=Integer.parseInt(narr[1]);
       int n3=n+n2;
       
         String s = br.readLine();
        String[] s1=s.split(" ");
       int[] arr=new int[n3];
       int k;
      for ( k = 0 ; k < n ; k++ )  
       arr[k]=Integer.parseInt(s1[k]); 
      
      
         String s2 = br.readLine();
        String[] s3=s2.split(" ");
       //int[] arr2=new int[n2];
      for ( int i = 0 ; i < n2 ; i++ )  
       arr[k++]=Integer.parseInt(s3[i]); 
       
      
       
       //int[] arr3=new int[n3];
        //System.out.println(s2.length());
      for ( int i = 0 ; i <n3-1 ; i++ )  {
        { for ( int m = 0 ; m <n3-1 ; m++ )  
      if(arr[m+1]>arr[m])
      {
          int x=arr[m+1];
          arr[m+1]=arr[m];
          arr[m]=x;
          
      }}}
    for ( int i = 0 ; i <n3 ; i++ )  
        System.out.print(arr[i]+" ");
System.out.println();
    }
}
}
