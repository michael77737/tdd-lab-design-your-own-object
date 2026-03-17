package michaelmoss;

public class Cat {

    // 5 private field attributes/modifiers
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;


    // constructor; taking all fields as parameters
    public Cat(String name, int age, String breed, String color, double weight) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");

        }


        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;


    }
    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed () {
        return breed;
    }

    public String getColor () {
        return color;
    }

    public double getWeight () {
        return weight;
    }

    // Setters
    public void setName (String name){
        this.name = name;
    }

    public void setAge ( int age){
        this.age = age;
    }

    public void setBreed (String breed){
        this.breed = breed;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setWeight ( double weight){
        this.weight = weight;
    }
    // 2 random methods
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void eat2(double foodWeight) {
        weight += foodWeight;
    }
    // IllegalArgumentException; validated weight
    public void eat(double foodWeight) {


        if (foodWeight < 0) {
            throw new IllegalArgumentException("Food amount cannot be negative");
        }

        this.weight += foodWeight;
    }

    }









