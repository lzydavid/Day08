package sdf;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        // CollectionSort cs = new CollectionSort();
        // cs.example01();

        // HashMapExample h = new HashMapExample();
        // h.example01();

        ConcurrentHashMapExample che = new ConcurrentHashMapExample();
        che.example();

    }
}
