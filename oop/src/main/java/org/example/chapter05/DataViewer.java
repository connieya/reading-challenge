package org.example.chapter05;



public class DataViewer {

    private String url;

    public void display(){
        String data = loadHtml();
    }

    private String loadHtml() {
        HttpClient client = new HttpClient();
        client.connect(url);
        return client.getResponse();
    }
}
