package Challange;

import java.util.Scanner;

    public class Challange5 {
        public static void main(String[] args){
            int tinggi;
            Scanner hab =  new Scanner(System.in);
            
            System.out.print("Masukan tinggi segitiga : ");
            tinggi = hab.nextInt();
            
            
                for (int i = 1;i<tinggi;i++) {
                    for(int p = 1;p<=i;p++){
                    System.out.print(" * ");
            }
            System.out.println(" ");
            }
        
        }
    }
    
