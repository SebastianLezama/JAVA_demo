import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueue {
  public static void main(String[] args) {

    Queue<Person> supermarket = new LinkedList<>();
    supermarket.add(new Person("Alex", 21));
    supermarket.add(new Person("Ro", 31));

    LinkedList<Person> linkedList = new LinkedList<>();
    linkedList.add(new Person("Seba", 37));
    linkedList.add(new Person("Ro", 31));

    for (Person next : linkedList) {
      System.out.println(next);
    }
    System.out.println();
    ListIterator<Person> personListIterator = linkedList.listIterator();
    while (personListIterator.hasNext()) {
      System.out.println(personListIterator.next());
    }
    while (personListIterator.hasPrevious()) {
      System.out.println(personListIterator.previous());
    }


//    System.out.println(supermarket.peek());
//    System.out.println(supermarket.poll());
    System.out.println(supermarket.size());
//    System.out.println(supermarket.peek());
  }
    record Person(String name, int age) {}
}
