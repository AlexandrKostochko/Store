package by.tms.shop.repository;

import by.tms.shop.entity.Order;
import by.tms.shop.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findOrdersByUserLogin(String login);
    List<Order> findOrdersByOrderStatus(OrderStatus orderStatus);
    boolean existsOrderById(long id);
    boolean existsOrderByIdAndUserId(long orderId, long userId);
    Order findOrderById(long id);
    void deleteOrderById(long id);
}
