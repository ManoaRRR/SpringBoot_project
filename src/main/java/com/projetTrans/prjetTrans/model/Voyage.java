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
@Table(name = "travel")
public class Voyage implements Serializable {
    @Id
    @Column (name = "id_travel", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_travel;

    @Column (name= "date_travel")
    private LocalDate adate_travel;

    @Column(name="travel_path", nullable = false)
    private String btravel_path;

    @ManyToOne
    private Client id_aclient;
    @ManyToOne
    private Chauffeur id_chauffeur;
}
