import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    void QueueisEmpty(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void EnqueuetheQueue(){
        Queue queue = new Queue();
        queue.enqueue(1);
        assertTrue( queue.isNotEmpty());
    }
    @Test
    void PeekTest(){
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.peek());

    }
    @Test
    void DequeuetheQueue(){
        Queue queue = new Queue();
        queue.enqueue(1);
        int element = queue.dequeue();
        assertEquals(1, element);
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }
    @Test
    void SizeofQueue(){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        int actualSize = queue.size();
        assertEquals(3, actualSize);
    }



//    @Test
//    void DisplayQueue() {
//        Queue queue = new Queue();
//        queue.display();
//        assertEquals(1);
//    }
}