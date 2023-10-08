package Dietelchapter3;

public class PetrolPurchase {

    private String location;
    private  int quantity;
    private String type_of_petrol;
    private double price;
    private double discount;

    public void setLocation(String location){
        this.location = location;
    }
    public  String getLocation(){
        return location;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setType_of_petrol(String typeOfPetrol){
        this.type_of_petrol = typeOfPetrol;
    }
    public String getType_of_petrol(){
        return  type_of_petrol;
    }

    public void setPrice(int price){
        if (price <= 0){
            price = 0;
        }
        this.price = price;
    }

    public double getPrice(){
        return  price;
    }

    public  void setDiscount(double discount){
        if (discount <= 0 && discount >= price)
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }

    public double getPurchaseAmount(){
        double netPurchaseAmount = (quantity * price ) - discount;
        return netPurchaseAmount;
    }

}
