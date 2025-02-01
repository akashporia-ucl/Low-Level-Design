public class App {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();
        s2.showMessage();

        if (s1 == s2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
