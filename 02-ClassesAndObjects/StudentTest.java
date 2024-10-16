public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.age = 23;
        s.course = "IT";
        s.id_card = 231523;
        s.id_card_valid = true;
        s.average_grade = 4.3;
        s.semester_number = 4;
        s.changeValidity();
        s.displayAdditionalInfo();
    }
}
