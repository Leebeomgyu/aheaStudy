package org.pickers.book;

public class Book {

	String code;		//책번호
	String name;		//책이름
	String publisher;	//출판사
	String writer;		//저자
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	@Override
	public String toString() {
		return name + " [책번호=" + code + ", 출판사="
				+ publisher + ", 글쓴이=" + writer + "]";
	}
	
}
