package mrChibuzo;


public class MyArrayList {
   int size ;

   class  Product{
       int productId;
       String productName;
       char productAvailability;
       double price;
       float productRating;
       Product(int productId,char productAvailability,double price,float productRating,String productName){
           this.productAvailability = productAvailability;
           this.price = price;
           this.productId = productId;
           this.productRating = productRating;
           this.productName = productName;
       }
   }
}
