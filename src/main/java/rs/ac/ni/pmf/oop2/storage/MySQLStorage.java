package rs.ac.ni.pmf.oop2.storage;

/**
 * Represents a MySQL database storage medium.
 */
public class MySQLStorage implements WritableStorage, AutoCloseable {
    private boolean _connected;

    private final String _host;
    private final int _port;
    private final String _username;
    private final String _password;
    private final String _database;

    public MySQLStorage(String host, int port, String username, String password, String database) {
        _host = host;
        _port = port;
        _username = username;
        _password = password;
        _database = database;
    }

    /**
     * Attempt to connect to database. Call is ignored if already connected.
     * @return Whether connecting was successful
     */
    public boolean connect() {
        if (_connected)
            return true;
        _connected = true;
        // simulacija!
        System.out.print("Connected to database: ");
        System.out.print(_host + ":" + _port);
        System.out.println(" - username " + _username + " database " + _database);

        return true;
    }

    @Override
    public boolean store(String data) {
        if (!_connected)
            return false;
        // simulacija!
        return true;
    }

    @Override
    public void close() {
        System.out.println("Disconnected from database");
        _connected = false;
    }
}
