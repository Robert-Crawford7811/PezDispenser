/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
import java.util.Scanner;
public class PezDispenser
{
        public static void main(String[] args){
                
                String[] candies=new String[12];
                String temp=new String();
                int i=0;
                Scanner sc=new Scanner(System.in); 
                System.out.println("Enter 12 Candies.");
                for(int j=1;j<=12;j++){
                        temp=sc.next();
                        if(temp.equals("-1")){
                            break;
                        }
                        if(!(temp.equals("Yellow"))){
                                candies[i++]=temp;
                        }
                }
                System.out.println("Candies in the Pezdispenser left are:");
                for(int j=0;j<i;j++){
                                System.out.println(candies[j]);
                        }
        }

}