package Challenges.Interface;
interface Encryptabler {
    void encrypt(String data);
}

interface Decryptabler {
    void decrypt(String data);
}

class EncryptionAlgorithm implements Encryptabler {
    @Override
    public void encrypt(String data) {
        String encrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Encrypted text: " + encrypted);
    }
}

class DecryptionAlgorithm implements Decryptabler {
    @Override
    public void decrypt(String data) {
        String decrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Decrypted text: " + decrypted);
    }
}

public class EncrypDecr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
