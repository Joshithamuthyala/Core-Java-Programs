package Challenges.EceptionHandling;
import java.nio.ByteBuffer;
import java.nio.BufferOverflowException;
public class BufferOverExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer buffer = ByteBuffer.allocate(5);

        try {
            
            for (int i = 0; i < 6; i++) {
                buffer.put((byte)i); 
            }
        } catch (BufferOverflowException e) {
            System.out.println("Buffer overflow occurred: " + e);
        }

        System.out.println("Program continues after handling exception.");
	}

}
