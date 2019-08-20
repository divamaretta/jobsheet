
import java.util.Scanner;
public class Suhu {
   
    public static void main (String[] args) {
        //Deklarasi
        Double fahrenheit;
        int celcius;
        
        //Membuat scanner baru
        Scanner baca = new Scanner (System.in);
              
        //Input
        System.out.println("Suhu Celcius ke Fahrenheit");
        System.out.print("Celcius: ");
        celcius = baca.nextInt();
        
        //proses
        fahrenheit = Double.valueOf(( celcius * 9/5 )+ 32);
        
        //OUTPUT
        System.out.println("F: "+ fahrenheit);
        
    }
    
}
 