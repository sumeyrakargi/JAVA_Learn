package j34_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CC {

    public static void main(String[] args) {



            List<String> list = new ArrayList<>();

            list.add("AB");



            ListIterator<String> it = list.listIterator();

            if(it.previousIndex()==-1) {

                while(it.hasNext()) {

                    System.out.print(it.next() + " ");

                }

            }else {

                System.out.print("Good Morning!");

            }

        }

    }

