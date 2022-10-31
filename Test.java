//import java.util.StringTokenizer;
import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test {

    public static  void main(String[] args) throws NumberFormatException, IOException {
		try{
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (is);
			
			int numC = Integer.parseInt(br.readLine());
			
			for (int loop1=0;loop1<numC;loop1++) {
				
				int numD =Integer.parseInt(br.readLine());
				String s1 = br.readLine();
				Queue<Character> q = new LinkedList<Character>();
				for (int lp2=0;lp2<s1.length();lp2++) {
					if (s1.charAt(lp2)=='Q')
					{  q.add('Q');
					//System.out.println("Add succesful");
					}
					if (s1.charAt(lp2)=='A'&& !q.isEmpty()) 
						q.remove();	
				}//end for QA
				if (q.isEmpty())
					System.out.println("YES");
				else 
					System.out.println("NO");
				
			}
			
			
		}
		catch (InputMismatchException e) {
			System.out.println("something went wrong.");
		}
	
    }
}

