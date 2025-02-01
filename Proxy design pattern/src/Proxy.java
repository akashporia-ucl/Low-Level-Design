import java.util.Arrays;
import java.util.List;

public class Proxy implements Internet {
    RealInternet realInternet;

    Proxy() {
        this.realInternet = new RealInternet();
    }

    private static final List<String> bannedSites = Arrays.asList("www.instagram.com", "www.facebook.com",
            "www.netflix.com");

    @Override
    public void getConnection(String site) throws Exception {
        if (bannedSites.contains(site)) {
            throw new Exception("Accessing banned website");
        } else {
            realInternet.getConnection(site);
        }
    }
}
