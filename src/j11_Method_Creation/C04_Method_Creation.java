package j11_Method_Creation.taskmethod;

public class C04_Method_Creation {
    public static void main(String[] args) {

        String name="Sümeyra";
        C04_MethodDepo.geçmenotu(24);//depo classtan code call ettik

        C04_MethodDepo.topla(3, 5);//8 diğer köy amelesi...

       /*
    farklı class'dan method call etmek için..
    1. method static_> gökteki güneş gibi
    2.ClassName.methodName() şeklinde call edilir
     aynı class'daki method doğrudan methodName ile call edilir...
      */
        selamver();//aynı class'dan methodName ile call edildi->kendi köyümün amelesi
    }
    public static void selamver(){
        System.out.println("agam selamlar Devamkeee:)");
    }
}
