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
@Table(name="room_service")
public class RoomService extends Model {
    @Id
    @Column(name="service_id")
    public Integer staffID;

    @Column(name="service_date")
    public Date serviceDate;

    @Column(name="service_status")
    public String serviceStatus;

    @Column(name="hotel_id")
    public Integer hotelID;

    @Column(name="room_id")
    public Integer roomID;

    @Column(name="guest_id")
    public Integer guestID;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;


    public static final Finder<Integer, RoomService> find = new Finder<>(RoomService.class);

}