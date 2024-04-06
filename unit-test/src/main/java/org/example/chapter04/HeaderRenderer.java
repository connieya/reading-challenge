package org.example.chapter04;

public class HeaderRenderer implements IRenderer {
    @Override
    public String render(Message message) {
        return "<h1>" + message.header + "</h1>";
    }
}
