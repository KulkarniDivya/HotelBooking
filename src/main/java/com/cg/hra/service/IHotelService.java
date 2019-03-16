package com.cg.hra.service;

import com.cg.hra.bean.CustomerDetails;

public interface IHotelService {
	int bookRoom(CustomerDetails c); //method to book the room by customer
	CustomerDetails getCustomerDetails(int custId); //method to get the customer details
}
