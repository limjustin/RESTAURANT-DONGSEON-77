package dev.limjustin.restaurant.domain.review.service;

import dev.limjustin.restaurant.domain.review.dto.ReviewRequest;
import dev.limjustin.restaurant.domain.review.dto.ReviewResponse;
import dev.limjustin.restaurant.domain.review.entity.Review;
import dev.limjustin.restaurant.domain.review.entity.ReviewRepository;
import dev.limjustin.restaurant.global.enums.Rating;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class ReviewServiceTest {

    @Mock
    private ReviewRepository reviewRepository;

    @InjectMocks
    private ReviewService reviewService;

    @Test
    void 리뷰_작성() {
//        // given
//        ReviewRequest.PostDto postDto = ReviewRequest.PostDto.builder()
//                .writer("테스트")
//                .comment("맛있어요")
//                .imageLink("image link")
//                .rating(Rating.FIVE)
//                .build();
//
//        doReturn(new Review(postDto.getWriter(), postDto.getImageLink(), postDto.getRating(), postDto.getComment()))
//                .when(reviewRepository).save(any(Review.class));
//
//        // when
//        ReviewResponse.ViewDto post = reviewService.post(postDto);
//
//        // then
//        Assertions.assertThat(post.getWriter()).isEqualTo(postDto.getWriter());
    }
}