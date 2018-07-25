public class EargoCodingQuestions {
    public static void main(String args[]){
        System.out.println("Question 1");
        printArr(findChange(83));
        System.out.println("Question 2");
        int[] stocks = {3, 8, 8, 55, 38, 1, 7, 42, 54, 53};
        buyStock(stocks);
    }

//    Code for question 1
    public static int[] findChange(int totalCents){
        int[] coinVals = {25, 10, 5, 1};
        int[] result = new int[4];
        int i = 0;
        while(totalCents != 0){
            result[i] = totalCents/coinVals[i];
            totalCents = totalCents%coinVals[i];
            i+=1;
        }
        return result;
    }

//    Code for question 2
    public static void buyStock(int[] stocks){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0; i < stocks.length; i++){
            if(stocks[i] < min){
                min = stocks[i];
                minIndex = i;
            }
            if(stocks[i] - stocks[minIndex] > maxProfit){
                maxIndex = i;
                maxProfit = stocks[i] - stocks[minIndex];
            }
        }
        System.out.println("Buy on day: " + (minIndex+1) + "\n" + "Sell on day: " + (maxIndex+1) + "\n" + "For a profit of: " + maxProfit);
    }


    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
