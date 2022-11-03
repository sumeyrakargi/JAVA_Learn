package j25_Encapsulation.j25_Encapsulation02;

public class C01_Kisi {
    /*
    Kisi pojo class için fields--> ad,soyad,password(String),yas
    tüm fieldları kullanıcı görebilmeli ve (password hariç) update edebilmeli
    password encapsulated update edilmemeli. yaş variable negatif değer girmeye karşı encapsulated

    runner class da obj ile field ları print eden code create ediniz
     */

    String name;
    String lastname;
    private int yas;
    private String password;

    public C01_Kisi(String name, String lastname, int yas, String password) {
        this.name = name;
        this.lastname = lastname;
        this.yas = yas;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);//parametre gelen yas mutlak değere alındı
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
