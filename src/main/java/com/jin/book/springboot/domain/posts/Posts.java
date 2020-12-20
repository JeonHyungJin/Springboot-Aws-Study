package com.jin.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {    /*Entity 클래스는 DB와 직접 연관이 있기 때문에 변경되지 않아야 한다.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Id = Table의 PK의미
    //GenerationType.IDENTITY = Auto increment가 되도록
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
