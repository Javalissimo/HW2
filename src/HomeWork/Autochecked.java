package HomeWork;

public interface Autochecked {

    default void taskDone() {
        System.out.println("Задание выполнено.");
    }
}
