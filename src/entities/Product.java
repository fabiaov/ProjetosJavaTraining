package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
//        temos uma ambiguidade, para diferenciar o atributo da minha classe com o parametro q chegou aqui no metodo
//        para referenciar o atributo da classe, eu uso this, uma palavra reservada que significa uma auto referencia
//        para o objeto, this.quantity - acessamos o atributo da classe
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + " $ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units,Total: $ "
                + String.format("%.2f",totalValueInStock());

    }
}
