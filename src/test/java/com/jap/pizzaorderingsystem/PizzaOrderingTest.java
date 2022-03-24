package com.jap.pizzaorderingsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class PizzaOrderingTest {
    PizzaOrdering pizzaOrdering;
    
    int totalPizzaBill=0;

    @BeforeEach
    void setUp() {
        pizzaOrdering = new PizzaOrdering();
    }

    @AfterEach
    void tearDown() {
        pizzaOrdering = null;
    }

    /* NOTE: Write a minimum of 4 assert statements for each test case */

    @Test
        
   
    public void givenPizzaChoiceAndSizeCalculateBill() {
    	
    
  
    assertEquals(950,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(500,1,"L"));
    	
    	assertEquals(500,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(500,1,"X"));
    	
    	assertEquals(500,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(500,0,"X"));
    	
    	assertEquals(1000,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(500,5,"L"));
    	
    }

    @Test
    public void givenCrustChoiceEstimatePrice() {
    	
    	 assertEquals(60,pizzaOrdering.estimatePriceOfCrust(1));
    	 assertEquals(80,pizzaOrdering.estimatePriceOfCrust(2));
    	 assertEquals(70,pizzaOrdering.estimatePriceOfCrust(3));
    	 assertEquals(-1,pizzaOrdering.estimatePriceOfCrust(0));
    }

    @Test
    public void givenToppingsChoiceEstimatePrice() {
    	
    	assertEquals(-1,pizzaOrdering.estimatePriceOfToppings(0));
    	assertEquals(80,pizzaOrdering.estimatePriceOfToppings(1));
    	assertEquals(120,pizzaOrdering.estimatePriceOfToppings(2));
    	assertEquals(-1,pizzaOrdering.estimatePriceOfToppings(3));
    }

    @Test
    public void givenCrustAndToppingsCostCalculateTotalBill() {
    	
    	assertEquals(640,pizzaOrdering.calculateBillWithCrustAndToppings(500,60,80));
    	assertEquals(0,pizzaOrdering.calculateBillWithCrustAndToppings(0,0,0));
    	assertEquals(180,pizzaOrdering.calculateBillWithCrustAndToppings(0,60,120));
    	assertEquals(580,pizzaOrdering.calculateBillWithCrustAndToppings(500,-1,80));
    	assertEquals(560,pizzaOrdering.calculateBillWithCrustAndToppings(500,60,-1));
    	assertEquals(500,pizzaOrdering.calculateBillWithCrustAndToppings(500,-1,-1));
    }

    @Test
    public void givenBreadChoiceCalculateTotalBill() {
    	
    	
    	assertEquals(590,pizzaOrdering.calculateBillBasedOnChoiceOfBread(1,500));
    	assertEquals(580,pizzaOrdering.calculateBillBasedOnChoiceOfBread(2,500));
    	assertEquals(500,pizzaOrdering.calculateBillBasedOnChoiceOfBread(3,500));
    	assertEquals(90,pizzaOrdering.calculateBillBasedOnChoiceOfBread(1,0));
    	
    }

    @Test
    public void givenDrinksChoiceCalculateTotalBill() {
    	
    	assertEquals(560,pizzaOrdering.calculateBillBasedOnDrinksChoice(1,500));
    	assertEquals(560,pizzaOrdering.calculateBillBasedOnDrinksChoice(2,500));
    	assertEquals(500,pizzaOrdering.calculateBillBasedOnDrinksChoice(3,500));
    	assertEquals(0,pizzaOrdering.calculateBillBasedOnDrinksChoice(-1,0));
    	assertEquals(60,pizzaOrdering.calculateBillBasedOnDrinksChoice(1,0));
    }

    @Test
    public void givenTotalBillEstimateDiscountAmount() {
    	
    	assertEquals(0,pizzaOrdering.estimateDiscountAmount(0));    	
    	assertEquals(0,pizzaOrdering.estimateDiscountAmount(1560));
    	assertEquals(35,pizzaOrdering.estimateDiscountAmount(700));
    	assertEquals(130,pizzaOrdering.estimateDiscountAmount(1300));
    	
    }

    @Test
    public void givenDeliveryAndTipChargeCalculateFinalBill() 
    {
    	
    	assertEquals(0,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(0,0,0));
    	assertEquals(765,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(100,-1,665));
    	assertEquals(775,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(100,10,665));
    	assertEquals(100,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(100,-1,0));
    }

}
