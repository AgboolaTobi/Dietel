package myFunctionTests;

import org.junit.jupiter.api.Test;
import tolu.FunctionSnack;

import static org.junit.jupiter.api.Assertions.*;

class FunctionSnackTest {


    @Test
    public void testTheReturnedCommissionForSuccessfulDeliveriesLessThan50Percent(){
        FunctionSnack snack = new FunctionSnack();

        int deliveries = 25;
        int result = 9000;
        int results= snack.commission(deliveries);

        assertEquals(results,result);
    }

//    @Test
//    public void testTheReturnedCommissionForSuccessfulDeliveriesGreaterThan50PercentButLessThan60(){
//        int deliveries = 55;
//        int result = 16000;
//
//        assertEquals(FunctionSnack.commission(deliveries),result);
//    }
//
//    @Test
//    public void testTheReturnedCommissionForSuccessfulDeliveriesGreaterThan60PercentButLessThan70(){
//        int deliveries = 67;
//        int result = 21750;
//
//        assertEquals(FunctionSnack.commission(deliveries),result);
//    }
//
//    @Test
//    public void testTheReturnedBasePayFor80SuccessfulDeliveries(){
//        int deliveries = 80;
//        int result = 45000;
//
//        assertEquals(FunctionSnack.commission(deliveries),result);
//    }


}