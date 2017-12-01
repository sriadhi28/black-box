package com.book;

public class PaperBook extends Book {
	private float weight;
	private int inStock;

	public PaperBook(int id, String title, String author, double price, long isbn, float weight, int inStock) {
		super(id, title, author, price, isbn);
		this.weight = weight;
		this.inStock = inStock;
	}

	public PaperBook(String title, String author, double price, long isbn, float weight, int inStock) {
		super(title, author, price, isbn);
		this.weight = weight;
		this.inStock = inStock;
	}

	public PaperBook() {
		super();
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

}
