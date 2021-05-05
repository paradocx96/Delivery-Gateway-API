package com.delivery.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "addresss")
    private String addresss;

    @Column(name = "province")
    private String province;

    @Column(name = "district")
    private String district;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private String phone;
    
    public Address() {
		super();
	}

	public Address(String title, String addresss, String province, String district, String city, String phone) {
		super();
		this.title = title;
		this.addresss = addresss;
		this.province = province;
		this.district = district;
		this.city = city;
		this.phone = phone;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
