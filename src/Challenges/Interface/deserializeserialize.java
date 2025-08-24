package Challenges.Interface;
interface SerializableCusto {
    void serialize();
}

interface DeserializableCusto {
    void deserialize();
}

class FileDat implements SerializableCusto, DeserializableCusto {
    private String filename;

    public FileDat(String filename) {
        this.filename = filename;
    }

    @Override
    public void serialize() {
        System.out.println("Serializing data to file: " + filename);
    }

    @Override
    public void deserialize() {
        System.out.println("Deserializing data from file: " + filename);
    }
}

class DatabaseDat implements SerializableCusto, DeserializableCusto {
    private String dbName;

    public DatabaseDat(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void serialize() {
        System.out.println("Serializing data to database: " + dbName);
    }

    @Override
    public void deserialize() {
        System.out.println("Deserializing data from database: " + dbName);
    }
}

public class deserializeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDat file = new FileDat("data.txt");
        DatabaseDat database = new DatabaseDat("CustomerDB");

        file.serialize();
        file.deserialize();

        database.serialize();
        database.deserialize();
	}

}
