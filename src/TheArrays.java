import java.util.Arrays;

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
    }
  }

