package com.cg.hra.bean;

public class CustomerDetails {
	private String name;
	private String email;
	private String address;
	private long mobileNo;
	private String roomType;
	private int roomNo;
	private String status;
	public CustomerDetails()
	{
		
	}
	public CustomerDetails(String name, String address, String email, long mobileNo, int roomNo, String roomType,
			String status) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
}
