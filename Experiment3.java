 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.experiment3;

/**
 *
 * @author URI
 */
public class Experiment3 {

    public static void main(String[] args) {
        int x=153;
        int rem,temp;
        int sum;
        temp=x;
        sum=0;
        while(x>0)
        {
            rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
        if(sum==temp)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("NOt palindrome");
        }
    }
}
