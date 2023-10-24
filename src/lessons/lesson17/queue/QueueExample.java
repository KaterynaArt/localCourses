package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
 static  Queue<Integer> myQueue = new LinkedList<>();

    public static void main(String[] args) {
        addMethod(myQueue);
        elementExample(myQueue);
    }
    // вернет верхний элемент и в случае пустого выбрасывает Exception и вернет null
    static void elementExample(Queue<Integer> queue){
        System.out.println(queue.element());
        showQueue(queue);
    }
    // вернет верхний элемент и в случае пустого не выбрасывает Exception и вернет null
    static void peakExample(Queue<Integer> queue){
        System.out.println(queue.peek());
        showQueue(queue);
    }
    static void offerExample(Queue<Integer> queue, int obj){
        System.out.println("Before use offer method");
        showQueue(queue);
        queue.offer(obj);
        System.out.println('\n' + "After use offer method");
        showQueue(queue);
    }
    //удаляет  элемент по значению и в случае пустого выбрасывает Exception
    static void removeByObjExample(Queue<Integer> queue, int obj){
        System.out.println("Before deletion with remove method");
        showQueue(queue);
        queue.remove(obj);
        System.out.println('\n' + "After deletion with remove method");
        showQueue(queue);
    }
    //удаляет верхний элемент и в случае пустого не выбрасывает Exception
    static void pollExample(Queue<Integer> queue){
        System.out.println("Before deletion with poll method");
        showQueue(queue);
        queue.poll();
        System.out.println('\n' + "After deletion with poll method");
        showQueue(queue);
    }
    //удаляет верхний элемент и в случае пустого выбрасывает Exception
    static void removeExample(Queue<Integer> queue){
        System.out.println("Before deletion with remove method");
        showQueue(queue);
        queue.remove();
        System.out.println('\n' + "After deletion with remove method");
        showQueue(queue);
    }
    static void addMethod(Queue<Integer> queue){
        queue.add(3);
        queue.add(6);
        queue.add(34);
        queue.add(23);
        queue.add(76);
    }
    static void showQueue(Queue<Integer> queue){
        for (Integer i : queue){
            System.out.print(i + " ");
        }
    }
}
