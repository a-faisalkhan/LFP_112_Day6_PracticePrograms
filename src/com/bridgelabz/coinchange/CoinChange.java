package com.bridgelabz.coinchange;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String[] args) {

		int[] currency = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		//int amount = 219;
	    int amount = 550; 	

		int[] ds = new int[amount + 1];

		Arrays.fill(ds, -1);

		int minChange = minCoin(amount, currency, ds);
		System.out.println("Min change required : " + minChange);
	}

	public static int minCoin(int amount, int[] coins, int[] ds) {
		if (amount == 0) {
			return 0;
		} else {
			int ans = Integer.MAX_VALUE;

			for (int i = 0; i < coins.length; i++) {
				int subAns = 0;
				if (amount - coins[i] >= 0) {
					if (ds[amount - coins[i]] != -1) {
						subAns = ds[amount - coins[i]];
					} else {
						subAns = minCoin(amount - coins[i], coins, ds); // minCoin(1,{1,5,7});
					}
					if (ans > subAns) {
						ans = subAns + 1;
					}
				}
			}
			ds[amount] = ans;
			return ans;
		}
		
	}

}
