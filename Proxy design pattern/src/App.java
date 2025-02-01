public class App {
    public static void main(String[] args) throws Exception {
        Internet internet = new Proxy();
        try {
            internet.getConnection("www.google.com");
            internet.getConnection("www.netflix.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
