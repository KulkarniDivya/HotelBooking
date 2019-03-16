package com.cg.hra.Hotel;

import java.util.Scanner;

import com.cg.hra.bean.CustomerDetails;
import com.cg.hra.service.HotelServiceImpl;
import com.cg.hra.service.IHotelService;

public class MainUI {
	static Scanner scan = new Scanner(System.in);
	static CustomerDetails c = new CustomerDetails();
	static IHotelService customerService = new HotelServiceImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Menu");
			System.out.println("1.Book room");
			System.out.println("2.View Booking Status");
			System.out.println("3.Exit");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter the Details:");
				setInfo();
				int custId = customerService.bookRoom(c); // calling the bookRoom() which returns the customer id as the
															// value so that we can print the customer id
				
				if (custId != 0)// checking if room has been booked or not
				{
					System.out.println("Your Room has been successfully booked , Customer ID:" + custId);// printing
																											// customer
																											// id
				}

				break;
			case 2:
				System.out.println("Enter Customer Id:");
				int id = scan.nextInt();
				getInfo(id);// method to print the customer details

				break;
			case 3:
				System.out.println("Thank You!");
				System.exit(0);
			default:
				System.out.println("Give proper input");
			}
		}
	}

	// method to print the customer details
	private static void getInfo(int id) {
		// TODO Auto-generated method stub
		CustomerDetails c1 = customerService.getCustomerDetails(id);
		if (c1 != null) {
			System.out.println("Name of the Customer:" + c1.getName());
			System.out.println("Booking Status:" + c1.getStatus());
			System.out.println("Room No:" + c1.getRoomNo());
			System.out.println("Room Type:" + c1.getRoomType());
		} else
			System.out.println("ERROR");
	}

	// method to set the values for the customer object
	private static CustomerDetails setInfo() {
		// TODO Auto-generated method stub
		System.out.println("Enter Customer Name:");
		c.setName(scan.next());
		System.out.println("Enter EMail:");
		c.setEmail(scan.next());
		System.out.println("Enter Address:");
		c.setAddress(scan.next());
		System.out.println("Enter Mobile Number:");
		c.setMobileNo(scan.nextLong());
		System.out.println("Enter Room No:");
		c.setRoomNo(scan.nextInt());
		System.out.println("Enter Room Type:");
		c.setRoomType(scan.next());
		return c;
	}

}
