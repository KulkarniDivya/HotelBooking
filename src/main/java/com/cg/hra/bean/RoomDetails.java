package com.cg.hra.bean;

public class RoomDetails {
	private String roomType;
	private String status;
	
	public RoomDetails(String roomType, String status) {
		// TODO Auto-generated constructor stub
		this.roomType = roomType;
		this.status = status;
	}
	public String getRoom_Type() {
		return roomType;
	}
	public void setRoom_Type(String roomType) {
		this.roomType = roomType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
