package Lesson7;

public class Plate {
    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return "PLATE: " + capacity;
    }

    public void decreaseFood(int amount){
        if (capacity >= amount ){
            capacity -= amount;
        }
    }

    public int getAmountOfFood(){
        return this.capacity;
    }

    public void increaseFood(int amount){
        capacity += amount;
    }
}
