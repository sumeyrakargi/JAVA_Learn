package j29_Exeptionn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamExeption2 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\seyitbey\\IdeaProjects\\java learn\\src\\j29_Exeptionn\\deneme");
            int k;

            try {
                while (((k = fis.read()) != -1)) {
                    System.out.print((char) k);
                }
                System.out.println("içteki try block tan selamlar");
            } catch (IOException e) {//dosyaya ulaşılır fakat okunamaz isebu catch çalışır
                System.out.println("dosya okunamıyor");
                System.out.println("içteki catch blocktan selamlar");
            }
            System.out.println("dıştaki try blocktan selam");


        } catch//dosyaya ulaşılamaz ise bu catch çalışır.
        (FileNotFoundException e) {
            System.out.println("dosyaya ulaşılamıyor");
            System.out.println("dıştaki catch blocktan selamlar");

        }
        System.out.println("sorun handle edildi");
    }}

