/*package mapping.mapper;

import domain.models.Client;
import domain.models.Order;
import mapping.dtos.ClientDto;
import mapping.dtos.OrderDto;

import java.util.List;

public class OrderMapper {
    public static OrderDto mapFrom(Order source){
        return new OrderDto(source.getId(),
                source.getStatus(),
                source.getOrderDate(),
                source.getDeliveryDate(),
                source.getProducts(),
                source.getClient());
    }

    public static Order mapFrom(OrderDto source){
        return new Order(source.id(),
                source.status(),
                source.orderDate(),
                source.deliveryDate(),
                source.products(),
                source.client());
    }


    public static List<Order> mapFrom(List<OrderDto> source){
        return source.parallelStream()
                .map(e -> mapFrom(e))
                .toList();

    }
}*/
