package app.model;

import javax.persistence.*;

@Entity(name = "parcels")
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parcel_id")
    private int id;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    private long price;

    public Parcel(Status status, Driver driver, long price) {
        this.status = status;
        this.driver = driver;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", status=" + status +
                ", driver=" + driver +
                ", price=" + price +
                '}';
    }
}
