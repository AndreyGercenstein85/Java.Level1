package Lesson7;


import java.util.HashSet;
import java.util.Set;

public class Lesson7 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<Cat>();
        for (int i = 0; i < 10 ; i++) {
            String name = "Cat_" + i;
            set.add(new Cat(name, (int)(Math.random()*10)));
        }
        Plate plate = new Plate(10);
        printCatSet(set);
        System.out.println(plate);
        System.out.print(String.format("%30s", " ").replace(" ","*"));
        System.out.println();
        plate.increaseFood(10);
        takeCatFood(set,plate);

    }
    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static  void takeCatFood(Set<Cat> set, Plate plate){
        for (Cat cat : set) {
            cat.eat(plate);
            System.out.println(cat);
        }
    }

}
