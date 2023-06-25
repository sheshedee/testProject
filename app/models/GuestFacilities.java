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
@Table(name="guest_facilities")
public class GuestFacilities extends Model {

    @Column(name="guest_id")
    public Integer guestID;
    @Column(name="facility_id")
    public Integer facilityID;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;


    public static final Finder<Integer, GuestFacilities> find = new Finder<>(GuestFacilities.class);

}
