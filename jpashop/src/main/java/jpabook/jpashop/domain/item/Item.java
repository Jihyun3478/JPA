package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long Id;

    private String name;
    private int price;
    private int stockQuantity;
}
