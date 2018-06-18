package com.wecancodeit.reviews.reviewssite;

public class Review {

	private long id;
	private String title;
	private String url;
	private String category;
	private String content;
	private String description;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDescription() {
		return description;
	}

	public Review(long id, String title, String reviewImageUrl, String category, String content, String description) {
		this.id = id;
		this.title = title;
		this.url = reviewImageUrl;
		this.category = category;
		this.content = content;
		this.description = description;
	}

}
