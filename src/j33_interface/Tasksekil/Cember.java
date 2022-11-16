package j33_interface.Tasksekil;

public class Cember implements Sekil{
    @Override
    public int cevre(int... boyut) {
        return (int) (2*PI*boyut[0]);
    }

    @Override
    public int alan(int... boyut) {
        return (int) (PI*boyut[0]*boyut[0]);
    }
}
