package HomeTask;


public class Student extends Person{
    private int countTaskDone;
    private static int allStudentsTaskDone;
    private Mentor mentor;
    private boolean isAllTaskDone;

    public Student(String name, String surname, int age, Mentor mentor) {
        super(name, surname, age);
        this.countTaskDone = 0;
        this.mentor = mentor;
        this.isAllTaskDone = false;
    }
                  // геттеры, сеттеры


    public void setCountTaskDone(int countTaskDone) {
        this.countTaskDone = countTaskDone;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setAllTaskDone(boolean allTaskDone) {
        isAllTaskDone = allTaskDone;
    }

    public int getCountTaskDone() {
        return countTaskDone;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public boolean isAllTaskDone() {
        return isAllTaskDone;
    }
                   // метод решить задачи
    public void solveTasks(int countTaskToSolve, Task[] tasks) {
        countTaskToSolve = tasks.length - this.countTaskDone;
        int begin = this.countTaskDone;
        for (int i = begin; i <  countTaskToSolve; i++) {
            solveTask(tasks[i]);
        }

        if (tasks.length == countTaskDone) {
            this.isAllTaskDone = true;
            System.out.printf("Студент %s %s выполнил все задания\n", this.getFirstName(), this.getLastName());
        }
        else {
            System.out.println("Еще не все задачи решены");
        }
    }
                   //метод решить задачу
    private void solveTask(Task task) {
        boolean check;
        if (!(task instanceof Autochecked)){     // Этот момент я не совсем понял, мне его подсказали ))
            do {
                check = this.mentor.checkCode(task);
            }
            while (!check);
        }
        System.out.printf("Задача № %d решена\n", task.number);
        this.countTaskDone += 1;
        if (this.countTaskDone > allStudentsTaskDone) {
            allStudentsTaskDone = this.countTaskDone;
        }
    }
}




