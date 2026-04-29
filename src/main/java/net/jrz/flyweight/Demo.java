package net.jrz.flyweight;

public class Demo {

    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite blog1 = factory.getWebSite(TypeKeyConstants.KEY_BLOG);
        WebSite blog2 = factory.getWebSite(TypeKeyConstants.KEY_BLOG);

        System.out.println(blog1 == blog2); // true

        blog1.access(new User("Tom"));
        blog2.access(new User("Jerry"));

        System.out.println(factory.getWebSiteCount());
    }
}