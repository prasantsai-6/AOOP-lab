package todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoListApplication {
    private List<String> tasks;

    public ToDoListApplication() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newDescription);
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoListApplication app = new ToDoListApplication();
        app.addTask("Buy groceries");
        app.addTask("Read a book");
        app.updateTask(0, "Buy groceries and cook dinner");
        app.removeTask(1);
        app.displayTasks();
    }
}
