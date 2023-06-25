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
@Table(name="facilities")
public class Facilities extends Model {
    @Id
    @Column(name="facility_id")
    public Integer facilityID;

    @Column(name="facility_name")
    public String name;

    @Column(name="description")
    public String description;

    @Column(name="hotel_id")
    public Integer hotelID;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;


    public static final Finder<Integer, Facilities> find = new Finder<>(Facilities                                                                                                                                      .class);

}
