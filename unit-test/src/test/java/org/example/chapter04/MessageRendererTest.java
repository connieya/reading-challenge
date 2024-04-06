package org.example.chapter04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MessageRendererTest {

    @Test
    @DisplayName("MessageRenderer 구조가 올바른지 확인")
    void messageRendererUsesCorrectSubRenderers() {
        // given
        MessageRenderer sut = new MessageRenderer();
        // when
        List<IRenderer> renderers = sut.subRenderers;

        // then
        assertEquals(3,renderers.size());
        assertInstanceOf(HeaderRenderer.class,renderers.get(0));
        assertInstanceOf(BodyRenderer.class,renderers.get(1));
        assertInstanceOf(FooterRenderer.class,renderers.get(2));
    }

    @Test
    @DisplayName("MessageRenderer 클래스의 소스코드 검증")
    public void messageRendererIsImplementedCorrectly() throws IOException {
        String sourceCode = Files.readString(
                Paths.get("./src/main/java/chapter04/falsepositive/MessageRenderer.java")
        );

        Assertions.assertEquals(
                "package chapter04.falsepositive;\n" +
                        "\n" +
                        "import java.util.ArrayList;\n" +
                        "import java.util.List;\n" +
                        "import java.util.stream.Collectors;\n" +
                        "\n" +
                        "public class MessageRenderer implements IRenderer{\n" +
                        "\n" +
                        "    public List<IRenderer> subRenderers;\n" +
                        "\n" +
                        "    public MessageRenderer() {\n" +
                        "        subRenderers = new ArrayList<>();\n" +
                        "\n" +
                        "        subRenderers.add(new HeaderRenderer());\n" +
                        "        subRenderers.add(new BodyRenderer());\n" +
                        "        subRenderers.add(new FooterRenderer());\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public String render(final Message message) {\n" +
                        "        return String.join(\"\",\n" +
                        "            subRenderers.stream()\n" +
                        "                .map(r -> r.render(message))\n" +
                        "                .collect(Collectors.toList())\n" +
                        "        );\n" +
                        "    }\n" +
                        "\n" +
                        "}\n",
                sourceCode
        );
    }

    @Test
    @DisplayName("MessageRenderer 에서 생성하는 결과 검증")
    void renderingAMessage() {
        // given
        MessageRenderer sut = new MessageRenderer();
        Message message =  Message.builder()
                .header("h")
                .body("b")
                .footer("f")
                .build();

        // when
        String html = sut.render(message);

        // then
        Assertions.assertEquals("<h1>h</h1><b>b</b><i>f</i>", html);
    }

}