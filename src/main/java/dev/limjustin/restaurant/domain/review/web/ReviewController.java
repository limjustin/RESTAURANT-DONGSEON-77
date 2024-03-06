package dev.limjustin.restaurant.domain.review.web;

import dev.limjustin.restaurant.domain.review.dto.ReviewRequest;
import dev.limjustin.restaurant.domain.review.service.ReviewService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
