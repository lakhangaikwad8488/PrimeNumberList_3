package test.java.yaksha;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

//import main.java.yaksha.PrimeNumbers;
//import main.java.yaksha.TestUtils;

import org.junit.jupiter.api.Test;

import main.java.yaksha.PrimeNumbers;
import main.java.yaksha.TestUtils;


class PrimeNumbersTest {

	@Test
	void testIsPrime() throws IOException {
		 //assertEquals(true, PrimeNumbers.isPrime(5));
		// assertEquals(false, PrimeNumbers.isPrime(8));
		 TestUtils.yakshaAssert(TestUtils.currentTest(),PrimeNumbers.isPrime(5)==true==true?"true":"false",TestUtils.businessTestFile);

			
	}
	@Test
	void testPrimeNumberList() throws IOException {
		//assertEquals(true, PrimeNumbers.primeNumberList(2,15));
		// assertEquals(false, PrimeNumbers.primeNumberList(8,5));
		 TestUtils.yakshaAssert(TestUtils.currentTest(),PrimeNumbers.primeNumberList(2,15)==true==true?"true":"false",TestUtils.businessTestFile);

		
	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);	             

	}

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);
	}

}
