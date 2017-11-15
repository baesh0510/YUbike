package jj17.yubicycle.model;

import javafx.beans.property.SimpleIntegerProperty;

public class bicycleStatus {

	private SimpleIntegerProperty okRental;

	public bicycleStatus() {
		this(0);
	}

	public bicycleStatus(int okRental) {
		this.okRental = new SimpleIntegerProperty(okRental);
	}

	public SimpleIntegerProperty getOkRental() {
		return okRental;
	}

	public void setOkRental(int okRental) {
		this.okRental.set(okRental);
	}


}