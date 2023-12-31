package Homework.HW4;

import java.util.LinkedList;

public class Queue {
    private LinkedList elements = new LinkedList();
  
    public Queue() { }
    public Queue(LinkedList linkedList) {
        this.elements = linkedList;
    }    

    //помещает элемент в конец очереди
    public void enqueue(Object element){
        elements.addLast(element);
    }

    //возвращает первый элемент из очереди и удаляет его
    public Object dequeue(){
        return elements.pollFirst();
    }

    //возвращает первый элемент из очереди, не удаляя
    public Object first(){
        return elements.peekFirst();
    }

    //Вывод в консоль очереди
    //Работает только если у всех элементов очереди реализован метод toString
    public void printQueue(){
        int sizeMyQueue = elements.size();
        StringBuilder result = new StringBuilder();
        if (elements.isEmpty()) {
            result.append("[]");
        } else {
            result.append(String.format("[%s", elements.get(0).toString()));
            for (int i = 1; i < sizeMyQueue; i++) {

                result.append(String.format(", %s", elements.get(i).toString()));
            }
            result.append("]");
        }
        System.out.println(result.toString()); 
    }
}
