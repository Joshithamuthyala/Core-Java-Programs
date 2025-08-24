package Challenges.Arrays;

import java.util.Scanner;

public class TwoDSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
        int r = sc.nextInt();
        System.out.println("Enter column size");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
        sc.close();
	}

}
