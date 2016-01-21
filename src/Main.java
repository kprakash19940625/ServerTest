import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void test1() {
		GenerateRandom test = new GenerateRandom();
		int output = test.generate();
		assertEquals(25,output);
	}
	@Test
	public void test2(){
		GenerateRandom test = new GenerateRandom();
		int output = test.generate();
		assertEquals(36,output);
	}
	@Test
	public void test3(){
		GenerateRandom test = new GenerateRandom();
		int output = test.generate();
		assertEquals(49,output);
	}

}
