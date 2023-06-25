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
@Table(name="department")
public class Department extends Model {
    @Id
    @Column(name="department_id")
    public Integer facilityID;

    @Column(name="department_name")
    public String name;

    @Column(name="description")
    public String description;

    @Column(name="date_created")
    @WhenCreated
    public Date dateCreated;

    @Column(name="date_modified")
    @WhenModified
    public Date dateModified;


    public static final Finder<Integer, Department> find = new Finder<>(Department.class);

}
