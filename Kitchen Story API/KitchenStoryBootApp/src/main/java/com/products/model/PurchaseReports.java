package com.products.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tblorders")
public class PurchaseReports {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "productname")
	private String productname;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "emailid")
	private String emailid;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "createdate")
	private String createdate;
	
	public PurchaseReports()
	{
		
	}

	public PurchaseReports(String productname, int price, String firstname, String lastname, String emailid,
			String address, String createdate) {
		super();
		this.productname = productname;
		this.price = price;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.address = address;
		this.createdate = createdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "PurchaseReports [id=" + id + ", productname=" + productname + ", price=" + price + ", firstname="
				+ firstname + ", lastname=" + lastname + ", emailid=" + emailid + ", address=" + address
				+ ", createdate=" + createdate + "]";
	}

	
	

}
