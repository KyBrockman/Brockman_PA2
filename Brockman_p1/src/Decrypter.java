
public class Decrypter {

	public Decrypter() {
	}
		
	
	public void Decrypt(int code) {
			int i, temp;
		
		//break the code into ints
		int[] brokenCode = new int[4];
		brokenCode[0] = code/1000;
		brokenCode[1] = (code/100)%10;
		brokenCode[2] = (code/10)%10;
		brokenCode[3] = code%10;
		
		//swap third and first digit
		temp = brokenCode[2];
		brokenCode[2] = brokenCode[0];
		brokenCode[0] = temp;
		
		//swap fourth and second digit
		
		temp = brokenCode[3];
		brokenCode[3] = brokenCode[1];
		brokenCode[1] = temp;
		
		//undo %10
		
		for(i=0;i<4;i++) {
			if(brokenCode[i]<7) {
				brokenCode[i] += 10;
			}
			//subract 7 from each
			brokenCode[i] = brokenCode[i] - 7;
		}
		for(i=0;i<4;i++) {
			//print results
			System.out.print(brokenCode[i]);
		}
		
	}
}
