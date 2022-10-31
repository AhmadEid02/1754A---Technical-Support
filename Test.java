//import java.util.StringTokenizer;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
public class Test {

    public static void main(String[] args) {
		
			InputStreamReader i = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(i);
//			Scanner scan =new Scanner(System.in);
//			Scanner scanl =new Scanner(System.in);
			int numC = Integer.parseInt(b.readLine());
			
			for (int loop1=0;loop1<numC;loop1++) {
				
				int numD =Integer.parseInt(b.readLine());
				String s1 = b.readLine();
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
			
//			scan.close();
//			scanl.close();
	
		}
	
    }


