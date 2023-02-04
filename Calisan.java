package com.bilgeadam.oopodev;


public abstract class Calisan implements Sorumlu {
	private String  ad;
    private String soyad;
	private Meslekler meslek;
	private double maas;
	
	
public Calisan() {
		super();
	}
public Calisan(String ad, String soyad, Meslekler meslek, double maas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.meslek = meslek;
		this.maas = maas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public Meslekler getMeslek() {
		return meslek;
	}
	public void setMeslek(Meslekler meslek) {
		this.meslek = meslek;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
	@Override
	public String toString() {
		return "Calisan [ad=" + ad + ", soyad=" + soyad + ", meslek=" + meslek + ", maas=" + maas + "]";
	}

	

}
