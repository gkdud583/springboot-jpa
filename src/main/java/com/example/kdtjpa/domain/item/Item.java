package com.example.kdtjpa.domain.item;

import com.example.kdtjpa.domain.BaseEntity;
import javax.persistence.*;
import static java.time.LocalDateTime.now;
import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "item")
public abstract class Item extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int price;
    private int stockQuantity;

    protected Item() {
    }

    public Item(int price, int stockQuantity) {
        super(null, now());
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}
