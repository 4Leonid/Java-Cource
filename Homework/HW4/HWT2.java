package Homework.HW4;

public class HWT2 {
     public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        Queue myQueue = new Queue();
        System.out.println("\nОчередь при открытии магазина:");
        myQueue.printQueue();
        myQueue.enqueue("Покупатель1");
        myQueue.enqueue("Покупатель2");
        myQueue.enqueue("Покупатель3");
        myQueue.enqueue("Покупатель4");     
        myQueue.enqueue("Покупатель5");    
        System.out.println("\nОчередь через 20 минут:");        
        myQueue.printQueue();
        System.out.printf("\nРасплатился %s\n",myQueue.dequeue());
        System.out.println("\nОстались:");
        myQueue.printQueue();
        System.out.printf("\nПервый в оереди %s\n",myQueue.first());
        System.out.printf("\nРасплатился %s\n",myQueue.dequeue());
        System.out.println("\nОстались:");
        myQueue.printQueue();
    }
}
