package net.jrz.proxy;

public record Video(String id, String title, String data) {
    public Video(String id, String title) {
        this(id, title, "Random video.");
    }
}