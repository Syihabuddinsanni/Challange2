package Challange;
    
import java.util.Scanner;

    public class Challange1 {
        public static void main(String[] args){
            int bil;
            int hasil = 1;
                Scanner hab = new Scanner(System.in);
                System.out.println("Masukan angka apa aja dah ;v :");
                bil = hab.nextInt();
                
                int i = bil;
                
                while (i>0){
                    hasil = hasil * i;
                    i--;}
                System.out.println("Nilai faktorial dari "+bil+" adalah "+hasil);
                }
        }
    
