import java.util.Scanner;
public class application {
	public static void main(String args[]) {
		
		String method;
		int code;
		Scanner scan = new Scanner(System.in);
		Decrypter decrypter = new Decrypter();
		Encrypter encrypter = new Encrypter();
		
		System.out.println("would you like the Encrypt or Decrypt");
		method = scan.nextLine();
	
		System.out.println("please enter a 4 digit code");
		code = scan.nextInt();
		
		if (method.equals("Encrypt")){
			encrypter.Encrypt(code);
		}
		if (method.equals("Decrypt")) {
			decrypter.Decrypt(code);
		}		
	}
}
