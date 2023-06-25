package models;

import io.ebean.Model;
import io.ebean.Finder;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="rooms")
public class Rooms extends Model {
    @Id
    @Column(name="room_id")
    public Integer roomID;

    @Column(name="room_type")
    public String name;

    @Column(name="max_occupancy")
    public Integer maxOccupancy;

    @Column(name="room_price")
    public Integer roomPrice;

    @Column(name="availability_status")
    public String availabilityStatus;

    @Column(name="hotel_id")
    public Integer hotelID;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;

    public static final Finder<Integer, Rooms> find = new Finder<>(Rooms.class);

}
