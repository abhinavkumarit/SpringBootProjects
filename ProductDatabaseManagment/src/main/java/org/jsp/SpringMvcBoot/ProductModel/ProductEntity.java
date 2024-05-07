package org.jsp.SpringMvcBoot.ProductModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String p_name;
 private double p_price;
 private String p_discription;
 

 
public ProductEntity(int id, String p_name, double p_price, String p_discription) {
	super();
	this.id = id;
	this.p_name = p_name;
	this.p_price = p_price;
	this.p_discription = p_discription;
}


public ProductEntity() {
	super();
	// TODO Auto-generated constructor stub
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public double getP_price() {
	return p_price;
}
public void setP_price(double p_price) {
	this.p_price = p_price;
}
public String getP_discription() {
	return p_discription;
}
public void setP_discription(String p_discription) {
	this.p_discription = p_discription;
}


@Override
public String toString() {
	return "ProductEntity [id=" + id + ", p_name=" + p_name + ", p_price=" + p_price + ", p_discription="
			+ p_discription + "]";
}
 
 
 
}
