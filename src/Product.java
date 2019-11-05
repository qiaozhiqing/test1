public class Product{
    private String name;
    private double price;
    private int sales;
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setSales(int sales){
        this.sales=sales;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getSales(){
        return sales;
    }
//    有参的构造方法
    public Product(String name,double price,int sales){
    this.name=name;
    this.price=price;
    this.sales=sales;
    }
public Product(){

}
}