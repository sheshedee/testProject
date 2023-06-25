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
@Table(name="rooms")
public class Reservations extends Model {
    @Id
    @Column(name="reservation_id")
    public Integer reservationID;

    @Column(name="check_in_date")
    public Date checkInDate;

    @Column(name="check_out_date")
    public Date checkOutDate;

    @Column(name="number_of_adults")
    public Integer numberOfAdults;

    @Column(name="number_of_children")
    public Integer numberOfChildren;

    @Column(name="guest_id")
    public Integer guestID;

    @Column(name="room_id")
    public Integer roomID;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;

    public static final Finder<Integer, Reservations> find = new Finder<>(Reservations.class);

}