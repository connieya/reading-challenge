package org.example.chapter07.proxy;

public class ProxyImage implements Image {
    private String path;
    private RealImage image;

    public ProxyImage(String path) {
        this.path = path;
    }

    public void draw() {
        if (image == null) {
            image =  new RealImage(path);
        }
        image.draw();
    }
}
