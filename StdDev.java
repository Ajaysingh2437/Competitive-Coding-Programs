
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StdDev {
     public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int [] values =new int[7]; 
        for(int i=0;i<7;i++)
    {   
        char[] s=br.readLine().toCharArray();
        int cnt=0;
        for(int j=0;j<s.length;j++)
        {
            if(s[j]=='1')
            cnt++;
        }
        values[i]=cnt;
    }
        double sum=0;
        double finalsum = 0;
        double average = 0;
        for( double i : values) {
         finalsum =   (sum += i);
        }
        average = finalsum/(values.length);

        //System.out.println("Average: "+ average);




        double sumX=0;
        double finalsumX=0;
        double[] x1_average = new double[2000];
        for (int i = 0; i<values.length; i++){
            double fvalue = (Math.pow((values[i] - average), 2));


            x1_average[i]= fvalue;
          //  System.out.println("test: "+ fvalue);


            //
        }

        for( double i : x1_average) {
             finalsumX =   (sumX += i);
            }


        Double AverageX = finalsumX/(values.length);

        //System.out.println("E(X1-x1_average)^2/AverageX: "+ AverageX);

        double SquareRoot = Math.sqrt(AverageX);
double roundOff = Math.round(SquareRoot*100)/10000;
        System.out.println(String.format("%.4f", SquareRoot));

    }
}
