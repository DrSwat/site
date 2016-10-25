package com.drswat.site.site.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "property")
public class Property {

    public enum TypeDwelling {
        APARTMENT, HOUSE
    }

    private String adress;

    private String country;

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    private List<Meeting> meetingDays;

    @ManyToOne(optional = false, targetEntity = User.class)
    private User owner;
    private double price;

    private String town;

    private TypeDwelling typeDwelling;

    public String getAdress() {
        return adress;
    }

    public String getCountry() {
        return country;
    }

    public Integer getId() {
        return id;
    }

    public List<Meeting> getMeetingDays() {
        return meetingDays;
    }

    public User getOwner() {
        return owner;
    }

    public double getPrice() {
        return price;
    }

    public String getTown() {
        return town;
    }

    public TypeDwelling getTypeDwelling() {
        return typeDwelling;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMeetingDays(List<Meeting> meetingDays) {
        this.meetingDays = meetingDays;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setTypeDwelling(TypeDwelling typeDwelling) {
        this.typeDwelling = typeDwelling;
    }

    ;

    @Override
    public String toString() {
        return country + ", " + town + ", " + adress + ", cost " + price + "$, type of dwelling - " + typeDwelling;
    }
}