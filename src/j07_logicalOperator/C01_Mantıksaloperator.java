package j07_logicalOperator;

public class C01_Mantıksaloperator {
    public static void main(String[] args) {

/*
        -------- && - and - (ve)---------

                True   &&    True    -->  True
        True   &&    False   -->  False
        False  &&    True    -->  False
        False  &&    False   -->  False


                -------- ||- or - (veya)---------

                True   ||    True    -->  True
        True   ||    False   -->  True
        False  ||    True    -->  True
        False  ||    False   -->  False


 */
        boolean b1=true;
        int a=3;
        int c=7;

        System.out.println(b1&(a<c));//true
        System.out.println(b1&&(a>c));//false
        System.out.println(b1&(a==c));//false


        System.out.println(b1||(a<c));//true
        System.out.println(b1||(a>c));//true
        System.out.println(b1||(a==c));//true

        System.out.println(!(b1||(a>c)));//false

    }




}
