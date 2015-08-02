
package javaapplication24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 class JavaApplication24 {

    public static void main(String[] args) throws Exception {
         ModScanner ms=new ModScanner();
        int t=ms.nextInt();
        for(int i=1;i<=t;i++){
           int n=ms.nextInt();
           int k=ms.nextInt();
           int[] bluebr=new int[n];
           for(int j=0;j<n;j++)
               bluebr[j]=ms.nextInt();
           int[][] dp=new int[1010][1010];
           int r=solve(bluebr,k,n,0,0,dp);
            System.out.println("Scenario #"+i+": "+r);
        }
                 
    }
    public static int solve(int[] b,int k,int n,int max,int i,int[][] dp){
     
        if(i>=n)
            return max;
        if(dp[i][max]!=0)
            return dp[i][max];
        if(b[i]+max<=k)
            dp[i][max]=Math.max(solve(b,k,n,max+b[i],i+2,dp),solve(b,k,n,max,i+1,dp));
        else
            dp[i][max]=solve(b,k,n,max,i+1,dp);
        return dp[i][max];
    }
}
class ModScanner {
	BufferedReader br;
	StringTokenizer st;
 
	public ModScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
	String nextToken() throws Exception {
		while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			
		}
		return st.nextToken();
	}
 
	int nextInt() throws Exception, Exception {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() throws Exception {
		return Long.parseLong(nextToken());
	}
 
	double nextDouble() throws Exception {
		return Double.parseDouble(nextToken());
	}
}