package br.com.java.interfaces.service;

import br.com.java.interfaces.entities.CarRental;

/***
 * 
 * @author dionatan
 *
 */

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private BrazilTaxService brazilTaxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brazilTaxService = brazilTaxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public void processInvoice(CarRental carRental) {

	}

}
