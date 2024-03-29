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
public class Itemm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ItemID;
    private  String NameItem;
    private double Price;

    @OneToMany(mappedBy = "itemm")
    private Collection<OrderItems>orderItemsItems;
}
