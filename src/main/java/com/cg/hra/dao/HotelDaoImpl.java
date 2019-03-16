package com.cg.hra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.hra.bean.CustomerDetails;
import com.cg.hra.bean.RoomDetails;
import com.cg.hra.utility.BookedException;
import com.cg.hra.utility.InvalidIdException;
import com.cg.hra.utility.InvalidRoomTypeException;

public class HotelDaoImpl implements IHotelDao {
	HashMap<Integer,RoomDetails> room;
	HashMap<Integer,CustomerDetails> customer = new HashMap<Integer, CustomerDetails>();
	static int count = 1000;
	
	//Constructor used to add the room details into the hash map
	public HotelDaoImpl()
	{
		room = new HashMap<Integer, RoomDetails>();//Setting the values for room hash map
		room.put(101, new RoomDetails("AC_SINGLE","NotBooked"));
		room.put(102, new RoomDetails("AC_SINGLE","NotBooked"));
		room.put(103, new RoomDetails("AC_SINGLE","NotBooked"));
		room.put(201, new RoomDetails("NONAC_SINGLE","NotBooked"));
		room.put(202, new RoomDetails("NONAC_SINGLE","NotBooked"));
		room.put(203, new RoomDetails("NONAC_SINGLE","NotBooked"));
	}
	
	//method to book the room by customer
	public int bookRoom(CustomerDetails c) {
		// TODO Auto-generated method stub
		RoomDetails rd = room.get(c.getRoomNo()); //Retrieving the RoomDetails object of a particular room no
		int id = 0;
		if(room.containsKey(c.getRoomNo())) //Checking if room no given by customer is correct or not
		{
			
			if(c.getRoomType().equals(rd.getRoom_Type())) //Checking if room type of the given room no is same or not
			{
				if(rd.getStatus().equals("NotBooked")) //Checking if the room is booked or not
				{
					c.setStatus("Booked");
					customer.put(count, new CustomerDetails(c.getName(),c.getAddress(),c.getEmail(),c.getMobileNo(),c.getRoomNo(),c.getRoomType(),c.getStatus()));
					id = count;
					count++;
					rd.setStatus("Booked");
					room.put(c.getRoomNo(), rd);
				}	
				else
				{
					try {
						throw new BookedException();
					} catch (BookedException e) {
						// TODO Auto-generated catch block
					}
				}
			}
			else
			{
				try {
					throw new InvalidRoomTypeException();
				} catch (InvalidRoomTypeException e) {
					// TODO Auto-generated catch block
				}
			}
		}
		else
		{
			try {
				throw new InvalidIdException();
			} catch (InvalidIdException e) {
				// TODO Auto-generated catch block
				
			}
		}
		
		return id;
	}

	//method to get the customer details
	public CustomerDetails getCustomerDetails(int custId) {
		// TODO Auto-generated method stub
		if(customer.containsKey(custId))
			return customer.get(custId);
		else
			return null;//returning the value present in key custid which is the object of CustomerDetails
		
	}

}
