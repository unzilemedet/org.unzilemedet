package com.bilgeadam.oopodev;

public class Ogretmen extends Calisan {


	public Ogretmen(String ad, String soyad, Meslekler meslek, double maas) {
		super(ad, soyad, meslek, maas);
	 
	}

	public double maasZam(double maas) {
		return maas=maas*1.2;
	}

	

}
