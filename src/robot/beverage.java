/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import java.util.Scanner;

/**
 *
 * @author Ramario
 */
public class beverage {
    public String num;
    public String num1;
    public String num2;
    
    //constructor
    public beverage(){
         num = "7-up";
         num1 = "Pepsi";
         num2 = "Sprite";
         
    }
   
         public String getNum(){
             return num;
         }  
         public String getNum1(){
             return num1;
}
         public String getNum2(){
             return num2;
         }
}