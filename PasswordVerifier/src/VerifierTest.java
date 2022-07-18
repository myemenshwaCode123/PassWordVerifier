import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerifierTest {

	@Test 
	void testPasswordVerifier() {
		assertEquals(false, Verifier.isValid1("weiofhjhwfow2123"));      
	}
	
	@Test 
	void testPasswordVerifier2() {
		assertEquals(true, Verifier.isValid1("weoih238T"));      
	}
	
	@Test 
	void testPasswordVerifier3() {
		assertEquals(false, Verifier.isValid1("sdb2T"));      
	}
	
	@Test 
	void testPasswordVerifier4() {
		assertEquals(false, Verifier.isValid1("sdgfgbbeifuw"));      
	}
	
	@Test 
	void testPasswordVerifier5() {
		assertEquals(false, Verifier.isValid1("WEFHWIEHWWIUE234234"));      
	}
	
	@Test 
	void testPasswordVerifier6() {
		assertEquals(true, Verifier.isValid1("runMan123"));      
	}
	
	@Test 
	void testPasswordVerifier7() {
		assertEquals(true, Verifier.isValid1("blangFortyFour02398"));      
	}
	
	@Test 
	void testPasswordVerifier8() {
		assertEquals(false, Verifier.isValid1("fudgeManWoman"));      
	}
	
	@Test 
	void testPasswordVerifier9() {
		assertEquals(true, Verifier.isValid1("NarutoOnep12"));      
	}
	
	@Test 
	void testPasswordVerifier10() {
		assertEquals(true, Verifier.isValid1("49445erherhFOF"));      
	}
	
	@Test 
	void testPasswordVerifier11() {
		assertEquals(false, Verifier.isValid1("uhfiuw23b4b42b3bkjb242bih4b2bl23b4i23ub42ob4uo2b"));      
	}
	
	@Test 
	void testPasswordVerifier12() {
		assertEquals(true, Verifier.isValid1("HopeThisGets100"));      
	}

}
