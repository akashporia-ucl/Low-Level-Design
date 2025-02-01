public class App {
    public static void main(String[] args) throws Exception {
        HDQuality hd = new HDQuality();
        FourKQuality fourK = new FourKQuality();

        VideoPlatform youtubeHD = new YouTube(hd);
        VideoPlatform youtube4k = new YouTube(fourK);

        VideoPlatform netflixHD = new Netflix(hd);
        VideoPlatform netflix4K = new Netflix(fourK);

        youtubeHD.playVideo("G2 vs Faze");
        youtube4k.playVideo("Interstellar");

        netflix4K.playVideo("Demon slayer");
        netflixHD.playVideo("The big bang theory");

    }
}
