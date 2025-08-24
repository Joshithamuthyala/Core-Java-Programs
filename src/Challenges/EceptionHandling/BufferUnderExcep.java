package Challenges.EceptionHandling;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
public class BufferUnderExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer buffer = ByteBuffer.allocate(5);
        buffer.put((byte) 10);
        buffer.put((byte) 20);

        buffer.flip(); 

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(buffer.get());
            }
        } catch (BufferUnderflowException e) {
            System.out.println("BufferUnderflowException caught: " + e.getMessage());
        }
	}

}
