package leetcode;
// you need to buy and then sell stocks and return max profit
public class TimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] myPrices ={7,1,5,3,6,4};
        System.out.println(maxProfit(myPrices));

    }
    public static int maxProfit(int[] prices){
     // int  min = prices[0];
        int maxProfit =0;
      int min = Integer.MAX_VALUE;
       for(int value : prices ){
           if(value < min){
               min = value;
           }
         /*  int profit = value - min;
           if(maxProfit < profit ){
               maxProfit = profit;
           }*/
        maxProfit = Math.max(maxProfit,value - min);// this method works as 17-20 lines above
       }
     return maxProfit;
    }
    }
