import java.io.*;
class Clock
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++)
    {
        String s = br.readLine();
        String[] s1=s.split(" ");
        int h=Integer.parseInt(s1[0]);
        int m=Integer.parseInt(s1[0]);
       double ha=0.5*(h*60+m);
        double ma=6*m;
        double ang=Math.abs(ha-ma);
        ang=360-ang;
               //int ang=(h*5-m)*6;
        System.out.println(ang);
    }
    }
}