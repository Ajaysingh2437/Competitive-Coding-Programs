
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DwarfSnow {
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    String[] s1=s.split(" ");
    int d=Integer.parseInt(s1[0]);
    int[] a=new int[d];
    for(int j=0;j<d;j++)   
        a[j]=j+1;
    int t=Integer.parseInt(s1[1]);
    for(int j=0;j<t;j++)
    {   
        s1 = br.readLine().split(" ");
        if(s1[0].equals("1")){
        int t1=Integer.parseInt(s1[0])-1;
        int t2=Integer.parseInt(s1[0])-1;
        int temp=a[t1];
        a[t1]=a[t2];
        a[2]=temp;
        }
        else
        {int t1=Integer.parseInt(s1[0]);
        int t2=Integer.parseInt(s1[0]);
        boolean flag=true;
        for(int k=t1-1;k<t2;k++)
        {
            if(a[k]!=k+1)
                flag=false;
        }
        if(flag)
                System.out.println("YES");
        else
                System.out.println("NO");
        }
            
    }    
}
}
