package HomeTask;

public abstract class Task {
    int number;
    String taskText;

    public Task() {
        number = 0;
        taskText = "Task";
    }
    public Task(int number){
        this();
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
