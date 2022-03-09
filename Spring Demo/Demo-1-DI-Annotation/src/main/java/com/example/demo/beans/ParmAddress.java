package com.example.demo.beans;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Named("adress2")
@Component("adress2")
//@Primary
public class ParmAddress implements Adress{
	private int hNo=24;
	private String city="ParmCiti";
	
	
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ParmAddress [hNo=" + hNo + ", city=" + city + "]";
	}
	@Override
	public void showAdress() {
		System.out.println(this);
		
	}
	
}
