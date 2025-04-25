import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSuduko(board));
    }

    public static boolean isValidSuduko(char[][] arr) {
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (arr[row][i] == '.') continue;
                if (seen.contains(arr[row][i])) return false;
                seen.add(arr[row][i]);
            }
        }
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (arr[i][col] == '.') continue;
                if (seen.contains(arr[i][col])) return false;
                seen.add(arr[i][col]);
            }
        }
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (arr[row][col] == '.') continue;
                    if (seen.contains(arr[row][col])) return false;
                    seen.add(arr[row][col]);
                }
            }
        }
        return true;
    }


}
