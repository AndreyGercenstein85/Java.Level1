package Lesson6;

public class Dog extends Animal{
    static int dogCount;
    private  int maxLength;
    private  int MAX_SWIM_LENGTH;

    public Dog(String name) {
        super(name);
        dogCount++;
        maxLength = Math.random() > 0.5 ?  400 : 600;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    void run(int length) {
        boolean result = length <= maxLength;
        if (result) maxLength = length;
        showResult("run",this,result);
    }

    @Override
    void swim(int length) {
        boolean result = length <= 10;
        if (result) MAX_SWIM_LENGTH = length;
        showResult("swim",this,result);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 0.5;
        if (result) MAX_JUMP_HEIGHT = height;
        showResult("jump",this,result);
    }

    @Override
    public String toString() {
        return "Имя собаки: " + this.name;
    }

}
