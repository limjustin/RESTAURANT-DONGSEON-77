package dev.limjustin.restaurant.domain.review.web;

import dev.limjustin.restaurant.domain.review.dto.ReviewRequest;
import dev.limjustin.restaurant.domain.review.service.ReviewService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/api/v1/post")
    public ResponseEntity<?> post(@RequestBody ReviewRequest.PostDto postDto) {
        return ResponseEntity.ok(reviewService.post(postDto));
    }

    @GetMapping("/api/v1/reviews")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(reviewService.findAll());
    }

    @GetMapping("/api/v1/review/{reviewId}")
    public ResponseEntity<?> findById(@PathVariable("reviewId") Long reviewId) {
        return ResponseEntity.ok(reviewService.findById(reviewId));
    }
}
