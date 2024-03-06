package dev.limjustin.restaurant.domain.review.dto;

import dev.limjustin.restaurant.global.enums.Keyword;
import dev.limjustin.restaurant.global.enums.Rating;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class ReviewResponse {
    @Data @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ViewDto {
        private String writer;
        private String imageLink;  // 사진 링크 (AWS S3)
        private Rating rating;
        private String comment;
        private List<String> keywords;
    }
}
