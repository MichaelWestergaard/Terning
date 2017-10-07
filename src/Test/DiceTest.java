package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import terning.Dice;

public class DiceTest {
	
	Dice diceTest = new Dice();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRoll() {
		fail("Not yet implemented");
	}

	@Test
	public void roll60000TimesTest() {
		int[] rolls = new int[60000];
		int oneCount = 0, twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0;
		
		for (int i = 0; i < 60000; i++) {
			rolls[i] = diceTest.roll();
			switch(rolls[i]) {
			case 1:
				oneCount++;
				break;
			case 2:
				twoCount++;
				break;
			case 3:
				threeCount++;
				break;
			case 4:
				fourCount++;
				break;
			case 5:
				fiveCount++;
				break;
			case 6:
				sixCount++;
				break;
			}
		}
		
		System.out.println("1: " + oneCount + " ~ " + (double)oneCount/60000*100);   //5755  ~ 9.59%
		System.out.println("2: " + twoCount + " ~ " + (double)twoCount/60000*100);   //11930 ~ 19.88%
		System.out.println("3: " + threeCount + " ~ " + (double)threeCount/60000*100); //11999 ~ 20%
		System.out.println("4: " + fourCount + " ~ " + (double)fourCount/60000*100);  //12066 ~ 20.11%
		System.out.println("5: " + fiveCount + " ~ " + (double)fiveCount/60000*100);  //12104 ~ 20.17%
		System.out.println("6: " + sixCount + " ~ " + (double)sixCount/60000*100);   //6146  ~ 10.24%
		
		boolean oneTrue = false, twoTrue = false, threeTrue = false, fourTrue = false, fiveTrue = false, sixTrue = false;
		
		if(oneCount >= 9600 && oneCount <= 10400) {
			oneTrue = true;
		}
		if(twoCount >= 9600 && twoCount <= 10400) {
			twoTrue = true;
		}
		if(threeCount >= 9600 && threeCount <= 10400) {
			threeTrue = true;
		}
		if(fourCount >= 9600 && fourCount <= 10400) {
			fourTrue = true;
		}
		if(fiveCount >= 9600 && fiveCount <= 10400) {
			fiveTrue = true;
		}
		if(sixCount >= 9600 && sixCount <= 10400) {
			sixTrue = true;
		}
		
		if(oneTrue == false || twoTrue == false || threeTrue == false || fourTrue == false || fiveTrue == false || sixTrue == false) {
			fail("Dice roll does not meet the requirements.");
		}
		
				
	}

}
