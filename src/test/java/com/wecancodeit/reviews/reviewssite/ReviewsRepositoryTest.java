package com.wecancodeit.reviews.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewsRepositoryTest {
	
	ReviewRepository underTest;

	private long firstReviewId = 1; 
	private Review firstReview = new Review(firstReviewId, "title", "image url", "review category", "content", "desciption");
	
	private long secondReviewId = 2;
	private Review secondReview = new Review(secondReviewId, "title", "image url", "review category", "content", "desciption");
	
	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));	
	}
	
	@Test
	public void shouldFindASecondReview() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));	
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}
}
