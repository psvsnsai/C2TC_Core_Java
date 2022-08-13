package com.tns.goshopping;

public abstract  class NormalAcc extends ShopAcc {
    private final float deliveryCharges;
    public NormalAcc(int accNo,String accNm,float charges,float deliveryCharges)
    {
        super(accNo,accNm,charges);
        this.deliveryCharges=deliveryCharges;
    }
     public  void bookProduct(float charge){
                                                                 // delivery charges are applied
        System.out.println("\n*********\nDelivery charges are applied!!");
    }
     public float getDeliveryCharges() {
        return deliveryCharges;
    }
    
    public  String toString(){
        String data=super.toString();
        data+="\n Delivery Charges: "+deliveryCharges;
        return data;
    }
}
