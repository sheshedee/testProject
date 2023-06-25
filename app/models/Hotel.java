package models;

import io.ebean.Model;
import io.ebean.Finder;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name="hotel")
public class Hotel extends Model {
    @Id
    @Column(name="hotel_id")
    public Integer hotelID;

    @Column(name="hotel_name")
    public String name;

    @Column(name="hotel_address")
    public String address;

    @Column(name="phone_number")
    public Integer phone;

    @Column(name="email")
    public String email;

    @Column(name="website")
    public String website;

    @Column(name="description")
    public String description;

    @Column(name="check_in_time")
    public Time checkInTime;

    @Column(name="check_out_time")
    public Time checkOutTime;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;


    public static final Finder<Integer, Hotel> find = new Finder<>(Hotel.class);

}