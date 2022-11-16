package j33_interface.Tasksekil;

public class Dikdörtgen implements Sekil {
    @Override
    public int cevre(int... boyut) {
        if(boyut.length==1){//varrags girilen parametre 1 tane ise kare çevre hesapla
            return (boyut[0]*4);
        }else // değilse dikdörtgen çevre hesapla
        return (boyut[0]+boyut[1])*2;
    }

    @Override
    public int alan(int... boyut) {
        if(boyut.length==1){//varrags girilen parametre 1 tane ise kare alan hesapla
            return (boyut[0]*boyut[0]);
        }else // değilse dikdörtgen alan hesapla
            return (boyut[0]*boyut[1]);

    }
}
