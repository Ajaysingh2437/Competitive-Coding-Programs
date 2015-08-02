
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Connections {
     public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    int[][] arr=new int[t+1][t+1];
    //Arrays.fill(arr, 0);
    t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {  
        String[] s=br.readLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        arr[a][b]=1;
        arr[b][a]=1;
    }
    t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {  
        String[] s=br.readLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
       if(arr[a][b]==1)
            System.out.println("Direct Connection");
       else
       {
           int i;
           for(i=Math.min(a, b)+1;i<=Math.max(a, b);i++)
           {   if(arr[a][i]!=1)
                   break;
                else
                   a=i;
           }
          // System.out.println(i);
           if(i==Math.max(a, b)+1)
               System.out.println("Indirect Connection");
           else
               System.out.println("No Connection");
         }       
    }
     }
}
