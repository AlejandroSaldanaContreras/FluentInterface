package com.fluentinterface.review;

public class ReviewPage {
	private ReviewPageActController act;
	private ReviewPageVerifyController verify;
	
	private ReviewPage(ReviewPageActController _act, ReviewPageVerifyController _verify) {
		this.act = _act;
		this.verify = _verify;
	}
	
	public ReviewPageActController act() {
		return act;
	}
	
	public ReviewPageVerifyController verify() {
		return verify;
	}
	
	public static ReviewPage getReviewPage() {
		return new ReviewPage(new ReviewPageActController(), new ReviewPageVerifyController());
	}

}
