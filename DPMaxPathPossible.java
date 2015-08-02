
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPMaxPathPossible
{
    public long numWays(int[][] arr,int t)
    {
        int[][] arr2=new int[t+1][t+1];
    arr[t][t]=1;
        for(int i=t;i>=0;i--){
	for (int j=t;j>=0;j--){
		if(i== t&& j==t) 
                    arr2[i][j]=1;
		else {
                        int tx=0;
                        if(j<t&&arr[i][j]!=1)
                            tx+=arr2[i][j+1];
                        if(i<t&&arr[i][j]!=1)
                            tx+=arr2[i+1][j];
                        arr2[i][j]=tx;
                    }       
                    
            }
        }
    return arr2[0][0];
    }
    public static void main (String [] args) throws IOException
{
  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int[][] arr=new int[t+1][t+1];
        for(int i=1;i<=t;i++)
        {
            String[] s=br.readLine().split(" ");
            for(int j=1;j<=t;j++)
            {   
                arr[i][j]=Integer.parseInt(s[j-1]);
            }
        }
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<t;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        DPMaxPathPossible d=new DPMaxPathPossible();
        System.out.println(d.numWays(arr,t));
}
}



