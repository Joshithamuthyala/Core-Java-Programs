package Challenges.Arrays;

import java.util.Scanner;

public class RemovDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                temp[j++] = arr[i];
        }
        for (int i = 0; i < j; i++)
            System.out.print(temp[i] + " ");
        sc.close();
	}

}
