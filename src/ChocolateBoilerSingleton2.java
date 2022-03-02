//This code works well even when used by multi-threaded application
public class ChocolateBoilerSingleton2 {
    private boolean empty;
    private boolean boiled;

    private static final ChocolateBoilerSingleton2 uniqueInstance = new ChocolateBoilerSingleton2();

    private ChocolateBoilerSingleton2() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton2 getInstance() {
        return uniqueInstance;
    }
}