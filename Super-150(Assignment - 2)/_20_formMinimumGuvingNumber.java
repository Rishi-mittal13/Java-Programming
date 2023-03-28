/*4
D I DD II */

import java.util.*;
public class _20_formMinimumGuvingNumber {

	static void printLeast(String arr)
	{
			int min_avail = 1, pos_of_I = 0;

			ArrayList<Integer> al = new ArrayList<>();
			
			if (arr.charAt(0) == 'I'){
				al.add(1);
				al.add(2);
				min_avail = 3;
				pos_of_I = 1;}
			else{
				al.add(2);
				al.add(1);
				min_avail = 3;
				pos_of_I = 0;}
			for (int i = 1; i < arr.length(); i++)
			{
				if (arr.charAt(i) == 'I')
				{
					al.add(min_avail);
					min_avail++;
					pos_of_I = i + 1;
				}
				else
				{
					al.add(al.get(i));
					for (int j = pos_of_I; j <= i; j++)
							al.set(j, al.get(j) + 1);

					min_avail++;
				}
			}

			for (int i = 0; i < al.size(); i++)
				System.out.print(al.get(i));
			System.out.println();
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n ;i++){
            String s = sc.next();
            printLeast(s);
        }
        sc.close();
	}
}

