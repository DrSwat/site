package com.drswat.site.site.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "meeting", uniqueConstraints = @UniqueConstraint(columnNames = {"property_id", "time"}))
public class Meeting {

    @ManyToOne(optional = false)
    private Client client;

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(optional = false)
    private Property property;
    private Date time;


    public Client getClient() {
        return client;
    }

    public Property getProperty() {
        return property;
    }

    public Date getTime() {
        return time;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "You have a meeting for " + time + " in " + property;
    }
}
