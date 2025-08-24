package Challenges.Interface;
interface Writeable {
    void write(String data);
}

interface Readable {
    void read();
}

class TextFile implements Writeable, Readable {
    private String content;

    @Override
    public void write(String data) {
        content = data;
        System.out.println("Writing to text file: " + content);
    }

    @Override
    public void read() {
        System.out.println("Reading from text file: " + content);
    }
}

class DatabaseTable implements Writeable, Readable {
    private String record;

    @Override
    public void write(String data) {
        record = data;
        System.out.println("Inserting record into database: " + record);
    }

    @Override
    public void read() {
        System.out.println("Reading record from database: " + record);
    }
}
public class WriteReAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
