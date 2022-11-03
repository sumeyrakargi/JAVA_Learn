package j19_StaticVariable;

import java.util.Scanner;

public class ElectricHesap {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
    //Fields
    int toplamTuketim;
    static double fatura;
    static double oran=0.7;

    public double odenecekTutar(){
        fatura=toplamTuketim*oran;
        return fatura;
    }

    public void tüketimekle(int tuketilen){
        toplamTuketim += tuketilen;
    }

}
