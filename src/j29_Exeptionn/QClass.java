package j29_Exeptionn;

public class QClass {

            int price = 20000;

            int day=5;

            String room= "King";

            public static void main(String[] args) {

                QClass roomKing = new QClass();

                System.out.println("Price: " + roomKing .price);

                System.out.println("Day: " + (roomKing .day- 2));

                System.out.println("Room: " + roomKing .room.replace("K", "W"));

            }}


