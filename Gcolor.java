/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcolor;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gcolor {
static int x[];
	static int adj[][];
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of vertices");
	int n=sc.nextInt();
	System.out.println("enter no. of colors");
	int m=sc.nextInt();
	adj=new int[n][n];
	x=new int[n];
	System.out.println("enter adj matrix");
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			adj[i][j]=sc.nextInt();
		}
	}
	int ans=gcolor(0, n, m);
	if(ans==-1)
	{
		System.out.println("no answer");
	}
	else{
		if(ans==1){
			System.out.print("answer:");
			int max=-2;
		for(int i=0;i<n;i++){
		if(x[i]>max)
			max=x[i];
		}
		if(max<m){
			System.out.println("optimal solution is with "+max+" colors");
			for(int i=0;i<n;i++){
				System.out.print(" "+x[i]);
				}
		}
		else if(max==m){
			System.out.println("optimal solution is with given colors");
			for(int i=0;i<n;i++){
				System.out.print(" "+x[i]);
				}
		}
		}
	}
	}
	static int gcolor(int k,int n,int m){
		while(true){
			nextvalue(k,n,m);
			if(x[k]==0)
				return -1;
			if(k==n-1)
				return 1;
			else 
				return  gcolor(k+1,n,m);
		}
	}
	static void nextvalue(int k,int n,int m){
		while(true){
		x[k]=(x[k]+1)%(m+1);
		if(x[k]==0)
			return;
		int j;
		for(j=0;j<n;j++){
			if(x[k]==x[j] && adj[k][j]!=0)
				break;
		}
		if(j==n)
			return;
		}
	}

}
