package org.example.chapter06.stylecompare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerControllerTests {

    @Test
    @DisplayName("예제 6.4 많은 공간을 차지하는 상태 검증")
    void addingACommentToAnArticle1() {
        // given
        Article sut = new Article();
        String text = "Comment text";
        String author = "John Doe";
        LocalDateTime now = LocalDateTime.of(2022, 11, 8, 0, 0);

        // when
        sut.addComment(text, author, now);

        // then
        assertEquals(1, sut.getCommentsCount());
        assertEquals(text, sut._comments.get(0).text);
        assertEquals(author, sut._comments.get(0).author);
        assertEquals(now, sut._comments.get(0).dateCreated);

    }

    @Test
    @DisplayName("예제 6.5 검증문에 헬퍼 메서드 사용")
    void addingACommentToAnArticle2() {
        // given
        Article sut = new Article();
        String text = "Comment text";
        String author = "John Doe";
        LocalDateTime now = LocalDateTime.of(2024, 4, 22, 0, 0);
        ArticleExtensions helper = new ArticleExtensions();

        // when
        sut.addComment(text, author, now);

        // then
        helper.shouldContainsNumberOfComments(sut, 1)
                .withComment(sut, text, author, now);
    }

    @Test
    @DisplayName("예제 6.6 값으로 비교하는 Comment")
    void addingACommentToAnArticle3() {
        // given
        Article sut = new Article();
        Comment comment = new Comment(
                "Commennt text",
                "John Doe" ,
                LocalDateTime.of(2024,4,24,0,0));

        // when
        sut.addComment(comment.text, comment.author , comment.dateCreated);

        // then
        assertEquals(comment , sut._comments.get(0));
    }

}
