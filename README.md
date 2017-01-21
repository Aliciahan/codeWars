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