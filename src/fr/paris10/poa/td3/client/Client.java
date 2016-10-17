package fr.paris10.poa.td3.client;

import fr.paris10.poa.td3.products.*;

/**
 * Created by jomedjid on 10/10/2016.
 */
public class Client {
Product prod1;
    ProductFactory factory;

   Client (){
       factory = ProductFactory.getInstance();
       prod1 = factory.createProduct("ProductA");
    }

    public void foo() {
        Product myProd1, myProd2;
        prod1.perform();
        myProd1 = factory.createProduct("ProductB");
        myProd1.perform();
        myProd2 = factory.createProduct("ProductC");
        myProd2.perform();
    }


}
