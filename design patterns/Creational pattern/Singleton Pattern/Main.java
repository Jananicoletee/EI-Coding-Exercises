
public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();
        dbManager.connect();

        DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();
        dbManager2.disconnect();
    }
}
