package Challenges.Interface;
interface Encryptablers {
    void encrypt(String data);
}

interface Decryptablers {
    void decrypt(String data);
}

class EncryptionAlgorithms implements Encryptablers {
    @Override
    public void encrypt(String data) {
        String encrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Encrypted text: " + encrypted);
    }
}

class DecryptionAlgorithms implements Decryptablers {
    @Override
    public void decrypt(String data) {
        String decrypted = new StringBuilder(data).reverse().toString();
        System.out.println("Decrypted text: " + decrypted);
    }
}

public class EncrDecrObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncryptionAlgorithms encryptor = new EncryptionAlgorithms();
        DecryptionAlgorithms decryptor = new DecryptionAlgorithms();

        String text = "OpenAIChat";

        encryptor.encrypt(text);
        decryptor.decrypt("tahCIAnepO");
	}

}
