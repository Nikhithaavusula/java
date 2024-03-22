public class Main {
    public static void main(String[] args) {
        int age = 22;
        double weight = 65.5;
        float temperature = 37.5f;
        boolean isStudent = true;
        char gender = 'F';
        String name = "Nikhitha";
        int[] scores = {67,86,95,34,75};
        Person person = new Person("Shivani", 23);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Temperature: " + temperature);
        System.out.println("Is student? " + isStudent);
        System.out.println("Gender: " + gender);
        System.out.println("Name: " + name);
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Person: " + person.name + ", Age: " + person.age);
    }
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
