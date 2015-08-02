import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



class maze

{

    static int n;
    static int[][] a;
    static int paths;

    public static void main(String[] ar)
    { Scanner sc = new Scanner(System.in);
    
        int t=sc.nextInt();
        while(t!=0)
        {    
        n = sc.nextInt();
        a = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        search(a,0,0);
        if(paths>0)
        System.out.println(paths);
        else
                System.out.println(paths);
        t--;
    }
    }
    public static int search(int[][] a, int i, int j)
{
    if(!exist(a,i,j) || a[i][j] == 1)
        return 0; // no path here.
    if(i == a.length - 1 && j == a[i].length - 1)
    {
        return 1; // 1 path here.
    }
    a[i][j] = 1; // mark that we have seen this spot here
     // introduce a counter...
    if(a[i+1][j]!=0)
        paths += search(a, i+1,j); // add the additional paths as we find them
    if(a[i-1][j]!=0)
        paths += search(a, i-1,j);
    if(a[i][j+1]!=0)
        paths += search(a, i,j+1);
    if(a[i][j-1]!=0)
        paths += search(a, i,j-1);
    return paths; // return the number of paths available from this point.
}
    public static boolean exist(int[][] a, int i, int j)
{
    return i>=0 && j >=0 && i < a.length && j < a[i].length;
}
}