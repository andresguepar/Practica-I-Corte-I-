/*package mapping.mapper;

import domain.models.Order;
import domain.models.Product;
import mapping.dtos.OrderDto;
import mapping.dtos.ProductDto;

import java.util.List;

public class ProductMapper {
    public static ProductDto mapFrom(Product source){
        return new ProductDto(source.getId(),
                source.getName(),
                source.getCategory(),
                source.getPrice());
    }

    public static Product mapFrom(ProductDto source){
        return new Product(source.id(),
                source.name(),
                source.category(),
                source.price());
    }


    public static List<Product> mapFrom(List<ProductDto> source){
        return source.parallelStream()
                .map(e -> mapFrom(e))
                .toList();

    }
}*/