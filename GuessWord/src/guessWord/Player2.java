package guessWord;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Player2 {

	public Player2() throws UnknownHostException, IOException{
		// TODO Auto-generated constructor stub
		
		System.out.println("Player 2 started"); //Sets up "factory"
		Socket player2 = new Socket("localhost",4444);//Listens for client and creates socket here when request comes in
		System.out.println("Player 2 connected to Server");
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(player2.getInputStream()));
		PrintWriter out = new PrintWriter(player2.getOutputStream(), true);
		
		String textFromPlayer1 = in.readLine();
		System.out.println("Got this from player 1 " + textFromPlayer1);
		
	Scanner scan = new Scanner(System.in);
		
	   
		System.out.println("Please enter your letter 1");
		String guess = scan.nextLine();
		out.println(guess + " Is the guess");
		
		String text2 = in.readLine();
		System.out.println( text2);
		 
		System.out.println("Please enter your letter 2");
		String guess2 = scan.nextLine();
		out.println(guess2 + " Is the guess");
		
		String text3 = in.readLine();
		System.out.println( text3);
		
		 
		System.out.println("Please enter your letter 3");
		String guess3 = scan.nextLine();
		out.println(guess3 + " Is the guess");
		
		String text4 = in.readLine();
		System.out.println( text4);
		
		 
		System.out.println("Please enter your letter 4");
		String guess4 = scan.nextLine();
		out.println(guess4 + " Is the guess");
		
		String text5 = in.readLine();
		System.out.println( text5);
		
		 
		System.out.println("Please enter your letter 5");
		String guess5 = scan.nextLine();
		out.println(guess5 + " Is the guess");
	
		
		
       // System.out.println(guess);
		
		
		//System.out.println("Guess is " + guess);
		
		}
		
	
	
	public static void main(String[] args) throws IOException {
		new Player2();
	}

}


