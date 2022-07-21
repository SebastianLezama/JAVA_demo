import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheArrays {
  public static void main (String [] args) {
    String[] colors = new String[5];
    colors[0] = "purple";
    colors[1] = "blue";


//    for (int i = 0; i < colors.length; i++) {
//      System.out.println(colors[i]);
//    }
//
//    for (String color : colors) {
//      System.out.println(color);
//    }

//    Arrays.stream(colors).forEach(System.out::println);


    char[][] board = new char[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = '-';
      }
    }

//    System.out.println(Arrays.deepToString(board));

    List<String> colorsList = new ArrayList<>();
    colorsList.add("blue");
    colorsList.add("purple");
    System.out.println(colorsList);
    System.out.println(colorsList.size());
    System.out.println(colorsList.contains("blue"));
    System.out.println(colorsList.contains("pink"));

    for (String color : colorsList) {
      System.out.println(color);
    }

    colorsList.forEach(System.out::println);
    for (int i = 0; i < colorsList.size(); i++) {
      System.out.println(colorsList.get(i));
    }
    }
  }

