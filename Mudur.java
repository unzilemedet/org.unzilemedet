package com.bilgeadam.oopodev;

public class Mudur extends Calisan {



	public Mudur(String ad, String soyad, Meslekler meslek, double maas) {
		super(ad, soyad, meslek, maas);
	
	}

	@Override
	public double maasZam(double maas) {
		return maas=maas*1.3;
	}







}
