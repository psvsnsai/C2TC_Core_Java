package com.tns.goshopping;

public abstract  class PrimeAcc extends ShopAcc {
private boolean isPrime;
private static final float deliveryCharges=0;          //final - value should be declared
public PrimeAcc(int accNo,String accNm,float charges,boolean isPrime){
    super(accNo,accNm,charges);                //super - used to refer immediate parent class obj
    this.isPrime=isPrime;
}

    public boolean isPrime() {
        return isPrime;
    }

public abstract void bookProduct(float charges);
public String toString(){
    String data=super.toString();
    data+="\n Delivery Charges: "+deliveryCharges;
    return data;
}
}
