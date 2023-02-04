package com.bilgeadam.oopodev;

public class Stajyer extends Calisan {
	
	
	public Stajyer(String ad, String soyad, Meslekler meslek, double maas) {
		super(ad, soyad, meslek, maas);
	 
	}

	public double maasZam(double maas) {
		return maas=maas*0.7;
	}

}
