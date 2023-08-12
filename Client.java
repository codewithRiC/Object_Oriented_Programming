

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			System.out.println("Client started");
			Socket soc = new Socket("localhost",9806);
			
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
			String text = "";
			
			while(!text.equals("stop")) {
			String str = userInput.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			out.println(str);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
