import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

   /*     Supplier<LocalTime>supplier=LocalTime::now;
        System.out.println(supplier.get());*/

          /*  Supplier<Double>supplier=()->(double)Math.random()*10;
        System.out.println(supplier.get());*/


      /*  Function<String,Integer>function=Integer::valueOf;
        int a =function.apply("123");

        System.out.println(a+5);*/
      /*  Predicate<Integer>predicate=x-> x<10;
        Predicate<String>predicate1=x->x.length()<10;

        System.out.println(predicate1.test("word"));
        System.out.println(predicate.test(133));
*/
   /*     List<String>list=new ArrayList<>();
        list.add("laptop");
        list.add("Smart");
        list.add("TV");

        BiPredicate<String,Integer>biPredicate=(x,y)->x.length()!=y;


      for (String s:list){
          System.out.println(biPredicate.test(s,5));

        }
    }*/
        System.out.println("-----------1----<Supplier>------------");
        Supplier<LocalTime> supplier = LocalTime::now;
        System.out.println(supplier.get());

        System.out.println("---------------2----Supplier-----------------------");
        Supplier<Double> supplier1 = () -> (double) (Math.random() * 50);
        System.out.println(supplier1.get());

        System.out.println("---------------1--Birfunction----------------------");
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("36");
        list.add("199");
        BiFunction<String, String, Integer> function = (x, y) -> x.length();
        for (String s : list) {
            System.out.println(function.apply(s, ""));
        }

        System.out.println("----------------2--Birfunction-------------------");

        List<String> list1 = new ArrayList<>();

        list1.add("Oksana");
        list1.add("Aizat");
        list1.add("  Kanikei");

        BiFunction<String, String, Integer> function1 = (x, y) -> x.length();
        for (String e : list1) {
            System.out.println(function.apply(e, ""));
        }
        System.out.println("----------------3 Predicate-----------------------");
        List<String> list2 = new ArrayList<>();
        list2.add("Ernaz");
        list2.add("Sanjar");
        list2.add("Eldan");
        Predicate<String> predicate = x -> x.length() < 7;

        for (String d : list2) {
            System.out.println(predicate.test(d));
        }
        System.out.println("--------------3- Predicate-------------");
        List<String> list3 = new ArrayList<>();

        list3.add("Aizat");
        list3.add("Nurseit");
        list3.add("Adilet");
        list3.add("Madina");

        Predicate<String> predicate1 = x -> x.contains("A");
        for (String string : list3) {
            System.out.println(predicate1.test(string));
        }
        System.out.println("--------4-Predicate-------------");
        BiPredicate<Integer, Integer> biPredicate = (x, y) ->x==y;
        System.out.println(biPredicate.test(12,12));
        BiPredicate<Integer,Integer> biPredicate1=(x,y)->x<y;
        System.out.println(biPredicate1.test(12,34));
        System.out.println("-----------6 BiFunction-----------");

        BiFunction<Integer,Integer,Double>biFunction = (x,y)->Double.valueOf(x+y*(9/5+(32)));
        System.out.println(biFunction.apply(20,20));
    }
}