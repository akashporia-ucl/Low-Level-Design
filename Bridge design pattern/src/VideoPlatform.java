public abstract class VideoPlatform {
    protected VideoQuality quality;

    public VideoPlatform(VideoQuality quality) {
        this.quality = quality;
    }

    public abstract void playVideo(String title);
}
