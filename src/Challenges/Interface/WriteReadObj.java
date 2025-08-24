package Challenges.Interface;
interface Writeabl {
    void write(String data);
}

interface Readabl {
    void read();
}

class TextFil implements Writeabl, Readabl {
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

class DatabaseTabl implements Writeabl, Readabl {
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
public class WriteReadObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TextFil txt = new TextFil();
	        DatabaseTabl db = new DatabaseTabl();

	        txt.write("Hello World in File");
	        txt.read();

	        db.write("User: John, Age: 25");
	        db.read();
	}

}
