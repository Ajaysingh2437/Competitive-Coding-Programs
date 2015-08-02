import java.io.BufferedReader;
import java.io.InputStreamReader;
class Print3_5 {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
		for(int i=0;i<N;i++){
			int num=Integer.parseInt(br.readLine());
			if(num%3==0){
				for(int j=0;j<num;j++)
				 System.out.print(5);
				 System.out.println();
			}
			else{
				if(num%5==0){
					for(int j=0;j<num;j++)
					System.out.print(3);
					System.out.println();
				}
				else{
					int cnum=5;
					boolean fl=false;
					while(cnum<=num){
						if((num-cnum)%3==0){
							fl=true;
							break;
						}
						cnum+=5;
					}
					if(fl){
						for(int j=0;j<num-cnum;j++)
						   System.out.print(5);
						for(int j=0;j<cnum;j++)
						   System.out.print(3);
						System.out.println();
					}
					else{
						int cnum2=3;
						boolean fl2=false;
						while(cnum2<=num){
							if((num-cnum2)%5==0){
								fl2=true;
								break;
							}
							cnum2+=3;
						}
						if(fl2){
						for(int j=0;j<cnum2;j++)
						   System.out.print(5);
						for(int j=0;j<num-cnum2;j++)
						   System.out.print(3);
						
						System.out.println();	
						}
						else{
							
							System.out.println(-1);
						}
					}
				}
			}
		}
    }
}