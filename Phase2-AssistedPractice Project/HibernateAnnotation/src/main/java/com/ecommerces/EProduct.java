package com.ecommerces;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="eproduct")
public class EProduct {
	@Id @GeneratedValue
	@Column(name="ID")
	private long ID;
	@Column(name = "name")
    private String name;
    
    @Column(name = "price")
    private int price;
    
    @Column(name = "date_added")
    private Date dateAdded;  
        
    public long getID() {return this.ID; }
    public String getName() { return this.name;}
    public int getPrice() { return this.price;}
    public Date getDateAdded() { return this.dateAdded;}
    
    public void setID(long id) { this.ID = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(int price) { this.price = price;}
    public void setDateAdded(Date date) { this.dateAdded = date;}    


}