import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheMap {

  public static void main(String[] args) {
    // key value pairs
    Map<Person, Diamond> mapList = new HashMap<>();
    mapList.put(new Person("Joe"), new Diamond("Ruby"));
    System.out.println((mapList.get(new Person("Joe"))).name());
  }

  private static void maps() {
    Map<Integer, Person> theMap = new HashMap<>();
    theMap.put(1, new Person("Ro"));
    theMap.put(2, new Person("Seba"));
    theMap.put(3, new Person("Ro"));
    System.out.println(theMap);
    System.out.println(theMap.size());
    System.out.println(theMap.get(1));
    System.out.println(theMap.containsKey(4));
    System.out.println(theMap.containsValue(new Person("Ro")));
    System.out.println(theMap.keySet());
    System.out.println(theMap.values());
    System.out.println(theMap.entrySet());
    theMap.entrySet()
        .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    theMap.forEach((key, value) -> System.out.println(key + " " + value));
    System.out.println(theMap.getOrDefault(4, new Person("default")));
  }

  static class Person {
    String name;
    public Person(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return super.toString();
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o;
      return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name);
    }
  }
//  record Person (String name) {}
  record Diamond (String name) {}
}
