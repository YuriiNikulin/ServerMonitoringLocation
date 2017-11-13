package app.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "driver_id")
    private int id;

    @OneToOne
    private Location location;

    @OneToMany(targetEntity = Parcel.class)
    private List<Parcel> parcels;

    private String name;
    private String sername;

    public Driver(Location location, List<Parcel> parcels, String name, String sername) {
        this.location = location;
        this.parcels = parcels;
        this.name = name;
        this.sername = sername;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "location=" + location +
                ", parcels=" + parcels +
                ", name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                '}';
    }
}
