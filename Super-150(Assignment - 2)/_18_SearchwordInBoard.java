/*4 4 5
oaan 
etae 
ihkr 
iflv  
oath pea eat rain fifa*/


import java.util.*;
public class _18_SearchwordInBoard {
    public  static boolean WordSearch(char[][] board, int cr, int cc, String word, int idx) {
		if (idx == word.length()) {
			return true;
		}

		if (cc < 0 || cr < 0 || cc >= board[0].length || cr >= board.length || word.charAt(idx) != board[cr][cc]) {
			return false;
		}
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };
        boolean ans = false;
       // board[cr][cc] = '*';
		for (int i = 0; i < c.length; i++) {
			ans = WordSearch(board, cr + r[i], cc + c[i], word, idx + 1);
			if (ans == true) {
				return ans;
			}
		}
		//board[cr][cc] = word.charAt(idx);//backtracking
		return false;
	}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 =  sc.nextInt();
        int m1 = sc.nextInt();
        int n = sc.nextInt();
        char[][] arr = new char[n1][m1];
        for(int  i = 0 ; i<n1 ; i++){
            String s = sc.next();
            for(int j = 0 ;j <m1 ; j++){
                arr[i][j] =  s.charAt(j);
            }
        }
        String[] words = new String[n];
        for(int i  = 0 ; i <n ; i++){
            words[i] = sc.next();
        }
        ArrayList<String> selectedWords = new ArrayList<String>();
        for(int k = 0 ; k<n ; k++){
            for(int i = 0 ;i<arr.length ; i++){
                for(int j = 0 ;j<arr[0].length ; j++){
            if(WordSearch(arr, i,j, words[k], 0)) selectedWords.add(words[k]);}
            }
        }
        selectedWords.sort(Comparator.naturalOrder());
        System.out.println(selectedWords);
        sc.close();
    }
}
