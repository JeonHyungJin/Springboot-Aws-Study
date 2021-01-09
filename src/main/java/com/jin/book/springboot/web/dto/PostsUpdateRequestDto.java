package com.jin.book.springboot.web.dto;

import com.jin.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {  /*Dto 클래스는 Request와 Response 사용시 사용되므로 자주 변환이 있을 수 있다.*/

    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
