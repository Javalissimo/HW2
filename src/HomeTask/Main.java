package HomeTask;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Mentor mentorOne = new Mentor("Vladimir", "Pupkin", 25);
        Mentor mentorTwo = new Mentor("Barbaris", "Petrosian", 48);
        Task tasks[] = new Task[40];
        Student[] students = new Student[5];

        for(int i = 0; i <40; i++) {
            switch ((new Random().nextInt(2))) {
                case 0: tasks[i] = new Code();
                case 1: tasks[i] = new Test();
                case 2: tasks[i] = new DragAndDrop();
            }
        }
        for (int i = 0; i < 5; i++){
            Mentor mentor = (i%2==0) ? mentorOne : mentorTwo;
            students[i] = new Student("Vasiliy" + (i), "Kodov", 25, mentor);
        }

        for(Student student : students){
            while (!student.isAllTaskDone()){
                int countTasks = 0 + (int) (Math.random() * 50);
                System.out.printf("Студент %s начал решать %d задач \n", student.getFirstName(), countTasks);
                student.solveTasks(countTasks, tasks);
            }
        }







    }

}