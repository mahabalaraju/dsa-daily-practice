package arrays;

public class BuyAndSell {

	public static void main(String[] args) {
		int a[] = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(a));
	}
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minPrice)
				minPrice = prices[i];

				if(prices[i]- minPrice> maxProfit) {
					maxProfit = prices[i]-minPrice;
				}
		}
		return maxProfit;
	}
}


/*
                     minPrice maxProfit
0    7          7-7   7           0
1    1          1-1   1           0
2    5          5-1   1           4    
3    3          3-1   1           2
4    6          6-1   1           5
5    4          4-1   1           3

*/