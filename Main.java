package com.bilgeadam.oopodev;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main1(String[] args) {
		
 
		List<Calisan> calisan = new ArrayList<>();
		
		Mudur mudur1 = new Mudur("Ahmet","Kaya",Meslekler.MUDUR,25000);
		Mudur mudur2 = new Mudur("Veli","Yurt",Meslekler.MUDUR,25000);
		
		Ogretmen ogretmen1=new Ogretmen("Ayse","Caliskan",Meslekler.OGRETMEN,15000);
		Ogretmen ogretmen2=new Ogretmen("Bahar","Sezgin",Meslekler.OGRETMEN,15000);
		Ogretmen ogretmen3=new Ogretmen("Mehmet","Turk",Meslekler.OGRETMEN,15000);
		Ogretmen ogretmen4=new Ogretmen("Emre","Caliskan",Meslekler.OGRETMEN,15000);
		
		Stajyer stajyer1=new Stajyer("Sude","Kaplan",Meslekler.STAJYER,50000);
		Stajyer stajyer2=new Stajyer("Elif","Can",Meslekler.STAJYER,50000);
		Stajyer stajyer3=new Stajyer("Kemal","Cakir",Meslekler.STAJYER,50000);
		
		
		calisan.add(mudur1);
		calisan.add(mudur2);
		calisan.add(ogretmen1);
		calisan.add(ogretmen2);
		calisan.add(ogretmen3);
		calisan.add(ogretmen4);
		calisan.add(stajyer1);
		calisan.add(stajyer2);
		calisan.add(stajyer3);
		
		
        }
}