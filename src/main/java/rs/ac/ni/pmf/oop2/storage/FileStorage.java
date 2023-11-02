package rs.ac.ni.pmf.oop2.storage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This storage medium writes to a specified file destination.
 */
public class FileStorage implements WritableStorage {
    private final String path;

    /**
     * @param path The path to destination, the file
     */
    public FileStorage(String path) {
        this.path = path;
    }

    @Override
    public boolean store(String data) {
        File file = new File(path);
        try {
            // false -> overwritovacemo fajl, nas to ne brine
            file.createNewFile();
        } catch (IOException e) {
            return false;
        }
        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write(data);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
