package Challenges.Interface;
interface Encryptabl {
    void encrypt(String data);
}

interface Decryptabl {
    void decrypt(String data);
}

class Encode implements Encryptabl{
    @Override
    public void encrypt(String data) {
        String encrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Encrypted data: " + encrypted);
    }
}

class Decode implements Decryptabl {
    @Override
    public void decrypt(String data) {
        String decrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Decrypted data: " + decrypted);
    }
}

public class DeencrypyEncryptObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Encryptabl encoder = new Encode();
	        Decryptabl decoder = new Decode();

	        String message = "HelloWorld";

	        encoder.encrypt(message);
	        decoder.decrypt("dlroWolleH");
	}

}
