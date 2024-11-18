import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tareas;
    
    public TodoList () {
       this.tareas = new ArrayList<>();
    }
    
    public void add(String task) {
        this.tareas.add(task);
    }
    
    public void print() {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ": " + tareas.get(i));
        }
    }
    
    public void remove(int number) {
        tareas.remove(number - 1);
        
    }
    
}
