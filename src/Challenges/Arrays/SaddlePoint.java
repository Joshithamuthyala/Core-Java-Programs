package Challenges.Arrays;

import java.util.Scanner;

public class SaddlePoint {

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
        int found = 0;
        for(int i=0;i<r;i++) {
            int minRow = a[i][0];
            int colIndex = 0;
            for(int j=1;j<c;j++) {
                if(a[i][j] < minRow) {
                    minRow = a[i][j];
                    colIndex = j;
                }
            }
            int k;
            for(k=0;k<r;k++) {
                if(a[k][colIndex] > minRow) {
                    break;
                }
            }
            if(k == r) {
                System.out.println("Saddle point is: " + minRow);
                found = 1;
            }
        }
        if(found == 0) {
            System.out.println("No saddle point found.");
	}
        sc.close();
}
}