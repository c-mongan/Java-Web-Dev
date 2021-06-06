package guessWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.ArrayList;

public class Player1 {
	
	public boolean containsChar(String s, char search) {
	    if (s.length() > 5) throw new IllegalArgumentException();

	    try {
	        if (s.charAt(0) == search) return true;
	        if (s.charAt(1) == search) return true;
	        if (s.charAt(2) == search) return true;
	        if (s.charAt(3) == search) return true;
	        if (s.charAt(4) == search) return true;
	    } catch (IndexOutOfBoundsException e) {
	        // this should never happen...
	        return false;
	    }
	    return false;
	}


	public Player1() throws IOException{
		// TODO Auto-generated constructor stub
		
		System.out.println("Player 1 started"); //Sets up "factory"
		ServerSocket server = new ServerSocket(4444);//Listens for client and creates socket here when request comes in
		System.out.println("Player 1 is waiting for Player 2 connection...");
		Socket player1 = server.accept();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(player1.getInputStream()));
		PrintWriter out = new PrintWriter(player1.getOutputStream(), true);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Word less than 5 letters");
		String Word = scan.nextLine();
		
		
		
		out.println("Hi there player 2! , Please make a guess");
		
		
		
		String guess1 = in.readLine();
		char g1=guess1.charAt(0);
	System.out.println("This is player 1's guess 1 " + g1);
		
		out.println("Hi there player 2! , Please make a guess");
		
		String guess2 = in.readLine();
		char g2=guess2.charAt(0);
		System.out.println("This is player 1's guess 2 " + g2);
		
		out.println("Hi there player 2! , Please make a guess");
		
		String guess3 = in.readLine();
		char g3=guess3.charAt(0);
		System.out.println("This is player 1's guess 3 " + g3);
		
		out.println("Hi there player 2! , Please make a guess");
		
		String guess4 = in.readLine();
		char g4=guess4.charAt(0);
		System.out.println("This is player 1's guess 4 " + g4);
		
		out.println("Hi there player 2! , Please make a guess");
		
		String guess5 = in.readLine();
		char g5=guess5.charAt(0);
		System.out.println("This is player 1's guess 5 " + g5);
		
		boolean check1 = containsChar(Word, g1);
		boolean check2 = containsChar(Word, g2);
		boolean check3 = containsChar(Word, g3);
		boolean check4 = containsChar(Word, g4);
		boolean check5 = containsChar(Word, g5);
		
		if( check1 == true) {
			System.out.println(g1 + " is in the word ");
		} if (check2 == true) {
			System.out.println(g2 + " is in the word ");
		} if(check3 == true) {
			System.out.println(g3 + " is in the word ");
		} if (check4 == true) {
					System.out.println(g4 + " is in the word ");
		} if (check5 == true) {
			System.out.println(g5 + " is in the word ");
		if (check1 == false | check2 == false | check3 == false | check4 == false | check5 == false)
				System.out.println("Try again!");
				
			 
			}
		System.out.println("The word was " + Word);
		
			
			
		
		}
		
	
	
	
	
	public static void main(String[] args) throws IOException {
		new Player1();
	}

}

/*char[] ch = new char[Word.length()];

for (int i = 0; i < Word.length(); i++) {
    ch[i] = Word.charAt(i);
}

for (char c : ch) {
    out.println(c);
}
*/
/*String guess= in.readLine();
System.out.println(guess + "is the guess");

for (int i = 0; i < 4; i++) {
	
if (Word.charAt(i) == guess.charAt(i))
	
	System.out.println(guess + " is correct");
	

else 
	
	System.out.println(guess.charAt(i) + " is incorrect");
	
} */