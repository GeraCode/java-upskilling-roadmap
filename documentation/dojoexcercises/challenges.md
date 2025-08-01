## dojo-challenge-geracode

``` Contains the dojo challenges```

### Dojo challenge
- Challenge
    * <b>RainwaterFlow</b>
        * RainwaterFlow , write code to determine if rainwater would flow into the ocean when it rains at a given xy coordinate.
    * <b>MaximumSubArray</b>
        * Given an integer array nums, find the contiguous subarray with the largest sum, and return its sum.
    * <b>PermutationsII</b>
        *  Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
    * <b>ValidSudoku</b>
        * Determine if a 9 x 9 Sudoku board is valid
    * <b>4Sum</b>
        * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]]
    * <b>Letter Combinations of a Phone Number</b>
        * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
    * <b>Jump Game</b>
        * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
        * Return true if you can reach the last index, or false otherwise.
    * <b>Longest Consecutive Sequence Test</b>
        * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
        * You must write an algorithm that runs in O(n) time.
    * <b>Search in Rotated Sorted Array</b>
        * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
        *  You must write an algorithm with O(log n) runtime complexity
    * <b>Rotate Array</b>
    * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative
    * <b>Add Two Numbers Class</b>
        * You are given two non-empty linked lists representing two non-negative integers.
        * The digits are stored in reverse order, and each of their nodes contains a single digit.
        * Add the two numbers and return the sum as a linked list.
        * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
        * Definition for singly-linked list.
       ``` 
        function ListNode(val, next) {
           this.val = (val===undefined ? 0 : val)
           this.next = (next===undefined ? null : next)
        }
      ```

    * <b>Two-Sum-II-Data-Structure-design</b>
        * Design and implement a TwoSum class. This class should support the following operations:
            * add:
                * Adds the number to an internal data structure.
            * find:
                * Finds if there exists a pair of numbers whose sum is equal to the given value.
        * Please note that your return answers (both index1 and index2) are not zero-based.

      ``` 
         Example:
         add function
         Input: The numbers that will be enter into the data structure.
        
         find function
         Starting from the array created in the previous function, which is as follows: [2,7,11,15]
         
         Input: target = 9
         Output: index1=1, index2=2
      ```
    * <b>Three Sum</b>
        * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
        * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    * <b>Set Matrix Zeroes</b>
      ```
        Given a array of ones and zeros and a target position within the matrix, 
        you need to verify whether there is at least one zero in the row where 
        the target islocated. 
        If this condition is met, you should transform that entire row into zeros.
        Following this, if the column corresponding to the first position in the
        row where the target is located containsat least one zero, 
        you should mark the entire column with zeros.
      ```
    * <b>Multiply Using Recursivity without multiply operator</b>
        * Given two integers, use a recursive function to multiply them without using the multiplication operator.
        * Integers can be positive or negative or zeros.
       ```
       Result Examples
         Multiply(4,5) ->  20
         Multiply(-4,5) ->  -20
         Multiply(4,-5) ->  -20
         Multiply(-4,-5) ->  20
         Multiply(1,5) ->  5
         Multiply(0,5) ->  0
      ```
    * <b>Pascal’s Triangle</b>
        * Given numRows, generate the first numRows of Pascal’s triangle. For example, given numRows = 5, the result should be:
      ```
        Example 1:
         Input: nRows= 5
         Output: 				
         [
             [1],
            [1,1],
           [1,2,1],						
          [1,3,3,1],
         [1,4,6,4,1]
         ]
  
      ```

    * <b>Verify Number With Operations</b>
      ```
        Description:
  
        Given a list of numbers and a target number, write a program to determine whether
        the target number can be calculated by applying "+-*/" operations to the number
        list? You can assume () is automatically added when necessary.
    
        Example 1:
        Input: list = [1,2,3,4] target = 21
        Output: true
        Explanation= (1+2)(3+4)=21
    
        Example 2:
        Input: list = [4,3,2,5] target = 33
        Output: true
        Explanation= 3+5(2+4)=33
    
        Example 3:
        Input: list = [3,4,2] target = 5
        Output: false
        Explanation= There are no operations that achieve the result
       ```
    * <b>Count And Say </b>
       ```
         The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
        
         countAndSay(1) = "1"
         countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a
         different digit string. To determine how you "say" a digit string, split it into the minimal number of substrings such
         that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then
         say the digit. Finally, concatenate every said digit.
        
         For example:
           the saying and conversion for digit string "3322251":
           Given a positive integer n
           return the nth term of the count-and-say sequence.
       ```
    * <b>Print Numbers With No Loops</b>
        * Create a code that prints all numbers in a range without the use of any loop (for, foreach, while, do, etc)
      ```
         Input example:
         PrintNumbersWithNoLoops(0, 10)
         Output:
         0,1,2,3,4,5,6,7,8,9,10
      ```

    * <b>Minimum Window Substring</b>
        * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
      ```
        Example 1:
           Input: S = "ADOBECODEBANC", T = "ABC"
           Output:  "BANC"
      
        Example 2:
           Input: S = "MARCHMONDAYCARRIED", T = "AHC"
           Output:  "ARCH"
      
        Example 3:
           Input: S = "HOUSEMARRIEDCUSTOM", T = "IEMD"
           Output:  "MARRIED"
      
        Example 4:
           Input: S = "EFGHABCIO", T = "ABC"
           Output:  "ABC"
      ```


