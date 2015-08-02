import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Ateam {

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {   
        String s = br.readLine();
        String[] s1=s.split(" ");
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++)
           arr[i]=Integer.parseInt(s1[i]);
        if((arr[0]>arr[4])&&(arr[2]>arr[4])&&(arr[1]>arr[5])&&(arr[3]>arr[5]))
        System.out.println("Yes");
        else
            System.out.println("No");
    }
   
}

}

