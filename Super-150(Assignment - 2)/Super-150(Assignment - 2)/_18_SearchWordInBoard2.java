/*Sample Input
4 4 5
oaan 
etae 
ihkr 
iflv  
oath pea eat rain fifa
Sample Output
eat oath */

import java.util.*;
public class _18_SearchWordInBoard2 {
        public static List<String> findWords(char[][] board, String[] words) {
            int row = board.length;
            int col = board[0].length;
            
            boolean[][] visited = new boolean[row][col];
            Set<String> words_set = new HashSet<>();
            
            int max_len = 0;
            for(String w: words) {
                words_set.add(w);
                max_len = Math.max(max_len, w.length());
            }
            
            Set<String> ans = new HashSet<>(); //de-dup
            
            for(int i = 0; i < row; i++) 
                for(int j = 0; j < col; j++)
                    helper(board, words_set, i, j, visited, new StringBuilder(), ans, 0, max_len);
            
            List<String> list = new ArrayList<String>();
            list.addAll(ans);
            return list;
        }
        
        public static void helper(
            char[][] board, Set<String> words_set, int r, int c, boolean[][] visited, StringBuilder sb, Set<String> ans, int length, int max_len) {
            
            int row = board.length;
            int col = board[0].length;
            
            if (r < 0 || c < 0 || r == row || c == col) return;
            if (length >= max_len) return;
            if (visited[r][c]) return;
            
            visited[r][c] = true;
            sb.append(board[r][c]);
            
            if (words_set.contains(sb.toString()))
                ans.add(sb.toString());
            
            helper(board, words_set, r + 1, c, visited, sb, ans, length + 1, max_len);
            helper(board, words_set, r - 1, c, visited, sb, ans, length + 1, max_len);
            helper(board, words_set, r, c + 1, visited, sb, ans, length + 1, max_len);
            helper(board, words_set, r, c - 1, visited, sb, ans, length + 1, max_len);  
            
            visited[r][c] = false;
            sb.setLength(sb.length() - 1);
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ans = new ArrayList<>();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int wl = sc.nextInt();
        char[][] chart = new char[r][c];
        String[] words = new String[wl];
        for(int i = 0 ; i<r ; i++){
            String s = sc.next();
            for(int j = 0 ; j<c ; j++){
                chart[i][j] = s.charAt(j);
            }
        }
        for(int i = 0 ; i<wl  ; i++){
            words[i] = sc.next();
        }
        ans = findWords(chart,words);
        ans.sort(Comparator.naturalOrder());
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
