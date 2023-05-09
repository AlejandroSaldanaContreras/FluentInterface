package com.fluentinterface.product;

public class ProductPage {
	private ProductPageActController act;
	private ProductPageVerifyController verify;
	
	private ProductPage(ProductPageActController _act, ProductPageVerifyController _verify) {
		this.act = _act;
		this.verify = _verify;
	}
	
	public ProductPageActController act() {
		return act;
	}
	
	public ProductPageVerifyController verify() {
		return verify;
	}
	
	public static ProductPage getProductPage() {
		return new ProductPage(new ProductPageActController(), new ProductPageVerifyController());
	}

}
