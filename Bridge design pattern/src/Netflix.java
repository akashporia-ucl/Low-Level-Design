public class Netflix extends VideoPlatform {

    public Netflix(VideoQuality quality) {
        super(quality);
    }

    @Override
    public void playVideo(String title) {
        System.out.print("Netflix: ");
        quality.play(title);
    }
}
