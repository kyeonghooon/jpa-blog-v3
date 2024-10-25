package com.tenco.blog_v3.board;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class BoardResponse {

    @Getter
    @Setter
    @Builder
    public static class DTO {
        private int id;
        private String title;
        private String content;

        // DTO 사용시 사용자 정의 생성자
        public static DTO of(Board board) {
            return DTO.builder()
                    .id(board.getId())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .build();
        }

    }

    // 게시글 상세보기 응답

    // 게시글 상세보기 - 댓글 정보

    // 게시글 목록 보기 화면을 위한 DTO 클래스 만들어보기
    @Getter
    @Setter
    @Builder
    public static class ListDTO {
        private int id;
        private String title;

        public static ListDTO of(Board board) {
            return ListDTO.builder()
                    .id(board.getId())
                    .title(board.getTitle())
                    .build();
        }
    }
}
