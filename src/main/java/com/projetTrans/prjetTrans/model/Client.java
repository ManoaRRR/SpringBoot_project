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
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_client;

    @Column(name = "name_client")
    private String aname_client;

    @Column(name = "first_name_client")
    private String bfirst_name_client;

    @Column(name="contact")
    private String contact;
}
