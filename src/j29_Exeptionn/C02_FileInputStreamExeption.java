package j29_Exeptionn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamExeption {

    /*

     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
     Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.


         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
Class'inin parent class Hz.Adem
 */
    public static void main(String[] args) throws IOException {//Hz.Nuh IO işlemleri en parent class exception
        // public static void main(String[] args) throws FileNotFoundException { //read() method import öncesi child exception

        FileInputStream  fis =new FileInputStream("C:\\Users\\seyitbey\\IdeaProjects\\java learn\\src\\j29_Exeptionn\\deneme");
        //ilgili dosyaya ulaşmak için fis obj tanımlandı parametre olarak ulaşılacak dosya yolu(path) girildi
        //FileNotFoundException-> adres yanlışşsa controlu

        /*
        eğer bir method da Checked (CTE riski olan excp.)exception varsa method sinature (method name den sonraki bölüm) hata uyarısı
        altı kırmızı çizgi verir komutun derlenmesine izin vermez ve kod üzerine geldiğinde  Add... exception handle etme tavsiye eder
        otomatik throws excp. eklenir.
        bu şekilde methodu call eden komutlar try-catch alınması garanti edilmiş olur.
         */

        int k;
        while ((k=fis.read())!=-1){//IOException -> evde yoksa controlu
            System.out.print((char)k);//k int  ascci olan file değeri char ici casting-> type dönüşümü

        }

}}
