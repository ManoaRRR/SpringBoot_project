package com.projetTrans.prjetTrans.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "driver")
@ToString
public class Chauffeur implements Serializable {
    @Id
    @Column( nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_driver;

    @Column(name="name_driver", nullable = false)
    private String aname_driver;

    @Column (name ="first_name_driver", nullable = false)
    private String bfirst_name_driver;

    @Column(name = "contact", nullable = false)
    private String contact;

    @ManyToOne
    private Voiture id_car;
}
