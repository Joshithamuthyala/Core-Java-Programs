package Challenges.Interface;
interface Encryptable {
    void encrypt(String data);
}

interface Decryptable {
    void decrypt(String data);
}

class Encoder implements Encryptable {
    @Override
    public void encrypt(String data) {
        String encrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Encrypted data: " + encrypted);
    }
}

class Decoder implements Decryptable {
    @Override
    public void decrypt(String data) {
        String decrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Decrypted data: " + decrypted);
    }
}

public class Encryptdeencrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
