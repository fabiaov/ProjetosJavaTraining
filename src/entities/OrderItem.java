package entities;

import java.text.SimpleDateFormat;
import java.util.List;

public class OrderItem {


    private Integer quantity;
    private Double price;
    private Producto produto ;


    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Producto produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString() {
        return produto.getName()
                + ", "
                +"$ "
                + price
                +", "
                +"Quantity: "
                + quantity
                +", "
                +"Subtotal: $ "
                +String.format("%.2f",subTotal());
    }
}
