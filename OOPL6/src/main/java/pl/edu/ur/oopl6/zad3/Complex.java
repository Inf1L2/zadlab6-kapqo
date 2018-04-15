package pl.edu.ur.oopl6.zad3;



/**
 *
 * @author Kowali
 */
public class Complex {
    
static double re;
static double im;

      
public Complex(double re, double im){
    this.re = re;
    this.im = im;
    }

public static void modul(Complex z1){
    double modul = Math.sqrt(re*re+im*im);
    System.out.println("Moduł liczby zespolonej wynosi: "+ modul);
    }

public static void sprzezenie(Complex z1){
	if(im<0) System.out.println("Sprzezenie liczby zespolonej wynosi: "+ re + "+" + -(im) + "i");
	else System.out.println("Sprzezenie liczby zespolonej wynosi: "+ re + -(im) + "i");
    }
/*
public static void dodawanie(Complex z1){
    double dodawanie = 
    System.out.println("Moduł liczby zespolonej wynosi: "+ modul);
    }
*/

    public static void main(String[] args){
    
        Complex z1 = new Complex(2, 3);
        modul(z1);
        sprzezenie(z1);
    }

}
