package Challenges.Interface;
interface SerializableCustom {
    void serialize();
}

interface DeserializableCustom {
    void deserialize();
}

class FileData implements SerializableCustom, DeserializableCustom {
    private String filename;

    public FileData(String filename) {
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

class DatabaseData implements SerializableCustom, DeserializableCustom {
    private String dbName;

    public DatabaseData(String dbName) {
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

public class SeriaDeserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
