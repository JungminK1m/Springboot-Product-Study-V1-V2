package shop.mtcoding.productapp.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private Timestamp createdAt;

}
