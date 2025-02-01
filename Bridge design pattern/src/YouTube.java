public class YouTube extends VideoPlatform {

    public YouTube(VideoQuality quality) {
        super(quality);
    }

    @Override
    public void playVideo(String title) {
        System.out.print("YouTube: ");
        quality.play(title);
    }
}
