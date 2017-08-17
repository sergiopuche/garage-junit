package com.everis.alicante.becajava.test.domain;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;

public class TestClient {

	private Client expectedClient;
	private final int expectedIdClient = 1;
	private final String expectedName = "Jose Maria";
	private final String expectedNif = "48474413G";
	private final String expectedSurname = "Cantos";
	private final String expectedTelephone = "609375483";
	private Set<Booking> expectedBookings = new HashSet<>();
	private final Booking expectedBooking = new Booking();
	private Set<Vehicle> expectedVehicles = new HashSet<>();
	private final Vehicle expectedVehicle = new Vehicle();

	@Before
	public void init() {
		expectedClient = new Client();
		expectedClient.setIdclient(expectedIdClient);
		expectedClient.setName(expectedName);
		expectedClient.setSurname(expectedSurname);
		expectedClient.setNif(expectedNif);
		expectedClient.setTelephone(expectedTelephone);
		expectedBookings.add(expectedBooking);
		expectedClient.setBookings(expectedBookings);
		expectedVehicles.add(expectedVehicle);
		expectedClient.setVehicles(expectedVehicles);
	}

	@Test
	public void testConstructor() {
		// Arrange
		Client client;
		// Action
		client = new Client();
		// Assert
		Assert.assertNotNull(client);
	}

	@Test
	public void testGetIdclient() {
		// Action
		int result = expectedClient.getIdclient();
		// Assert
		Assert.assertEquals(expectedIdClient, result);

	}

	@Test
	public void testSetIdclient() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.setIdclient(expectedIdClient);
		// Assert
		Assert.assertEquals(expectedIdClient, resultClient.getIdclient());
	}

	@Test
	public void testGetName() {
		// Action
		String resultName = expectedClient.getName();
		// Assert
		Assert.assertEquals(expectedName, resultName);
	}

	@Test
	public void testSetName() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.setName(expectedName);
		// Assert
		Assert.assertEquals(expectedName, resultClient.getName());
	}

	@Test
	public void testGetNif() {
		// Action
		String resultNif = expectedClient.getNif();
		// Assert
		Assert.assertEquals(expectedNif, resultNif);
	}

	@Test
	public void testSetNif() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.setNif(expectedNif);
		// Assert
		Assert.assertEquals(expectedNif, resultClient.getNif());
	}

	@Test
	public void testGetSurname() {
		// Action
		String resultSurname = expectedClient.getName();
		// Assert
		Assert.assertEquals(expectedName, resultSurname);
	}

	@Test
	public void testSetSurname() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.setSurname(expectedSurname);
		// Assert
		Assert.assertEquals(expectedSurname, resultClient.getSurname());
	}

	@Test
	public void testGetTelephone() {
		// Action
		String resultTelephone = expectedClient.getTelephone();
		// Assert
		Assert.assertEquals(expectedTelephone, resultTelephone);
	}

	@Test
	public void testSetTelephone() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.setTelephone(expectedTelephone);
		// Assert
		Assert.assertEquals(expectedTelephone, resultClient.getTelephone());
	}

	@Test
	public void testGetBookings() {
		// Action
		Set<Booking> resultBookings = expectedClient.getBookings();
		// Assert
		Assert.assertEquals(expectedBookings, resultBookings);
	}

	@Test
	public void testSetBookings() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.setBookings(expectedBookings);
		// Assert
		Assert.assertEquals(expectedBookings, resultClient.getBookings());
	}

	@Test
	public void testAddBooking() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.addBooking(expectedBooking);
		// Assert
		Assert.assertEquals(expectedBooking, resultClient.getBookings().iterator().next());
	}

	@Test
	public void testRemoveBooking() {
		// Arrange
		Client resultClient = new Client();
		resultClient.addBooking(expectedBooking);
		// Action
		resultClient.removeBooking(expectedBooking);
		// Assert
		Assert.assertFalse(resultClient.getBookings().iterator().hasNext());
	}

	@Test
	public void testGetVehicles() {
		// Action
		Set<Vehicle> resultVehicles = expectedClient.getVehicles();
		// Assert
		Assert.assertEquals(expectedVehicles, resultVehicles);

	}

	@Test
	public void testSetVehicles() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.setVehicles(expectedVehicles);
		// Assert
		Assert.assertEquals(expectedVehicles, resultClient.getVehicles());
	}

	@Test
	public void testAddVehicle() {
		// Arrange
		Client resultClient = new Client();
		// Action
		resultClient.addVehicle(expectedVehicle);
		// Assert
		Assert.assertEquals(expectedVehicle, resultClient.getVehicles().iterator().next());
	}

	@Test
	public void testRemoveVehicle() {
		// Arrange
		Client resultClient = new Client();
		resultClient.addVehicle(expectedVehicle);
		// Action
		resultClient.removeVehicle(expectedVehicle);
		// Assert
		Assert.assertFalse(resultClient.getVehicles().iterator().hasNext());
	}
}
