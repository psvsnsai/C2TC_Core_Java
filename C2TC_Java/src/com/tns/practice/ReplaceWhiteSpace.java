package com.tns.practice;


public class ReplaceWhiteSpace    
{    
    public static void main(String[] args) {    
        String string = "Once upon a time";    
        char ch = '-';    
            
        //Replace space with specific character ch    
        string = string.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }    
}      