package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.ParkingPlace;

public interface ParkingPlaceService {  
	
	
	List<ParkingPlace> list();
	
	ParkingPlace getFreePlace();
	
	List<ParkingPlace> listFreePlaces();	

}
