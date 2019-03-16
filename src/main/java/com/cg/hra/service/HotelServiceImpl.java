package com.cg.hra.service;

import com.cg.hra.bean.CustomerDetails;
import com.cg.hra.dao.HotelDaoImpl;
import com.cg.hra.dao.IHotelDao;
import com.cg.hra.utility.InvalidMobileNoException;

public class HotelServiceImpl implements IHotelService {
	IHotelDao iHotelDao = new HotelDaoImpl();
	
	//method to book the room by customer
	public int bookRoom(CustomerDetails c) {
		// TODO Auto-generated method stub
		
		return iHotelDao.bookRoom(c); //Calling the bookRoom() in Dao layer 
	}

	//method to get the customer details
	public CustomerDetails getCustomerDetails(int custId) {
		// TODO Auto-generated method stub
		return iHotelDao.getCustomerDetails(custId); //Calling the getCustomerDetails() in Dao layer
	}

}
