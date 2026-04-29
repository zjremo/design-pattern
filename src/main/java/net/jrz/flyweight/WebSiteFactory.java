package net.jrz.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static net.jrz.flyweight.TypeKeyConstants.*;

public class WebSiteFactory {

    private final Map<String, WebSite> webCache = new ConcurrentHashMap<>();

    public WebSite getWebSite(String typeKey) {
        // 保证线程安全
        return webCache.computeIfAbsent(typeKey, this::createWebSite);
    }

    private WebSite createWebSite(String typeKey) {

        if (KEY_BLOG.equalsIgnoreCase(typeKey)) {
            return new ConcreteWebSite(
                    new BlogWebActions(),
                    NAME_BLOG
            );
        }

        if (KEY_MALL.equalsIgnoreCase(typeKey)) {
            return new ConcreteWebSite(
                    new MallWebActions(),
                    NAME_MALL
            );
        }

        return new ConcreteWebSite(
                new SingleWebActions(),
                NAME_SINGLE_PERSON
        );
    }

    public int getWebSiteCount() {
        return webCache.size();
    }
}