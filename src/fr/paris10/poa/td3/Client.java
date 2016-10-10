package fr.paris10.poa.td3;

/**
 * Created by jomedjid on 10/10/2016.
 */
public class Client {


    public Client (){
        prodA = new ProductA();
    }

    public void foo() {
        prodA . doYourStuff ();
        ProductB myProdB = new ProductB ();
        myProdB.doIt();
        ProductC myProdC = new ProductC ();
        myProdC.perform();
    }
    ProductA prodA ;
    ProductB prodB ;

}
