package Challenges.Arrays;

import java.util.Scanner;

public class Symmtric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(a[i][j] == a[j][i]) {
                    count++;
                }
            }
        }
        if(count == n*n) {
            System.out.println("The matrix is symmetric.");
	}else {
            System.out.println("The matrix is not symmetric.");
    }
        sc.close();
	}

}
