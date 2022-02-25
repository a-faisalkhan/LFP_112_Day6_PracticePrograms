package com.bridgelabz.coinchange;

public class CoinChange {
	
	public int minCoin(int amount, int [] coins) {
		if (amount == 0) {
			return 0; 
		
		} else {
			//int subAns = 0;
			int ans = Integer.MAX_VALUE; 
			int subAns = 0; 
			for (int i = 0; i < coins.length; i++) {
				if (amount - coins [i] >= 0 && subAns < ans) {
					subAns = minCoin(amount - coins[i], coins); //minCoins (1, {1,5,7}); 
					ans = subAns + 1; 
				}
			}
			//int ans = subAns + 1; 
			
			return ans; 
		}
		
	}

}
