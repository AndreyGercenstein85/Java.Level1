package Lesson6;

import java.security.CodeSource;
import java.util.ArrayList;

public class Lesson6 {
    public static void main(String[] args) {

        ArrayList<Cat> catRec = new ArrayList<Cat>();
        ArrayList<Dog> dogRec = new ArrayList<Dog>();

        Cat cat = new Cat("Кот_1");
        System.out.println(cat.toString());
        cat.run(100);
        cat.swim(100);
        cat.jump(2);

        System.out.print(String.format("%30s", " ").replace(" ","*"));
        System.out.println();
        Dog dog = new Dog("Собака_1");
        System.out.println(dog.toString());
        dog.run(100);
        dog.swim(100);
        cat.jump(2);

        for (int i = 2; i < 5; i++) {
            catRec.add(new Cat("Кот_"+i));
            dogRec.add(new Dog("Собака_"+i));
        }

        for (Cat catname : catRec){
            System.out.println(catname);
            catname.run((int)Math.random() * 500);
            catname.jump((double)Math.random() * 3);
        }
        for (Dog dogname : dogRec){
            System.out.println(dogname);
            dogname.run((int)Math.random() * 500);
            dogname.jump((double)Math.random() * 3);
            dogname.swim((int)Math.random() * 0);
        }

        System.out.print(String.format("%30s", " ").replace(" ","*"));
        System.out.println();
        System.out.println("===Статистика===");
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Животных: " + Dog.getAnimalCount());

    }
}
