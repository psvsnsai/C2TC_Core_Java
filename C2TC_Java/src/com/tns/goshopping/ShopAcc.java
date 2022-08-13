package com.tns.goshopping;

public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;
    public ShopAcc(int accNo,String accNm,float charges){      
        this.accNo=accNo;                                    //differ instant and formal variables
        this.accNm=accNm;
        this.charges=charges;
    }
    public abstract void bookProduct(float param);     //get - returns the variable value
    public int getAccNo() {                           //reading getacc method
        return accNo;
    }
    public String getAccNm() {
        return accNm;
    }
    public void setAccNm(String accNm) {     //read and write   set - takes a parameter and assign to name variable
        this.accNm = accNm;                       //differ instant and formal variables
    }
    public float getCharges() {
        return charges;
    }
    public  void items(float param){

    }
    public  String toString(){                      //convert all the parameters into string type  
         String data="Account Number :"+this.accNo;
        data+="\n Account Name : "+this.accNm;               
        data+="\n Charges :"+this.charges;
        return data;
    }
}
	

