package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Test Test0", "Engineer", "Test Test@mailbox.com", "123", 300, 30);
        persArray[1] = new Person("Test Test1", "Engineer1", "Test Test1@mailbox.com", "123", 400, 40);
        persArray[2] = new Person("Test Test2", "Engineer2", "Test Test2@mailbox.com", "123", 500, 50);
        persArray[3] = new Person("Test Test3", "Engineer3", "Test Test3@mailbox.com", "123", 600, 60);
        persArray[4] = new Person("Test Test4", "Engineer4", "Test Test4@mailbox.com", "123", 700, 70);

        for(Person pers : persArray){
            if(pers.getAge() > 40) pers.Show();
        }
    }
}
