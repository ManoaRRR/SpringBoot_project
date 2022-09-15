package com.projetTrans.prjetTrans.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "reservation")
public class Reservation implements Serializable {
    @Id
    //@Column (name = "id_reservation")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_reservation;

    @Column (name = "type_reservation")
    private String atype_reservation;

    @Column(name="date_reservation")
    private LocalDate bdate_reservation;

    @Column(name = "full_payment")
    private boolean full_payment;

    @ManyToOne
    private Client id_client;
}
