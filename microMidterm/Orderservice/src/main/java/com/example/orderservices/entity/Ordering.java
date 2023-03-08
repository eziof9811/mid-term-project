package com.example.orderservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(schema = "order_details")
public class Ordering {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private long orderId;
    private String pName;
    private String pDescription;
    private double pQuantity;
    private String imageUrl;
    private double pPrice;
    private double totalPrice;
    private LocalDate date;
    private String address;
    private String city;
    private String state;
    private String pinCode;

    public Ordering(){
    }

    public Ordering(long orderId, String pName, String pDescription, double pQuantity, String imageUrl, double pPrice, double totalPrice, LocalDate date, String address, String city, String state, String pinCode) {
        this.orderId = orderId;
        this.pName = pName;
        this.pDescription = pDescription;
        this.pQuantity = pQuantity;
        this.imageUrl = imageUrl;
        this.pPrice = pPrice;
        this.totalPrice = totalPrice;
        this.date = date;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public double getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(double pQuantity) {
        this.pQuantity = pQuantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", pName='" + pName + '\'' +               
                ", pDescription='" + pDescription + '\'' +
                ", pQuantity=" + pQuantity +
                ", imageUrl='" + imageUrl + '\'' +
                ", pPrice=" + pPrice +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordering myOrder = (Ordering) o;
        return orderId == myOrder.orderId && Objects.equals(pName, myOrder.pName);
        // comparing the orderId and pName
    }
    //generate a hash code for the object,
    @Override
    public int hashCode() {
        return Objects.hash(orderId, pName);
    }
}
