package com.wecancodeit.reviews.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review gamePlay = new Review(1L, "Skyrim Gameplay", "/images/character.png", "General Overview",
				"The Elder Scrolls V: Skyrim is an action role-playing video game developed by Bethesda Game Studios",
				"Picture of character creation:");
		Review questLines = new Review(2L, "Quest Lines", "/images/quest.png", "Gameplay", "There are many quest lines that your character can complete.", "Completing quests can earn you gold and experience.");
		Review guilds = new Review(3L, "Guilds", "/images/thief.jpg", "Factions", "There are many factions you can join in Skyrim. Examples include The Thieves Guild, Dark Brotherhood, and Nightingales.",
				"Stop! Thief!");

		reviewList.put(gamePlay.getId(), gamePlay);
		reviewList.put(questLines.getId(), questLines);
		reviewList.put(guilds.getId(), guilds);
	}

	// constructor for testing purposes
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}

	}

	public Review findOne(long reviewId) {
		return reviewList.get(reviewId);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
