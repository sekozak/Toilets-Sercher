package com.example.backendtoilet_searcher.api.review;

import com.example.backendtoilet_searcher.api.review.dto.ReviewRequest;
import com.example.backendtoilet_searcher.domain.review.Review;
import com.example.backendtoilet_searcher.domain.review.ReviewRepository;
import com.example.backendtoilet_searcher.domain.review.ReviewService;
import com.example.backendtoilet_searcher.domain.toilet.Toilet;
import com.example.backendtoilet_searcher.domain.toilet.ToiletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping()
    public List<Review> getReviews(){
        return reviewService.getReviews();
    }

    @PostMapping()
    public Review createReview(@RequestBody ReviewRequest request){
        return reviewService.insertReview(request);
    }

}