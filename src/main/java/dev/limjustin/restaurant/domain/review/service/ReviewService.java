package dev.limjustin.restaurant.domain.review.service;

import dev.limjustin.restaurant.domain.review.converter.ReviewConverter;
import dev.limjustin.restaurant.domain.review.dto.ReviewRequest;
import dev.limjustin.restaurant.domain.review.dto.ReviewResponse;
import dev.limjustin.restaurant.domain.review.entity.Review;
import dev.limjustin.restaurant.domain.review.entity.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewResponse.ViewDto post(ReviewRequest.PostDto postDto) {
        Review review = ReviewConverter.toEntity(postDto);
        return ReviewConverter.toDto(reviewRepository.save(review));
    }
}
