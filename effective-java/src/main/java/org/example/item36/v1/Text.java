package org.example.item36.v1;

public class Text {
    public static final int STYLE_BOLD = 1 << 0;
    public static final int STYLE_ITALIC = 1 << 1;
    public static final int STYLE_UNDERLINE = 1 << 2;
    public static final int STYLE_STRIKETHROUGH = 1 << 3;

    // 매개변수 styles 는 0개 이상의 STYLE_ 상수를 비트별 OR 한 값이다.
    public void applyStyles(int styles) {}

}
