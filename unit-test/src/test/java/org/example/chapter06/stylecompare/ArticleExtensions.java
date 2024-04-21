package org.example.chapter06.stylecompare;

import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ArticleExtensions {

    public ArticleExtensions shouldContainsNumberOfComments(Article article, int commentCount) {
        assertEquals(commentCount, article.getCommentsCount());
        return this;
    }

    public ArticleExtensions withComment(Article article, String text, String author, LocalDateTime dateCreated) {
        Comment comment = article.singleOrDefault(text, author, dateCreated);
        return this;
    }
}
