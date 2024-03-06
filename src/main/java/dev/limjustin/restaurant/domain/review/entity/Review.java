package dev.limjustin.restaurant.domain.review.entity;

import dev.limjustin.restaurant.global.enums.Keyword;
import dev.limjustin.restaurant.global.enums.Rating;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    private String writer;  // 작성자
    private LocalDate date;  // 방문 날짜
    private String imageLink;  // 사진 링크 (AWS S3)

    @Enumerated(EnumType.STRING)
    private Rating rating;  // 별점
    private String comment;  // 내용
    private List<Keyword> keywords;  // 키워드

    @Builder
    public Review(String writer, LocalDate date, String imageLink, Rating rating, String comment, List<Keyword> keywords) {
        this.writer = writer;
        this.date = date;
        this.imageLink = imageLink;
        this.rating = rating;
        this.comment = comment;
        this.keywords = keywords;
    }
}
