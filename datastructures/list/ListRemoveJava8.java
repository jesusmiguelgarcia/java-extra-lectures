import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ListRemoveJava8 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(Arrays.asList(args));
    // Remove all names starting with "rik", Using a ListIterator
    names = names
      .stream()
      .filter(s -> ! s.toLowerCase().startsWith("rik"))
      .collect(Collectors.toList());
    System.out.println("The resulting list:");
    for (String name : names) {
      System.out.println(name);
    }
  }
}
