public class PersonInfo {
    private String name;
    private int age;
    private String address;

    // Constructor with three parameters
    public PersonInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method that accepts a PersonInfo object as a parameter
    public void printCurrentInstance(PersonInfo person) {
        person.displayDetails();
    }

    public static void main(String[] args) {
        // Create an object in the main class by my name
        PersonInfo assistant = new PersonInfo("Kibz", 19, "Nyahururu road,2nd avenue");

        // Use the object to call the printCurrentInstance method
        assistant.printCurrentInstance(assistant);
    }
}