* <b>Ugly number</b>
    ```
      An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
      Given an integer n, return the nth ugly number.
      
      Example 1:
      Input: n = 10
      Output: 12
      Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
      
      Example 2:
      Input: n = 1
      Output: 1
      Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

    ```

    * <b>Triangle</b>
    ```
      public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.isEmpty() ){
           return 0;
        }
        for (int i = triangle.size() - 2; i >= 0; i--) {
            System.out.println("\n\n");

            System.out.println("#########################################");
            System.out.println("########### i= "+i+"#####################");
            System.out.println("#########################################");

            for (int j = 0; j <= i; j++) {
                System.out.println("******* j= "+j+"******");

                System.out.println("indice de la lista siguiente = "+ (i + 1));
                System.out.println("lista siguiente en j="+triangle.get(i + 1).get(j));
                System.out.println("lista siguiente en j+1="+triangle.get(i + 1).get(j + 1) );
                int minByRow = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));

                int sumMinByRowAndActualValorRow = triangle.get(i).get(j) + minByRow;
                System.out.println("minimo lista siguiente  ="+minByRow);
                System.out.println("actual triangle.get(i).get(j) ="+triangle.get(i).get(j));

                System.out.println("suma de minimo lista siguiente  y actual ="+sumMinByRowAndActualValorRow);

                triangle.get(i).set(j, sumMinByRowAndActualValorRow);
            }
        }
        return triangle.get(0).get(0);
    }

    ```
    * <b>Minimum Size SubArray Sum</b>
    ```
        Challenge name: minimum-size-subarray-sum
        Description:
        Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn’t one, return [0] instead.
        
        Example 1:
        Input: array= [2,3,1,2,4,3]  s=7
        Output:  [4,3]
        
        Example 2:
        Input: array= [2,6,5,6,7,9,10]  s=22
        Output:  [5,7,10]
        
        Example 3:
        Input: array= [1,2,3,4,5]  s=16
        Output:  [0]
    ```

    * <b>Remove Duplicates from Sorted Array</b>
    ```
      Challenge name: remove-duplicates-from-sorted-array
      Description:
      Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. Do not allocate extra space for another array, you must do this in place with constant memory.
      
      Example 1:
      Input: A = [-1, 0, 1, 2, -1, -4]
      Output:  	length = 5, and A is now [-4,-1,0,1,2].
      
      
      Example 2:
      Input: S = [10,15,18,15,22]
      Output:  	length = 4, and S is now [10,15,18,22].
    ```

    * <b> Min Stack</b>
    ```
      Challenge name: Min Stack
      Description:
      Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.push(x) 
        – Push element x onto stack. pop() 
        – Removes the element on top of the stack. top() 
        – Get the top element. getMin() 
        – Retrieve the minimum element in the stack. 
         
      Here's a valuable tip:
      
      Research how the stack process works in your technology and try to replicate it, 
      forming your own data structure and everything that entails this process.
    ```

    * <b>Merge Intervals</b>
    ```
     Challenge name: merge-intervals
        Description:
        Given a collection of intervals, merge all overlapping intervals.
        
        Example 1:
        Input: [1,3],[2,6],[8,10],[15,18]
        
        Output: [1,6],[8,10],[15,18]
        
        Example 2:
        Input: [1,3],[4,10],[6,12][11,18]
        Output:  [1,3],[4,18]
    ``` 
    * <b>reverse-linked-list</b>

    ```
      Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their order is reversed. 
      The head pointer given may be null meaning that the initial list is empty.
      
      Example
      Input: head references the list 1->2->3->4->5->null
      manipulate the next pointer of each node in place and return head
      Output: 5->4->3->2->1->null

    ```

    * <b>Find Winner on a Tic Tac Toe Game</b>
    ```
    Challenge name: Find Winner on a Tic Tac Toe Game
    Description: Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
    
    In this Tic-Tac-Toe challenge, you are given a 3 x 3 grid representing the game board. Two players, A and B, take turns placing their respective characters ('X' and 'O') into empty squares of the grid. The game continues until there are three of the same characters in a row, column, or diagonal, resulting in a win for the player with the matching characters. If all squares are filled without any player achieving a winning combination, the game ends in a draw. Additionally, if there are still empty squares on the grid and no winner has been determined, the game is considered to be ongoing (pending).
    You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and A will play first.
    
    Your task is to implement a function/method that takes the 3 x 3 array as input and returns the winner of the game (A or B) if there is one, or "Draw" if the game ends in a draw, or "Pending" if the game is still ongoing.
    Your implementation should also include the necessary unit test cases to verify the correctness of your solution.

    Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
    Output: "A"
    Explanation: A wins, they always play first.


    Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
    Output: "B"
    Explanation: B wins.
  
    Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
    Output: "Draw"
    Explanation: The game ends in a draw since there are no moves to make.
  
    ```

#### GITHUB repository:
https://github.com/GeraCode/java-upskilling-roadmap
### Usage
**Clone or Download Your Project**:
Example:
```
git clone existing_repo
cd existing_repo
git branch featureBranch ->from the main
git push
```

Ensure that you have your project source code and `pom.xml` file in the same directory as your compose files.
```sh
cd ~/dojo-challenge-gerardo-salvador/
mvn clean install
```

### Help for Edit the README file
When you're ready to  edit this file you can support it with [makeareadme.com](https://www.makeareadme.com/)