package com.xworkz.galaxy.dto;

import java.util.Optional;

public class GiftDTO {
	private Optional<GiftType> type;
	private Optional<String> givenBy;
	private double price;

	public enum GiftType {
		CHOCOLATE, WATCH, BAG, MOBILE, FLOWER, DOLL, MUG, RING
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Optional<GiftType> getType() {
		return type;
	}

	public void setType(Optional<GiftType> type) {
		this.type = type;
	}

	public Optional<String> getGivenBy() {
		return givenBy;
	}

	public void setGivenBy(Optional<String> givenBy) {
		this.givenBy = givenBy;
	}

	@Override
	public String toString() {
		return "GiftDTO [type=" + type + ", givenBy=" + givenBy + ", price=" + price + "]";
	}
}
