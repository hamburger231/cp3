public class Student {
    String name;
    int age;
    int id_card;
    boolean id_card_valid;
    int semester_number;
    double average_grade;
    String course;

    public void sayHello() {
        System.out.println("Hello from " + name);
    }
    public void displayName() {
        System.out.println(name);
    }
    public void displayAge() {
        System.out.println(age);
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name + "\nValid id card: " + id_card_valid + "\nSemester number: " + semester_number + "\nAverage grade: " + average_grade);
    }
    public void changeValidity() {
        id_card_valid = !id_card_valid;
    }
    public void displayAdditionalInfo() {
        System.out.println("Name: " + name + "\nID card: " + id_card + "\nValid id card: " + id_card_valid);
    }
    public static void main(String[] args) {
    }
}
