package Lesson5;

public class Person {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private double salary;
    private int age;

    public Person(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " + email + " " + tel + " " + salary + " " + age);
    }
}
