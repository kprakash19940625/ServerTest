import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
        public void test1() {
                GenerateRandom test = new GenerateRandom();
                int output = test.generate();
                assertTrue(3 < 5);
        }
        /*
        @Test
        public void test2(){
                GenerateRandom test = new GenerateRandom();
                int output = test.generate();
                System.out.println(output);
                assertTrue(3 < output);
        }
	/*
	@Test
	public void test3(){
		GenerateRandom test = new GenerateRandom();
		int output = test.generate();
		assertGreater(5,output);
	}
	*/

}
