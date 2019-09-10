package Challange;

import java.util.Scanner;

    public class Challange4 {
        public static void main(String[] args){
            Scanner hab = new Scanner(System.in);
            int panjang, lebar;
            
            System.out.print("Masukan panjang : ");
            panjang = hab.nextInt();
            
            System.out.print("Masukan lebar : ");
            lebar = hab.nextInt();
            
            int i=1,j;
            while(i<panjang){
                j=1;
                while (j<=panjang) {System.out.print(" * ");j++;
                }
                    System.out.println("");i++;    
                        }
            }
        }
    

