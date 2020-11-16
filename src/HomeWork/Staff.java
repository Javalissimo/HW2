package HomeWork;


public interface Staff {

    void helpStudent(Student student);

    default void giveAdditionalStaff() {
        System.out.println("https://habr.com/ru/");
    }
}
