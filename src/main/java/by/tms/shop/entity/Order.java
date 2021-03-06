package by.tms.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;

    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "order")
    private List<Technic> technicList;

    @ManyToOne
    private User user;
    private String orderCreatedDate;
    private String orderDeliveredDate;
}
