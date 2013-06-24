package com.yallam.c9;

public class SpiralMatrix {
	/**
	 * This is an answer by one of the interviewees, 
	 * that is optimized for readability.
	 * About Author: Yehia Allam
	 */
	public static void main(String[] args) {
		
		String[][] A = {{"01","02","03","04"},{"05","06","07","08"},{"09","10","11","12"},{"13","14","15","16"}};
		String[][] B = {{"010","020","030","040","050"},{"060","070","080","090","100"},{"110","120","130","140","150"},{"160","170","180","190","200"},{"210","220","230","240","250"}};
		
		// two test cases
		printSpiral(A.length, A);
		printSpiral(B.length, B);
		
	}
	
	static void printSpiral(int numOfColumns, String[][] arr){
		for(int i=0,j=numOfColumns-1;i<numOfColumns;i++, j--){
			horForward(i, i, numOfColumns-i-1, arr);
			verDown(j, i+1, j, arr);
			horBackward(j, i, j-1, arr);
			verUp(i, i+1, j-1, arr);		
		}
		
		System.out.println();
	}
	
	static void horForward(int i, int s, int e, String[][] A){
		for(int j=s;j<=e;j++)
			System.out.println(A[i][j]);
	}
	
	static void horBackward(int i, int s, int e, String[][] A){
		for(int j=e;j>=s;j--)
			System.out.println(A[i][j]);
	}
	
	static void verDown(int j, int s, int e, String[][] A){
		for(int i=s;i<=e;i++)
			System.out.println(A[i][j]);
	}
	
	static void verUp(int j, int s, int e, String[][] A){
		for(int i=e;i>=s;i--)
			System.out.println(A[i][j]);
	}
	
}
