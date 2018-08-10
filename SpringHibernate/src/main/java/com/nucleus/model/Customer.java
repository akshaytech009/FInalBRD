package com.nucleus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer153")
public class Customer {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false, unique = true)
	private String customerCode;
	private String customerName;
	private String customerAddress;
	private String customerPincode;
	private String customerEmail;
	private String contactNumber;
	private String registrationDate;
	private String createdBy;
	private String modifiedDate;

	
 
	
	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Customer [customerCode="
				+ customerCode + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", customerPincode="
				+ customerPincode + ", customerEmail=" + customerEmail
				+ ", contactNumber=" + contactNumber + ", registrationDate="
				+ registrationDate + ", createdBy=" + createdBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

	public Customer(String customerCode, String customerName,
			String customerAddress, String customerPincode,
			String customerEmail, String contactNumber,
			String registrationDate, String createdBy, String modifiedDate) {
		super();
		
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPincode = customerPincode;
		this.customerEmail = customerEmail;
		this.contactNumber = contactNumber;
		this.registrationDate = registrationDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
	}

	public Customer() {

	}

}