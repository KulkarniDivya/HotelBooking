package com.cg.hra.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.hra.bean.CustomerDetails;

class HotelDaoImplTest {
	static HotelDaoImpl hotelDaoImpl;
	static CustomerDetails cd;
	
	@BeforeAll
	public static void init() {
		hotelDaoImpl = new HotelDaoImpl();
		cd = new CustomerDetails();
	}
	
	@Test
	void testBookRoom() {
		cd.setName("Divya");
		cd.setEmail("divya@gmail.com");
		cd.setAddress("hyd");
		cd.setMobileNo(9876543210L);
		cd.setRoomNo(101);
		cd.setRoomType("AC_SINGLE");//Setting values for the object of CustomerDetails class
		assertEquals(1000, hotelDaoImpl.bookRoom(cd));//Testing bookRoom()
	}
	
	@Test
	void testGetCustomerDetails() {
		cd.setName("Divya");
		cd.setEmail("divya@gmail.com");
		cd.setAddress("hyd");
		cd.setMobileNo(9876543210L);
		cd.setRoomNo(101);
		cd.setRoomType("AC_SINGLE");//Setting values for the object of CustomerDetails class
		assertEquals(cd, hotelDaoImpl.getCustomerDetails(1000));//Testing getCustomerDetails()
	}

}
