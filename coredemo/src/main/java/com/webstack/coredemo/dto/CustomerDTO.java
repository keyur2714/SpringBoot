package com.webstack.coredemo.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName="prototype")
public class CustomerDTO {

	private Long id;
	private String customerName;
	private String mobileNo;

	public CustomerDTO() {
		System.out.println("CustomerDTO Object Created....!");
	}
	
	@Autowired
	@Qualifier("address")
	private AddressDTO address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", customerName=" + customerName + ", mobileNo=" + mobileNo + ", address="
				+ address + "]";
	}

}
