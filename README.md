# Coding Questions for Eargo - Raymond Yeh

## Question 1
For this question, I assume we only need to return one combination of coins, as shown in the example. You can get the max number of coins that can make up a part of the total value by simply dividing the value
of the coin with the total value. You then update the new total value with the total value mod the value of the current coin. This updates
the total value to the value currently left. The algorithm takes O(logn) time and O(1) space.
The output is formatted as an int array in which the index of the array corresponds to a coin and the value at that index corresponds to the count of that coin. This array is formatted as
{quarters, dimes, nickels, pennies}. We can improve the algorithm to get all possible combinations of coins by using dynamic programming.

## Question 2
For this question, we only need to get the max profit based on the stock prices given if we can only buy and sell once throughout
the whole period. I record the current minimum value during each iteration. I also record the current profit at each iteration given the
minimum value and the current value. If the current profit is greater than the max profit, the corresponding minimum and maximum values
are the current max profit. This takes O(n) time and O(1) space. The algorithm can be improved to find the maximum profit if we are allowed to buy and sell
more than once.


### Installing

Download as a zip file or clone using the following command.

```
git clone https://github.com/yehray/EargoCodingQuestions.gitt
```

Run EargoCodingQuestions.java for outputs from the examples given.
Run Tests.java for more test cases. You will need JUnit to run the test cases.





