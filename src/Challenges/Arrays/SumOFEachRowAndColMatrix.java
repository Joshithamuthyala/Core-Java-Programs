package Challenges.Arrays;

import java.util.Scanner;

public class SumOFEachRowAndColMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of rows:");
	        int r = sc.nextInt();
	        System.out.println("Enter the number of columns:");
	        int c = sc.nextInt();
	        int[][] a = new int[r][c];
	        System.out.println("Enter the elements of the matrix:");
	        for(int i=0;i<r;i++) {
	            for(int j=0;j<c;j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        for(int i=0;i<r;i++) {
	            int sumRow = 0;
	            for(int j=0;j<c;j++) {
	                sumRow += a[i][j];
	            }
	            System.out.println("Sum of row " + (i+1) + ": " + sumRow);
	        }
	        for(int j=0;j<c;j++) {
	            int sumCol = 0;
	            for(int i=0;i<r;i++) {
	                sumCol += a[i][j];
	            }
	            System.out.println("Sum of column " + (j+1) + ": " + sumCol);
	        }
	        sc.close();
	}

}
