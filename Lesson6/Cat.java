package Lesson6;

public class Cat extends Animal{
    static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }


    public static int getCatCount() {
        return catCount;
    }

    @Override
    void run(int length) {
        boolean result = length <= 200;
        if (result) MAX_RUN_LENGTH = length;
        showResult("run",this, result);
    }

    @Override
    void swim(int length) {
        showResult("swim",this,false);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 2;
        if (result) MAX_JUMP_HEIGHT = height;
        showResult("jump",this,result);
    }

    @Override
    public String toString() {
        return "Имя кота: " + this.name;
    }
}
