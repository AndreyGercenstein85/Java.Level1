package Lesson6;

public abstract class Animal {
    String name;
    static int animalCount;
    protected int MAX_RUN_LENGTH;
    protected double MAX_JUMP_HEIGHT;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    abstract void run(int lenght);
    abstract void swim(int lenght);
    abstract void jump(double height);

    static void showResult(String methodName, Object obj, boolean result) {
        System.out.println(obj.getClass().getName() + " : " + methodName + " : "  + result);
    }

}



