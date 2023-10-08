package Dietelchapter3;

public class Car {
    private String model;
    private  String year;
    private  double price;




    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setPrice(double price){
        if (price < 0){
            price = 0;
        }
        else{
            this.price = price;
        }
    }
    public double getPrice(){
        return price;
    }

    public void  setYear(String year){
        this.year = year;
    }

    public String getYear(){
        return year;
    }

    public  void  discountPrice(double percent){
        double discount = percent/100;
        price = price - (price * discount);

    }

}
