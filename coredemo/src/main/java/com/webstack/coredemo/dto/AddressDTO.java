package com.webstack.coredemo.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="address")
@Scope(scopeName="prototype")
public class AddressDTO {

	private String address1;
	private String address2;
	private String city;
	private String state;
	
	public AddressDTO() {
		System.out.println("AddressDTO Object Created...!");
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressDTO [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ "]";
	}
	
	
	
}
