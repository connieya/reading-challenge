package org.example.chapter04;

public class BodyRenderer implements IRenderer {
    @Override
    public String render(Message message) {
        return "<b>" + message.body + "</b>";
    }
}
