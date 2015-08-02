
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Notepad{

    

public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        long tx=0;
        String[] arr=new String[50];
       int n=Integer.parseInt(br.readLine());
       for(int i=0;i<n;i++)
       { 
           
           String s = br.readLine();
       String[] s1=s.split(" ");
       int tm=Integer.parseInt(s1[0]);
       String in=s1[1];
       boolean flag=false;
       
       if(in.equals("type"))
       {
           String sp=s1[2];
       if(tm==1)
           arr[tm]=sp;
       else
       {
           arr[tm]=arr[tm-1]+sp;
          // System.out.println(arr[tm]);
       }
           tx=tm;
       }
        else
            {
            if(in.equals("undo"))
            {
                if(flag==false)
                {
                    long sp;
                    sp = Integer.parseInt(s1[2]);
                    tx=tm-sp-1;
                    flag=true;
                }
                else 
                {
                    long sp=Integer.parseInt(s1[2]);
                    tx=tx+sp-1;
                    flag=false;
                }
            }
            }
       }
       String temp=arr[(int)tx];
       
       temp=temp.replace("null", "");
        System.out.println(temp);
}
}
}
