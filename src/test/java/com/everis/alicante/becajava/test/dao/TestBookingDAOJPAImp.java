package com.everis.alicante.becajava.test.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.ParkingPlace;
import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.implementaciones.BookingDAOJPAImpl;
import com.everis.alicante.becajava.interfaces.BookingDAO;

@RunWith(MockitoJUnitRunner.class)
public class TestBookingDAOJPAImp {

	private BookingDAO bookingDAO;

	@Mock
	private EntityManager emMock;

	@Mock
	private EntityTransaction etMock;

	@Before
	public void init() {
		this.bookingDAO = new BookingDAOJPAImpl(emMock);
	}

	@Test
	public void testConstructor() {
		// Arrange
		BookingDAO bookingDAO;
		// Action
		bookingDAO = new BookingDAOJPAImpl(emMock);
		// Assert
		Assert.assertNotNull(bookingDAO);
	}

	@Test
	public void testCreate() {

	}

	@Test
	public void testReadById() {

	}

	@Test
	public void testUpdate() {

	}

	@Test
	public void testDelete() {

	}

	@Test
	public void testFindAll() {

	}
}
