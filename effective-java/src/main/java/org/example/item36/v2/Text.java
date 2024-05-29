package org.example.item36.v2;

import java.util.Set;

public class Text {

    public enum Style {
        BOLD , ITALIC , UNDERLINE , STRIKETHROUGH
    }

    // 어떤 Set을 넘겨도 되나, EnumSet이 가장 좋다.
    public void applyStyles(Set<Style> styles) {}

}
