package com.bridgelabz.coinchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CoinChangeTest {

	/*
	 * @Test public void minCoin0() { assertEquals(0, CoinChange.minCoin(0, new
	 * int[] { 1, 5, 7 })); }
	 * 
	 * @Test public void minCoin1() { assertEquals(1, CoinChange.minCoin(1, new
	 * int[] { 1, 5, 7 })); }
	 */

	/*
	 * @Test public void minCoin2() { assertEquals(2, CoinChange.minCoin(2, new
	 * int[] { 1, 5, 7 })); }
	 */

	/*
	 * @Test public void minCoin4() { assertEquals(4, CoinChange.minCoin(4, new
	 * int[] { 1, 5, 7 })); }
	 */

	@Test
	public void minCoin5() {
//		int amount = 51;
//		int expectedOp = 9;
		int amount = 6;
		int expectedOp = 2;
		int ds[] = new int[amount + 1];
		Arrays.fill(ds, -1);
		assertEquals(expectedOp, CoinChange.minCoin(amount, new int[] { 1, 5, 7 }, ds));
	}
}
