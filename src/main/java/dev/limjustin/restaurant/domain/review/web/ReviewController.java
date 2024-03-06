package dev.limjustin.restaurant.domain.review.web;

import dev.limjustin.restaurant.domain.review.dto.ReviewRequest;
import dev.limjustin.restaurant.domain.review.service.ReviewService;
import dev.limjustin.restaurant.global.enums.Keyword;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/api/v1/post")
    public String createPostForm(Model model) {
        model.addAttribute("formDto", new ReviewRequest.FormDto());
        return "review/post";
    }

    @PostMapping("/api/v1/post")
    public ResponseEntity<?> post(@ModelAttribute("formDto") ReviewRequest.FormDto formDto) {

        System.out.println("formDto.getKeywords() = " + formDto.getKeywords());

        List<Keyword> keywords = new ArrayList<>(formDto.getKeywords());

        ReviewRequest.PostDto postDto = ReviewRequest.PostDto.builder()
                .writer(formDto.getWriter())
                .rating(formDto.getRating())
                .comment(formDto.getComment())
                .imageLink("string")
                .keywords(keywords)
                .build();

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
