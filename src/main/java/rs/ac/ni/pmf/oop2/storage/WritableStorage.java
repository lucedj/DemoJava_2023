package rs.ac.ni.pmf.oop2.storage;

/**
 * Implementation of a writable-only storage medium that supports 1 piece of data.
 */
public interface WritableStorage {
    /**
     * Attempt to store new data to the storage medium.
     * Any data previously stored will be overwritten.
     * @param data The data to store
     * @return Whether storing was successful
     */
    boolean store(String data);
}
