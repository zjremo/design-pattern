package net.jrz.proxy;

public class Demo {
    public static void main(String[] args) {
        YoutubeDownLoader naiveDownLoader = new YoutubeDownLoader(new ThirdPartyYoutubeClass());
        YoutubeDownLoader smartDownLoader = new YoutubeDownLoader(new YoutubeCacheProxy());

        long naive = test(naiveDownLoader);
        long smart = test(smartDownLoader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownLoader downLoader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downLoader.renderPopularVideos();
        downLoader.renderVideoPage("catzzzzzzzzz");
        downLoader.renderPopularVideos();
        downLoader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often
        downLoader.renderVideoPage("catzzzzzzzzz");
        downLoader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
