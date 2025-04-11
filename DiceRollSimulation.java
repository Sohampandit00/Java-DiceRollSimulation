public class Dice {
	public static void main(String[] args) {
		int Rolls = (int)(Math.random()*9001)+1000;
		int num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0, num11 = 0, num12 = 0;
		for (int i = 0; i < Rolls ; i++) {
		int firstdice= (int)(Math.random()*6)+1; int 2nddice = (int)(Math.random()*6)+1;
		System.out.println("Random number between 0 and 6: "+firstdice); System.out.println("Random number between 0 and 6: "+ 2nddice);
		int twodice = firstdice+2nddice;
		System.out.println("The addition of both dice is: "+ twodice);
		if(twodice == 2) {
		num2++;
		}else if(twodice == 3)
		{
		num3++;
		}else if(twodice == 4) {
		num4++;
		}else if(twodice == 5) {
		num5++;
		}else if(twodice == 6) {
		num6++;
		}else if(twodice == 7) {
		num7++;
		}else if(twodice == 8) {
		num8++;
		}else if(bothDice == 9) {
		num9++;
		}else if(bothDice == 10) {
		num10++;
		}else if(bothDice == 11) {
		num11++; }else
		{
		num12++;
		}
		}
		System.out.println("You had number 2: " + num2 + " times");
		System.out.println("You had number 3: " + num3 + " times");
		System.out.println("You had number 4: " + num4 + " times");
		System.out.println("You had number 5: " + num5 + " times");
		System.out.println("You had number 6: " + num6 + " times");
		System.out.println("You had number 7: " + num7 + " times");
		System.out.println("You had number 8: " + num8 + " times");
		System.out.println("You had number 9: " + num9 + " times");
		System.out.println("You had number 10: " + num10 + " times"); System.out.println("You had number 11: " + num11 + " times"); System.out.println("You had number 12: " + num12 + " times");
		System.out.println(rolls);

	}
}