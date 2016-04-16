package Text2Speech;

import java.util.Scanner;

public class MainSource {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		int inp;
		System.out.println("***************************************************************************************************");
		System.out.println("\t \t Welcome To T2S v1.1 Wrote By -Ishu Sharma");
		System.out.println("\t \t for further information contact -ishubot@gmail.com ");
		System.out.println("\t \t Choose the Correct option from menu");
		System.out.println("***************************************************************************************************");
		System.out.println("");
		boolean ex = true;
		while(ex){
			System.out.println(" ");
			System.out.println(" \t  \t MAIN MENU");
		System.out.println("1. Sample Voices (3 available)");
		System.out.println("2. Create & Listen");
		System.out.println("3. Create & Save (In .WAV Format)");
		System.out.println("4. Configuration (Voice Setting)");
		System.out.println("5. Exit");
		System.out.println("6. Author Details");
		inp=input.nextInt();
		switch(inp){
		case 1:{
			Sample sa = new Sample();
			System.out.println(" \t \t There are 3 voices available:");
			System.out.println("1. Female U.S");
			System.out.println("2. Male U.S");
			System.out.println("3. Male U.S 2");
			int in;
			in = input.nextInt();
			switch(in){
			case 1: sa.speak1();
			break;
			case 2: sa.speak2();
			break;
			case 3: sa.speak3();
			break;
			default:{
				System.out.println("Wrong Choice");
			}
			}
			
			break; 
		}
		case 2:{
			System.out.println(" ");
			
			System.out.println("You can create and listen to audio, if you want to save audio choose option 3 on main menu.");
			System.out.println("Do you want to Continue? yes : no  (no = back to main menu)");
			String t;
			t=input.next();
			if(t.equals("yes")||t.equals("YES")){
				System.out.println(" ");
				System.out.println("Enter the text to convert (Don't use enter only spaces valid)");
				String text2speech;
	text2speech=input4.nextLine();
				System.out.println(" ");
				System.out.println(" Select the voice from the options");
				System.out.println("1. Female U.S");
				System.out.println("2. Male U.S");
				System.out.println("3. Male U.S");
				int vo;
				vo=input2.nextInt();
				switch(vo){
				case 1:{
					T2S tts = new T2S(text2speech,"mbrola_us1");
					System.out.println(" Speaking....");
					tts.speak();
					
					System.out.println("going back to main menu ../... ");
					System.out.println(" ");
					break;
				}
				case 2:{
					T2S tts = new T2S(text2speech,"mbrola_us2");
					System.out.println(" Speaking....");
					tts.speak();
					System.out.println("going back to main menu ../... ");
					System.out.println(" ");
					break;
				}
				case 3:{
					T2S tts = new T2S(text2speech,"mbrola_us3");
					System.out.println(" Speaking....");
					tts.speak();
				
					System.out.println("going back to main menu ../... ");
					System.out.println(" ");
					break;
				}
				default:{
					System.out.println("Wrong Choice");
					break;
				}
				}
			}else{
				System.out.println("Wrong Choice");
			}
			break;
		}
		case 3:{
			System.out.println(" ");
			System.out.println("Enter file name to be saved. ");
			String name;
			name=input.next();
			System.out.println("Enter the text to convert (Don't use enter only spaces valid)");
			String text2speech;
text2speech=input4.nextLine();
			System.out.println(" ");
			System.out.println(" Select the voice from the options");
			System.out.println("1. Female U.S");
			System.out.println("2. Male U.S");
			System.out.println("3. Male U.S");
			int vo;
			vo=input2.nextInt();
			switch(vo){
			case 1:{
				T2S tts = new T2S(text2speech,"mbrola_us1");
				System.out.println(" Saving....");
				tts.save(name);
				
				System.out.println("going back to main menu ../... ");
				System.out.println(" ");
				break;
			}
			case 2:{
				T2S tts = new T2S(text2speech,"mbrola_us2");
				System.out.println(" Saving....");
				tts.save(name);
				System.out.println("going back to main menu ../... ");
				System.out.println(" ");
				break;
			}
			case 3:{
				T2S tts = new T2S(text2speech,"mbrola_us3");
				System.out.println(" Saving....");
				tts.save(name);
			
				System.out.println("going back to main menu ../... ");
				System.out.println(" ");
				break;
			}
			default:{
				System.out.println("Wrong Choice");
				break;
			}
			}
			break;
		}
		case 4:{
			System.out.println(" ");
			System.out.println("Want to set to default? yes : no ");
			String answer;
			answer=input3.next();
			if(answer.equals("yes")||answer.equals("Yes")){
				T2S.setPitch(0);
				T2S.setSrate(0);
				System.out.println("Set To Default");
				
			}else{
			System.out.println(" ");
			System.out.println("Enter the pitch rate in float (ex- -1200 or 1200) pitch leads to change the voice lower the pitch heavier the voice 0.0 default ");
		float pitch;
		pitch=input.nextFloat();
		T2S.setPitch(pitch);
		System.out.println("Enter the Speaking rate words per minute ex-60 or 100  ");
		float srate;
		srate=input2.nextFloat();
		T2S.setSrate(srate);
		System.out.println(" ");
		System.out.println("Configuration Saved for this session ");
			}
		break;
		}
		case 5:{
			System.out.println("Exiting...");
			System.out.println(" Exit Succesful, See You Again!");
			ex=false;
			break;
		}
		case 6:{
System.out.println(" ");
System.out.println(" Author Name: Ishu Sharma");
System.out.println(" Email:ishubot@gmail.com ");
System.out.println(" learnershut.com");

break;
		}
		default:{
			System.out.println("Wrong Choice");
		}
		}
		}
	}
 
}
