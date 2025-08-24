package Challenges.String;

import java.util.Scanner;

public class SmallestWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String s = sc.nextLine();
        System.out.print("Enter pattern string: ");
        String p = sc.nextLine();
        
        int[] patFreq = new int[256];
        int[] strFreq = new int[256];
        
        for(int i = 0; i < p.length(); i++) {
            patFreq[p.charAt(i)]++;
        }
        
        int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE, count = 0;
        
        for(int j = 0; j < s.length(); j++) {
            strFreq[s.charAt(j)]++;
            
            if(patFreq[s.charAt(j)] != 0 && strFreq[s.charAt(j)] <= patFreq[s.charAt(j)]) {
                count++;
            }
            
            if(count == p.length()) {
                while(patFreq[s.charAt(start)] == 0 || strFreq[s.charAt(start)] > patFreq[s.charAt(start)]) {
       
                	if(strFreq[s.charAt(start)] > patFreq[s.charAt(start)]) {
                        strFreq[s.charAt(start)]--;
                    }
                    start++;
                }
                
                int windowLen = j - start + 1;
                if(windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = start;
                }
            }
        }
        
        if(startIndex == -1) {
            System.out.println("No such window exists");
        } else {
            System.out.println("Smallest window: " + s.substring(startIndex, startIndex + minLen));
        }
        sc.close();
	}

}
