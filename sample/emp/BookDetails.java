package org.sample.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "BOOK_DETAILS")
@Entity
public class BookDetails {
	@Id
	@Column(name = "S_NO")
	@GeneratedValue()
	private int serialNumber;
	@Column(name = "BOOK_NAME", length = 150, nullable = false)
	private String bookName;
	@Column(name = "BOOK_PRICE")
	private double bookPrice;
	@Column(name = "PUBLISHER_ID", nullable = false)
	private String publisherId;
	@Column(name = "ISBN_NUMBER", unique = true, nullable = false)
	private long isbnNumber;
	public BookDetails(String bookName, double bookPrice, String publisherId, long isbnNumber) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.publisherId = publisherId;
		this.isbnNumber = isbnNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(String emailId) {
		this.publisherId = emailId;
	}
	public long getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	
}
