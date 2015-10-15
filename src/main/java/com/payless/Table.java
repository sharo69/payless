package com.payless;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@javax.persistence.Table(name = "tables")
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @Column(name = "seats")
    private int seats;

    @Column(name = "sb")
    private BigDecimal sb;

    @Column(name = "bb")
    private BigDecimal bb;

    @OneToOne
    private TableType type;

    @OneToOne
    private TableSpeed speed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public BigDecimal getSb() {
        return sb;
    }

    public void setSb(BigDecimal sb) {
        this.sb = sb;
    }

    public BigDecimal getBb() {
        return bb;
    }

    public void setBb(BigDecimal bb) {
        this.bb = bb;
    }

    public TableType getType() {
        return type;
    }

    public void setType(TableType type) {
        this.type = type;
    }

    public TableSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(TableSpeed speed) {
        this.speed = speed;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}