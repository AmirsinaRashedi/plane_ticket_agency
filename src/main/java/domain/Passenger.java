package domain;

import base.domain.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = Passenger.TABLE_NAME)
public class Passenger extends BaseEntity<Long> {

    public static final String TABLE_NAME = "passenger";

    private String firstname;

    private String lastname;

    private String username;

    private String password;


    public Passenger() {
    }
}
