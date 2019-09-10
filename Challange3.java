package Challange;

import java.util.Scanner;

    public class Challange3 {
        public static void main(String[] args){
            int sisi;
            Scanner hab = new Scanner(System.in); 
            
            System.out.print("Masukin jumlah sisi persegi : ");
            
            sisi = hab.nextInt();
            
            int i = 1;
            int j;
            while(i<=sisi){
                j=1;
                while (j<=sisi){
                    System.out.print(" * ");
                    j++;}
                
                System.out.println("");
                i++;
                }
            }
        }
    
