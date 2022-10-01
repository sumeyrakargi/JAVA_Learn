import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("boyunuzu giriniz(m)");
        double boy= sc.nextDouble();

        System.out.println("kilonuzu giriniz(kg)");
        double kilo= sc.nextDouble();
        double BMI=kilo/(boy*boy);
        if (BMI<=20)
            System.out.println("Oldukça zayıfsınız.");
            else if (BMI<=25) System.out.println("Normal sınırlardasınız");
            else if (BMI<=30) System.out.println("Şişman kategorisindesiniz");
            else if (BMI>30) System.out.println("Obez grubundasınız");
            else System.out.println("Yanlış değer girdiniz.");

        }


    }


