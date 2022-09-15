package com.projetTrans.prjetTrans.model;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "car")
public class Voiture  implements Serializable {
    @Id
    @Column(name = "id_car", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_car;

    @Column(name="mark", nullable = false)
    private String ark;

    @Column(name = "functional",nullable = false)
    private boolean functional;

    @Column(name = "imatriculation", nullable = false)
    private String imatriculation;

    @ManyToOne
    private Client id_client;
}
