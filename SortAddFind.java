
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class SortAddFind {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    String[] s = br.readLine().split(" ");
    int[] a=new int[s.length];
    for(int i=0;i<s.length;i++)
        a[i]=Integer.parseInt(s[i]);
    Arrays.sort(a);
    int q=Integer.parseInt(br.readLine());
for(int i=0;i<q;i++)
{
    s = br.readLine().split(" ");
    int x=Arrays.binarySearch(a, Integer.parseInt(s[0]));
    x=Integer.parseInt(s[1])-(x+1);
    System.out.println(x);
}
}    
}
