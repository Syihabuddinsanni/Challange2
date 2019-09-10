package Challange;

import java.util.Scanner;

    public class Challange2 {
        public static void main(String[] args){
            
            int a, b, jumlah;
            Scanner hab = new Scanner(System.in);
            System.out.println("Masukin nilai awale sam :V :");
            System.err.println("=====================================");
            a = hab.nextInt();
            System.out.println("Masukan Nnila center/tengah awokw :V : ");
            System.err.println("=====================================");
            b = hab.nextInt();
            System.out.println("Masukan jumlah suku :");
            System.err.println("=====================================");
            jumlah = hab.nextInt();
            
            int i = 1;
            System.out.println("======================================");
            System.out.println("Ini hasilnya Gayn XD ");
            while(i<jumlah){
                System.out.print(a +",");
                a+=b;
                        i++;
            }
                        
            }
        }
        
    
