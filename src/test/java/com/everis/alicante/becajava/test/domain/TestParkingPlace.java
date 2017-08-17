package com.everis.alicante.becajava.test.domain;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.ParkingPlace;

public class TestParkingPlace {

	private ParkingPlace expectedParkingPlace;
	private final int expectedIdparkingplace = 1;
	private final int expectedParkingnumber = 25;
	private final double expectedParkingprize = 10;
	private final double expectedParkingsize = 10;
	private final byte expectedParkingstate = 1;
	private final Booking expectedBooking = new Booking();
	private Set<Booking> expectedBookings = new HashSet<>();

	@Before
	public void init() {
		expectedParkingPlace = new ParkingPlace();
		expectedParkingPlace.setIdparkingplace(expectedIdparkingplace);
		expectedParkingPlace.setParkingnumber(expectedParkingnumber);
		expectedParkingPlace.setParkingprize(expectedParkingprize);
		expectedParkingPlace.setParkingsize(expectedParkingsize);
		expectedParkingPlace.setParkingstate(expectedParkingstate);
		expectedBookings.add(expectedBooking);
		expectedParkingPlace.setBookings(expectedBookings);
	}

	@Test
	public void testConstructor() {
		// Arrange
		ParkingPlace parkingPlace;
		// Action
		parkingPlace = new ParkingPlace();
		// Assert
		Assert.assertNotNull(parkingPlace);
	}

	@Test
	public void testGetIdparkingplace() {
		// Action
		int result = expectedParkingPlace.getIdparkingplace();
		// Assert
		Assert.assertEquals(expectedIdparkingplace, result);
	}

	@Test
	public void testSetIdparkingplace() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		// Action
		resultParkingPlace.setIdparkingplace(expectedIdparkingplace);
		// Assert
		Assert.assertEquals(expectedIdparkingplace, resultParkingPlace.getIdparkingplace());
	}

	@Test
	public void testGetParkingnumber() {
		// Action
		int resultParkingNumber = expectedParkingPlace.getParkingnumber();
		// Assert
		Assert.assertEquals(expectedParkingnumber, resultParkingNumber);
	}

	@Test
	public void testSetParkingnumber() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		// Action
		resultParkingPlace.setParkingnumber(expectedParkingnumber);
		// Assert
		Assert.assertEquals(expectedParkingnumber, resultParkingPlace.getParkingnumber());
	}

	@Test
	public void testGetParkingprize() {
		//Action
		double resultParkingPrize = expectedParkingPlace.getParkingprize();
		//Assert
		Assert.assertEquals(expectedParkingprize, resultParkingPrize,0);
	}

	@Test
	public void testSetParkingprize() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		// Action
		resultParkingPlace.setParkingprize(expectedParkingprize);
		// Assert
		Assert.assertEquals(expectedParkingprize, resultParkingPlace.getParkingprize(),0);
	}

	@Test
	public void testGetParkingsize() {
		// Action
		double resultParkingSize=expectedParkingPlace.getParkingsize();
		// Assert
		Assert.assertEquals(expectedParkingsize, resultParkingSize,0);
	}

	@Test
	public void testSetParkingsize() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		// Action
		resultParkingPlace.setParkingsize(expectedParkingsize);
		// Assert
		Assert.assertEquals(expectedParkingsize, resultParkingPlace.getParkingsize(),0);
	}

	@Test
	public void testGetParkingstate() {
		// Action
		byte resultParkingState = expectedParkingPlace.getParkingstate();
		// Assert
		Assert.assertEquals(expectedParkingstate, resultParkingState);
	}

	@Test
	public void testSetParkingstate() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		// Action
		resultParkingPlace.setParkingstate(expectedParkingstate);
		// Assert
		Assert.assertEquals(expectedParkingstate, resultParkingPlace.getParkingstate());
	}

	@Test
	public void testGetBookings() {
		// Action
		Set<Booking> resultBookings = expectedParkingPlace.getBookings();
		// Assert
		Assert.assertEquals(expectedBookings, resultBookings);
	}

	@Test
	public void testSetBookings() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		// Action
		resultParkingPlace.setBookings(expectedBookings);
		// Assert
		Assert.assertEquals(expectedBookings, resultParkingPlace.getBookings());
	}

	@Test
	public void testAddBooking() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		// Action
		resultParkingPlace.addBooking(expectedBooking);
		// Assert
		Assert.assertEquals(expectedBooking, resultParkingPlace.getBookings().iterator().next());
	}

	@Test
	public void testRemoveBooking() {
		// Arrange
		ParkingPlace resultParkingPlace = new ParkingPlace();
		resultParkingPlace.addBooking(expectedBooking);
		// Action
		resultParkingPlace.removeBooking(expectedBooking);
		// Assert
		Assert.assertFalse(resultParkingPlace.getBookings().iterator().hasNext());
	}

	@Test
	public void testToString() {
		//Arrange
		String expectedToString = "Plaza nº" + expectedParkingnumber + ", precio = " + expectedParkingprize + " , tamaño = " + expectedParkingsize;
		// Action
		String resultToString = expectedParkingPlace.toString();
		// Assert
		Assert.assertEquals(expectedToString, resultToString);
	}
}
