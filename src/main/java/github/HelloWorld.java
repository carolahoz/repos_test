package github;

import java.util.Scanner;

public class HelloWorld {

	private String response;
	private int choice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld hello = new HelloWorld();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello world!!!");
		
		while (hello.response != "h") {
		
		
	System.out.println("Do you want to tell me your daemon name or what type of animal it is? Press 1 for name, press 2 for animal");
	
		hello.choice = sc.nextInt();
		
		if (hello.choice == 1) {
			
			
			
			System.out.println("Okay, write the name of your daemon and I will try to identify you");
		
		hello.response = sc.next();
		
		
		
		
		if(hello.response.contains("Areum")) {
			
			System.out.println("It's the lovely Nahee!");
		}
		
		else if (hello.response.contains("Nephelion")){
				
				System.out.println("It's a me, Chii!");
					
			}
		
		else if (hello.response.contains("Amandus")) {
			System.out.println("You're Reader!");
		}
		
		else {
		
		System.out.println("I don't know any daemon by that name, sorry");
		
		}
			
			
		}
		
		
		
		else if (hello.choice == 2) {
			
			System.out.println("Okay, tell me what kind of animal your daemon is");
			
			hello.response = sc.nextLine();
			
			System.out.println(hello.response);
			
			if (hello.response.contains("canadian lynx")) {
				
				System.out.println("It's the lovely Potato!");
			}
			
			else if (hello.response.contains("tabby cat")) {
				
				System.out.println("It's the lovely Nahee!");
			}
			
			else if (hello.response.contains("white-sided jackrabbit")) {
				
				System.out.println("It's a me, Chii!");
			}
		}
		
		}

}
	
}
