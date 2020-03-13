package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }


    @Override
    public String toString() {
        return "Cat: " + name + " appetite: " + appetite + " satiety: " + satiety;
    }

    void eat(Plate plate){
        if(plate.getAmountOfFood() > appetite){
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }
}
