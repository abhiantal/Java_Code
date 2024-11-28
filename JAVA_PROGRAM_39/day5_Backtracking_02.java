import java.util.ArrayList;
import java.util.List;

public class day5_Backtracking_02 {

    // public static void permutations(String str, String perm, int indx) {
    //     if (str.length() == 0) {
    //         System.out.print(perm+","+" ");
    //         return;
    //     }
    //     for(int i=0; i<str.length(); i++){
    //         char current = str.charAt(i);
    //         String newStr = str.substring(0, i) + str.substring(i+1);
    //         permutations(newStr, perm + current, indx+1);
    //     }
    // }

    // public static void main(String[] args) {

    //     //permutations("Abhi", "", 0);
        
    // }

    public boolean isSafe(int row, int col, char[][] board){

        for(int j=0; j<board.length; j++){
            if (board[row][j]=='Q') {
                return false;
            }
        }
        for(int j=0; j<board.length; j++){
            if (board[j][col]=='Q') {
                return false;
            }
        }
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        r = row;
        for(int c=col; c<board.length && r>=0; c++, r--){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        r = row;
        for(int c=col; c>=0 && r<board.length; c--, r++){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        r = row;
        for(int c=col; c<board.length && r<board.length; c--, r--){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        return true;
    }
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '-';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public void helper(char[][] board, List<List<String>> allBoards, int cal){
        if (cal == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row<board.length; row++){
            if (isSafe(row, cal, board)) {
                board[row][cal] ='Q';
                helper(board, null, cal+1);
                board[row][cal] = '.';
            }
        }
    }
    public List<List<String>> saveQueens(int n){
        List<List<String>>allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
}
