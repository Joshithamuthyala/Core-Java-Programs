package Challenges.Datatypes;

public class IntToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 25;
        String binary = Integer.toBinaryString(num);
        System.out.println("Integer to Binary: " + num + " -> " + binary);

        String binaryStr = "11001";
        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Binary to Integer: " + binaryStr + " -> " + decimal);
	}

}
