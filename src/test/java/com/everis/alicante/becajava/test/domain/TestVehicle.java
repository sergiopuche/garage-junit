package com.everis.alicante.becajava.test.domain;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;

public class TestVehicle {

	private final Booking expectedBooking = new Booking();
	private Set<Booking> expectedBookings = new HashSet<>();
	private final Integer expectedIdVehicle = 1;
	private final Client expectedClient = new Client();
	private final String expectedVehicleModel = "Peugeot 308";
	private final String expectedPlate = "AB2115T";

	private Vehicle expectedVehicle;

	@Before
	public void init() {
		expectedVehicle = new Vehicle();
		expectedBookings.add(expectedBooking);
		expectedVehicle.setBookings(expectedBookings);
		expectedVehicle.setClient(expectedClient);
		expectedVehicle.setIdvehicle(expectedIdVehicle);
		expectedVehicle.setVehiclemodel(expectedVehicleModel);
		expectedVehicle.setVehiclePlate(expectedPlate);
	}

	@Test
	public void testConstructor() {
		// Arrange
		Vehicle vehicle;
		// Action
		vehicle = new Vehicle();
		// Assert
		Assert.assertNotNull(vehicle);
	}

	@Test
	public void testGetIdvehicle() {
		// Action
		Integer idResult = expectedVehicle.getIdvehicle();
		// Assert
		Assert.assertEquals(expectedIdVehicle, idResult);

	}

	@Test
	public void testSetIdvehicle() {
		// Arrange
		Vehicle resultVehicle = new Vehicle();
		// Action
		resultVehicle.setIdvehicle(expectedIdVehicle);
		// Assert
		Assert.assertEquals((int) expectedIdVehicle, resultVehicle.getIdvehicle());
	}

	@Test
	public void testGetVehiclemodel() {
		// Action
		String modelResult = expectedVehicle.getVehiclemodel();
		// Assert
		Assert.assertEquals(expectedVehicleModel, modelResult);
	}

	@Test
	public void testSetVehiclemodel() {
		// Arrange
		Vehicle resultVehicle = new Vehicle();
		// Action
		resultVehicle.setVehiclemodel(expectedVehicleModel);
		// Assert
		Assert.assertEquals(expectedVehicleModel, resultVehicle.getVehiclemodel());
	}

	@Test
	public void testGetVehicleplate() {
		// Action
		String plateResult = expectedVehicle.getVehicleplate();
		// Assert
		Assert.assertEquals(expectedPlate, plateResult);
	}

	@Test
	public void testSetVehiclePlate() {
		// Arrange
		Vehicle resultVehicle = new Vehicle();
		// Action
		resultVehicle.setVehiclePlate(expectedPlate);
		// Assert
		Assert.assertEquals(expectedPlate, resultVehicle.getVehicleplate());
	}

	@Test
	public void testGetBookings() {
		// Action
		Set<Booking> bookingsResult = expectedVehicle.getBookings();
		// Assert
		Assert.assertEquals(expectedBookings, bookingsResult);
	}

	@Test
	public void testSetBookings() {
		// Arrange
		Vehicle resultVehicle = new Vehicle();
		// Action
		resultVehicle.setBookings(expectedBookings);
		// Assert
		Assert.assertEquals(expectedBookings, resultVehicle.getBookings());
	}

	@Test
	public void testAddBooking() {
		// Arrange
		Vehicle resultVehicle = new Vehicle();
		// Action
		resultVehicle.addBooking(expectedBooking);
		// Assert
		Assert.assertEquals(expectedBooking, resultVehicle.getBookings().iterator().next());
	}

	@Test
	public void testRemoveBooking() {
		// Arrange
		Vehicle resultVehicle = new Vehicle();
		resultVehicle.addBooking(expectedBooking);
		// Action
		resultVehicle.removeBooking(expectedBooking);
		// Assert
		Assert.assertFalse(resultVehicle.getBookings().iterator().hasNext());
		;
	}

	@Test
	public void testGetClient() {
		// Action
		Client result = expectedVehicle.getClient();
		// Assert
		Assert.assertEquals(expectedClient, result);
	}

	@Test
	public void testSetClient() {
		// Arrange
		Vehicle resultVehicle = new Vehicle();
		// Action
		resultVehicle.setClient(expectedClient);
		// Assert
		Assert.assertEquals(expectedClient, resultVehicle.getClient());
	}
}
