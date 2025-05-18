import java.util.ArrayList;
import java.util.List;

public class Queue {
    public List<Integer> elements;
    public
    Queue(){
        this.elements = new ArrayList<>();
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public boolean isNotEmpty(){
        return !elements.isEmpty();
    }


    public int size(){
        return elements.size();
    }
    public boolean enqueue(int element){
        return elements.add(1);
    }
    public int peek(){
        return elements.get(0);
    }
    public int dequeue(){
        return elements.remove(0);
    }
}