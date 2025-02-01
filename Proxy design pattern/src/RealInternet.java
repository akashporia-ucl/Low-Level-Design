public class RealInternet implements Internet {

    @Override
    public void getConnection(String site) throws Exception {
        System.out.println("Connected to " + site);
    }
}