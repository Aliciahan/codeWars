#Problems solved @Codewars

## Q1 Square Problem

**Description**: How to detect n is formed by x*x 


## Q2 Don't give me five!

In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. The start and the end number are both inclusive!

**Examples:**

	1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
	4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12

*The result may contain fives. ;-)
The start number will always be smaller than the end number. Both numbers can be also negative!*

I'm very curious for your solutions and the way you solve it. Maybe someone of you will find an easy pure mathematics solution.

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!

## Q3 Breaking Chocolate problem

Your task is to split the chocolate bar of given dimension n x m into small squares. Each square is of size 1x1 and unbreakable. Implement a function that will return minimum number of breaks needed.

For example if you are given a chocolate bar of size 2 x 1 you can split it to single squares in just one break, but for size 3 x 1 you must do two breaks.

If input data is invalid you should return 0 (as in no breaks are needed if we do not have any chocolate to split). Input will always be a non-negative integer.

## Q4 Are they the "same"

Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

**Examples**

Valid arrays

~~~java
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]

~~~

comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

~~~java
a = [121, 144, 19, 161, 19, 144, 19, 11] 
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
Invalid arrays
~~~

If we change the first number to something else, comp may not return true anymore:

~~~java
	a = [121, 144, 19, 161, 19, 144, 19, 11]  
	b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
~~~
comp(a,b) returns false because in b 132 is not the square of any number of a.

~~~java
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]

~~~

comp(a,b) returns false because in b 36100 is not the square of any number of a.

**Remarks**

a or b might be [] (all languages). a or b might be nil or null or None (except in Haskell, Elixir, C++).

If a or b are nil (or null or None), the problem doesn't make sense so return false.

If a or b are empty the result is evident by itself.

**Note for C**

The two arrays have the same size (> 0) given as parameter in function comp.

##Q5 Count the Digit

Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. Square all numbers k (0 <= k <= n) between 0 and n. Count the numbers of digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.

Examples:

	n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100

We are using the digit **1 in 1, 16, 81, 100.** The total count is then 4.

nb_dig(25, 1):
the numbers of interest are
1, 4, 9, 10, 11, 12, 13, 14, 19, 21 which squared are 1, 16, 81, 100, 121, 144, 169, 196, 361, 441
so there are 11 digits `1` for the squares of numbers between 0 and 25.

*Note that 121 has twice the digit 1.*


##Q6 Sum of odd Numbers

Given the triangle of consecutive odd numbers:

~~~
             1
          3     5
       7     9    11
    13    15    17    19
 21    23    25    27    29
...
~~~

Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

~~~java
rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
~~~

## Q7 Sum Consecutive

You are given a list/array which contains only integers (positive and negative). Your job is to sum only the numbers that are the same and consecutive. The result should be one list.

Extra credit if you solve it in one line. You can asume there is never an empty list/array and there will always be an integer.

Same meaning: 1 == 1

1 != -1

**Examples**:

~~~java 
[1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]

"""So as you can see sum of consecutives 1 is 1 
sum of 3 consecutives 4 is 12 
sum of 0... and sum of 2 
consecutives 3 is 6 ..."""

[1,1,7,7,3] # should return [2,14,3]
[-5,-5,7,7,12,0] # should return [-10,14,12,0]
~~~


## Q8 

A man has a rather old car being worth **$2000**. He saw a secondhand car being worth **$8000**. He wants to keep his old car until he can buy the secondhand one.

He thinks he can save $1000 each month but the prices of his old car and of the new one **decrease of 1.5 percent per month**. Furthermore the percent of loss increases by a fixed **0.5 percent** at the end of every two months.

Example of percents lost per month:

If, for example, at the end of first month the percent of loss is 1, end of second month percent of loss is 1.5, end of third month still 1.5, end of 4th month 2 and so on ...

Can you help him? Our man finds it difficult to make all these calculations.

How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?

Parameters and return of function:

~~~java 
parameter (positive int, guaranteed) startPriceOld (Old car price)
parameter (positive int, guaranteed) startPriceNew (New car price)
parameter (positive int, guaranteed) savingperMonth 
parameter (positive float or int, guaranteed) percentLossByMonth
~~~

nbMonths(2000, 8000, 1000, 1.5) should return [6, 766]
where 6 is the number of months at the end of which he can buy the new car and 766 is the nearest integer to '766.158...' .

*Note: Selling, buying and saving are normally done at end of month. Calculations are processed at the end of each considered month but if, by chance from the start, the value of the old car is bigger than the value of the new one or equal there is no saving to be made, no need to wait so he can at the beginning of the month buy the new car:*

~~~java
nbMonths(12000, 8000, 1000, 1.5) should return { 0, 4000 }
nbMonths(8000, 8000, 1000, 1.5) should return { 0, 0 }
~~~

We don't take care of a deposit of savings in a bank:-)


## Q09 Common Denominators
Common denominators

You will have a list of rationals in the form

 { {numer_1, denom_1} , ... {numer_n, denom_n} }
or

 [ [numer_1, denom_1] , ... [numer_n, denom_n] ]
or

 [ (numer_1, denom_1) , ... (numer_n, denom_n) ]
where all numbers are positive ints.

You have to produce a result in the form

 (N_1, D) ... (N_n, D)
or

 [ [N_1, D] ... [N_n, D] ]
or

 [ (N_1', D) , ... (N_n, D) ]
or

{{N_1, D} ... {N_n, D}}
depending on the language (See Example tests)

in which D is as small as possible and

 N_1/D == numer_1/denom_1 ... N_n/D == numer_n,/denom_n.
Example:

convertFracs [(1, 2), (1, 3), (1, 4)] `shouldBe` [(6, 12), (4, 12), (3, 12)]
FUNDAMENTALSALGORITHMSMATHEMATICSNUMBERS

## Q010 Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

~~~java

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

~~~
