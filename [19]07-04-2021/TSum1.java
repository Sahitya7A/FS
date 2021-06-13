BCCI wants to select the group of bowlers for an upcoming test-series, you want
to choose the group with highest number of wickets, which is the sum of wickets
taken by all the bowlers in that group.

However, the bowler group is not allowed to have any disputes. 
A dispute exists if a younger bowler has strictly highest wickets than an older bowler. 
A dispute does not occur between bowlers of the same age.

You are given information of N bowlers as two lists, wickets and ages, 
where each wickets[i] and ages[i] represents the wickets and age of the i-th bowler, 
respectively, return the highest number of wickets of all possible bowler groups.

Input Format:
-------------
Line-1: An integer N, number of bowlers.
Line-2: N space separated integers, wickets[].
Line-3: N space separated integers, ages[].

Output Format:
--------------
An integer, highest number of wickets of all possible bowler groups.


Sample Input-1:
---------------
4
5 3 5 6
3 5 4 2

Sample Output-1:
----------------
10

Explanation:
------------
It is best to choose 2 bowlers of age 3 and 4. 


Sample Input-2:
---------------
5
5 3 5 6 3
2 5 4 2 1

Sample Output-2:
----------------
14

Explanation:
------------
It is best to choose 3 bowlers of age 1 and 2. 
Notice that you are allowed to choose multiple bowlers of the same age.

Sample Input-3:
---------------
5
1 3 5 10 15
1 2 3 4 5

Sample Output-3:
----------------
34

Explanation:
------------
You can choose all the bowlers.

write a program to read a sentence and find the sum of digits in each string if String contains 't' or 'T'.
if no digits are found print 0

the input string contains only numbers between 0-9



for example:
input =
Tw1nkl3 to1 add4
output =
Tw1nkl3(4)
to1(1)
add4(0)

input =
add me
output =
add(0)
me(0)


import java.util.*;
class TSum1
{
    private static ArrayList<String> a=new ArrayList<>();
    public static void setArray(String[] s)
    {for(String i:s){a.add(i);}}
    public static void printSum()
    {
        int sum=0;
        for(String i:a)
        {
            if(i.contains("t") || i.contains("T"))//if string has t in it perform sum
            {
                for(char j : i.toCharArray())
                {
                    if(Character.isDigit(j))//check if it is a numeric value
                    {
                        sum+=Integer.parseInt(j+"");
                    }
                }
                System.out.println(i+"("+sum+")");
                sum=0;
            }
            else
            {System.out.println(i+"(0)");}
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        /*for(String i:s)
        {System.out.println(i);}*/
        setArray(s);
        printSum();
        sc.close();
    }
}