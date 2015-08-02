#include<stdio.h>   
 #include<math.h>   
 void sort(int *ptr_ar,int *ptr_sr,int n)    //Function which sorts elements in first array and stores it in second   
 {   
 int i,j,temp;   
 for(i=0;i<n;i++)   
 *(ptr_sr+i)=*(ptr_ar+i);   
 for(i=0;i<n;i++)   
 {   
 for(j=i+1;j<n;j++)   
 {   
 if(*(ptr_sr+i)>*(ptr_sr+j))   
 {   
 temp=*(ptr_sr+j);   
 *(ptr_sr+j)=*(ptr_sr+i);   
 *(ptr_sr+i)=temp;   
 }   
 }   
 }   
 }   
 int power(int ten,int n)   
 {   
 int po,i;   
 po=1;   
 for(i=0;i<n;i++)   
 po=po*ten;   
 return po;   
 }   
 int join(int *ptr_ar,int n)   
 {   
 int num,i,j;   
 num=0;   
 j=n-1;   
 for(i=0;i<n;i++)   
 {   
 num=num+(*(ptr_ar+i)*(power(10,j)));   
 j--;   
 }   
 return num;   
 }   
 void split(int *ptr_dyn,int n,int num)   
 {   
 int i;   
 for(i=n;i>0;i--)   
 {   
 *(ptr_dyn+i-1)=num%10;   
 num=(num-(num%10))/10;   
 }   
 }   
 int main()   
 {   
 int i,n,num,sort_num,srt_num,flag;   
 static int ar[1000000],sr[1000000],dyn[1000000],dyn_srt[1000000]; 
 int t;
 scanf("%d",&t);
 while(t--)
 {
 flag=0;   
 scanf("%d",&n);   
 for(i=0;i<n-1;i++)   
 scanf("%d ",&ar[i]);   
 scanf("%d",&ar[n-1]);  
 sort(ar,sr,n);   
 sort_num=join(sr,n);   
 num=join(ar,n);   
 while(flag!=1&&(num-1)!=0)   
 {   
 num=num-1;   
 split(dyn,n,num);   
 sort(dyn,dyn_srt,n);   
 srt_num=join(dyn_srt,n);   
 if(srt_num==sort_num)   
 flag++;   
 }   
 for(i=0;i<n;i++)   
 if(num==1)   
 {   
 printf("%d",ar[i]);   
 if(i!=(n-1)){printf(" ");}   
 }   
 else   
 {   
 printf("%d",dyn[i]);   
 if(i!=(n-1)){printf(" ");}   
 }
 printf("\n");
 }
 return 0;   
 }  