package dev.limjustin.restaurant.domain.review.converter;

import dev.limjustin.restaurant.domain.review.dto.ReviewRequest;
import dev.limjustin.restaurant.domain.review.dto.ReviewResponse;
import dev.limjustin.restaurant.domain.review.entity.Review;
import dev.limjustin.restaurant.global.enums.Keyword;

import java.util.ArrayList;
import java.util.List;

public class ReviewConverter {
    public static Review toEntity(ReviewRequest.PostDto postDto) {
        List<String> keywords = new ArrayList<>();

        for (Keyword keyword : postDto.getKeywords()) {
            keywords.add(keyword.getDisplayValue());
        }

        return Review.builder()
                .writer(postDto.getWriter())
                .imageLink(postDto.getImageLink())
                .comment(postDto.getComment())
                .rating(postDto.getRating())
                .keywords(keywords)
                .build();
    }

    public static ReviewResponse.ViewDto toDto(Review review) {
        return ReviewResponse.ViewDto.builder()
                .writer(review.getWriter())
                .imageLink(review.getImageLink())
                .comment(review.getComment())
                .rating(review.getRating())
                .keywords(review.getKeywords())
                .build();
    }
}
