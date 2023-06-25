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
@Table(name="staff")
public class Staff extends Model {
    @Id
    @Column(name="staff_id")
    public Integer staffID;

    @Column(name="staff_name")
    public String name;

    @Column(name="staff_address")
    public String address;

    @Column(name="job_title")
    public String jobTitle;

    @Column(name="phone_number")
    public Integer phone;

    @Column(name="email")
    public String email;

    @Column(name="department_id")
    public Integer departmentID;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;


    public static final Finder<Integer, Staff> find = new Finder<>(Staff.class);

}