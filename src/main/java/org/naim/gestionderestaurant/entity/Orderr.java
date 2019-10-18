package org.naim.gestionderestaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orderr implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderId;
    private String OrderNo;
    private String PMethod ;
    private double GTotal ;

    @ManyToOne
    private Customer customer ;


    @OneToMany(mappedBy = "orderr")
    private Collection<OrderItems> orderItemsOrder;





}
