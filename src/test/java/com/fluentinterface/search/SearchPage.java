package com.fluentinterface.search;

public class SearchPage {
	private SearchPageActController act;
	private SearchPageVerifyController verify;
	
	private SearchPage(SearchPageActController _act, SearchPageVerifyController _verify) {
		this.act = _act;
		this.verify = _verify;
	}
	
	public SearchPageActController act() {
		return act;
	}
	
	public SearchPageVerifyController verify() {
		return verify;
	}
	
	public static SearchPage getSearchPage() {
		return new SearchPage(new SearchPageActController(), new SearchPageVerifyController());
	}
}
