package com.everis.alicante.becajava.test.domain;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.ParkingPlace;
import com.everis.alicante.becajava.domain.Vehicle;

public class TestBooking {

	private final Date bookingDate = new Date();
	private Client expectedClient = new Client();
	private final Integer bookingId = 1;
	private ParkingPlace expectedParkingPlace = new ParkingPlace();
	private Vehicle expectedVehicle = new Vehicle();

	private Booking expectedBooking;

	@Before
	public void init() {
		expectedBooking = new Booking();
		expectedBooking.setBookingdate(bookingDate);
		expectedBooking.setClient(expectedClient);
		expectedBooking.setIdbooking(bookingId);
		expectedBooking.setParkingplace(expectedParkingPlace);
		expectedBooking.setVehicle(expectedVehicle);
	}

	@Test
	public void testConstructor() {
		// Arrange
		Booking booking;
		// Action
		booking = new Booking();
		// Assert
		Assert.assertNotNull(booking);
	}

	@Test
	public void testGetBookingDate() {
		// Action
		Date date = expectedBooking.getBookingdate();
		// Assert
		Assert.assertEquals(bookingDate, date);
	}

	@Test
	public void testSetBookingDate() {
		// Arrange
		Booking booking = new Booking();
		// Action
		booking.setBookingdate(bookingDate);
		// Assert
		Assert.assertEquals(bookingDate, booking.getBookingdate());
	}

	@Test
	public void testGetClient() {
		// Action
		Client client = expectedBooking.getClient();
		// Assert
		Assert.assertEquals(expectedClient, client);
	}

	@Test
	public void testSetClient() {
		// Arrange
		Booking booking = new Booking();
		// Action
		booking.setClient(expectedClient);
		// Assert
		Assert.assertEquals(expectedClient, booking.getClient());
	}

	@Test
	public void testGetIdBooking() {
		// Action
		Integer id = expectedBooking.getIdbooking();
		// Assert
		Assert.assertEquals(bookingId, id);
	}

	@Test
	public void testSetIdBooking() {
		// Arrange
		Booking booking = new Booking();
		// Action
		booking.setIdbooking(bookingId);
		// Assert
		Assert.assertEquals((int) bookingId, booking.getIdbooking());
	}

	@Test
	public void testGetParkingPlace() {
		// Action
		ParkingPlace place = expectedBooking.getParkingPlace();
		// Assert
		Assert.assertEquals(expectedParkingPlace, place);
	}

	@Test
	public void testSetParkingPlace() {
		// Arrange
		Booking booking = new Booking();
		// Action
		booking.setParkingplace(expectedParkingPlace);
		// Assert
		Assert.assertEquals(expectedParkingPlace, booking.getParkingPlace());
	}

	@Test
	public void testGetVehicle() {
		// Action
		Vehicle vehicle = expectedBooking.getVehicle();
		// Assert
		Assert.assertEquals(expectedVehicle, vehicle);
	}

	@Test
	public void testSetVehicle() {
		// Arrange
		Booking booking = new Booking();
		// Action
		booking.setVehicle(expectedVehicle);
		// Assert
		Assert.assertEquals(expectedVehicle, booking.getVehicle());
	}

	@Test
	public void testToString() {
		// Arrange
		String expectedString = "Reserva a fecha " + bookingDate + " , del cliente=" + null + " , para la plaza " + 0
				+ ", y el vehiculo con matricula " + null + "]";
		// Action
		String result = expectedBooking.toString();
		// Assert
		Assert.assertEquals(expectedString, result);

	}

}
