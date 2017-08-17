package com.everis.alicante.becajava.interfaces;

import java.util.List;

import com.everis.alicante.becajava.domain.ParkingPlace;

public interface ParkingPlaceDAO {
	
	void create(ParkingPlace parkingPlace);
	
	ParkingPlace readById(int id);
	
	void update(ParkingPlace parkingPlace);
	
	void delete(ParkingPlace parkingPlace);
	
	List<ParkingPlace> findAll();
	
	int findFreeParkingPlace();
	
	List<ParkingPlace> findFreeParkingPlaces();
		

}
