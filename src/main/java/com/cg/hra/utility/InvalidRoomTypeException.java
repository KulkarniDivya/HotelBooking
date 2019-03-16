package com.cg.hra.utility;

import com.cg.hra.bean.RoomDetails;

public class InvalidRoomTypeException extends Exception {

	public InvalidRoomTypeException() {
		// TODO Auto-generated constructor stub
		System.out.println("RoomType for given RoomNo is wrong, Please check");
	}
}
