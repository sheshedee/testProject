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
@Table(name="guests")
public class Guests extends Model {
    @Id
    @Column(name="guest_id")
    public Integer guestID;

    @Column(name="guest_name")
    public String name;

    @Column(name="guest_address")
    public String address;

    @Column(name="phone_number")
    public Integer phone;

    @Column(name="email")
    public String email;

    @Column(name="nationality")
    public String nationality;

    @Column(name="dob")
    public Date dob;

    @Column(name="identity_number")
    public Integer identityNumber;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;


    public static final Finder<Integer, Guests> find = new Finder<>(Guests.class);

}
