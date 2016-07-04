package org.pickers.book;

import org.pickers.common.PrimaryKey;

public class BookVo implements PrimaryKey<Integer>{
	
	private Integer key;
	
	private String name;		//책 제목 
	private String wirter;		//글 쓴이
	private String company;		//출판사
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWirter() {
		return wirter;
	}
	public void setWirter(String wirter) {
		this.wirter = wirter;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	@Override
	public void setKey(Integer key) {
		// TODO Auto-generated method stub
		this.key = key;
		
	}
	@Override
	public Integer getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	@Override
	public String toString() {
		return "Book [key=" + key + ", name=" + name + ", wirter=" + wirter
				+ ", company=" + company + "]";
	}
	
	
	
}
