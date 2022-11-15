package JunitTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class Tests {
	

	private int[] numeros= new int[50];
	
	LinkedList<Integer> numberlist;
//	private ArrayList<String> Numeros = new ArrayList<String>(); // Create an ArrayList object
//	
//	
//	@Test
//	public void divisibilidadDeCadaNumero_siendo3() {
//		for(int i=0;i<50;i++) {
//			numeros[i]=(int) (Math.random());
//		}
//		for(int numero : numeros) {
//			assertEquals(numero%3, 0);
//		}
//		}
//	@Test
//	public void divisibilidadDeCadaNumero_siendo5() {
//		for(int i=0;i<50;i++) {
//			numeros[i]=(int) (Math.random());
//		}
//		for(int numero : numeros) {
//			assertEquals(numero%5, 0);
//			}
//		}

	   
	    @Before
	    public void setup() {
	        numberlist = new LinkedList<Integer>();
	        for (int i= 1; i< 51; i++)
	            numberlist.add(i);
	    }
	   
	    @Test
	    public void testIsDivisibleBy3_returnsamount() {
	        //There are 16 divisible numbers by 3 in total
	        int byThree = 16;
	        int byFiveToo = 3;
	        int count = 0;
	        for (int i : numberlist)
	            if ((i % 3 == 0) && !(i % 5 == 0))
	                count++;
	        assertEquals(byThree-byFiveToo, count);
	    }
	    @Test
	    public void testIsDivisibleBy5_returnsamount() {
	        //There are 10 divisible numbers by 5 in total
	        int byFive = 10;
	        int byThreeToo = 3;
	        int count = 0;
	        for (int i : numberlist)
	            if ((i % 5 == 0) && !(i % 3 == 0))
	                count++;
	        assertEquals(byFive-byThreeToo, count);
	    }



}



