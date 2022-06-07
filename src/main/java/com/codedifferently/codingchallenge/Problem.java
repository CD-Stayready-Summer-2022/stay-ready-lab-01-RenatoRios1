package com.codedifferently.codingchallenge;

public class Problem {
    /* Problem 01
    XX marks the spot! Treasure hunters are on the lookout for anywhere that contains "xx".
    They want to know how many spots contain "xx" so they can know if they need to split up to reach all
    the spots before nightfall.

    The hunters need you to count the number of "xx" in the given locations. Overlapping is allowed, so
    "xxx" contains 2 "xx".

    Return the number of "xx".

    Example:
    doubleXX("abcxx") --> 1
    doubleXX("xxx") --> 2
    doubleXX("xxxx") --> 3
     */
    public static Integer doubleXX(String x) {

        //Iterate through the loop
            //Grab the character at the current index currentChar
            //if currentChar equals to x
                //Grab character at next index, nextChar
                //If nextChar is equal to currentChar
                //Then xxCount++
        int count = 0;
        char currentChar;
        char nextChar;

        for(int i = 0; i< x.length()-1; i++){
           currentChar = x.charAt(i);
           nextChar = x.charAt(i+1);
           if(currentChar == nextChar){
               count++;
           }
        }
        return count;
    }


    /* Problem 02
    A word explosion mystery has occurred. To figure out the mystery and how a word explodes into a reoccurring new one,
    you will only be provided an example with no context clues.

    A non-empty string such as "Code" is turned into "CCoCodCode".

    Return a new string similar to the string given above.

    Example:
    mysteryExplosion("Code") --> "CCoCodCode"
    mysteryExplosion("abc") --> "aababc"
    mysteryExplosion("ab") --> "aab"
     */
    public static String mysteryExplosion(String word) {
        int limit = word.length();
        String tempStr = "";
        for(int i = 0; i < limit+1; i++){
            tempStr += word.substring(0, i);
        }
        return tempStr;
    }


    /* Problem 03
    Were on a time crunch and were looking for teams of 9 players only. The top teams will be ranked within the top 4 spots.
    Only teams of 9 that are ranked within the top four are allowed to be taken into the next tournament.

    We need for you to evaluate the set of given teams and there team player amount, the array length may be less than 4.

    Return true if one of the top 4 teams in the array set has a team of 9 players.

    Example:
    topTeams([1, 2, 9, 3, 4]) --> true
    topTeams([1, 2, 3, 4, 9]) --> false
    topTeams([1, 2, 3, 4, 5]) --> false
     */
    public static Boolean topTeams(int[] team) {
        int count = 0;
        for(int i = 0; i < 4; i++){
            if(team[i] == 9){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }


    /* Problem 04
    X'tinction has come about for the letter 'x'. It's about that time to let all the x's go.
    There are two exceptions to removing an 'x':
        1st: an 'x' at the very start should not be removed
        2nd: an 'x' at the very end should not be removed

    Return a new "string" version where all the 'x' have been removed for good besides the 2 rules.

    Example:
    xtinction("xxHxix") --> "xHix"
    xtinction("abxxxcd") --> "abcd"
    xtinction("xabxxxcdx") --> "xabcdx"
     */
    public static String xtinction(String x) {
        String tempStr = "";
        tempStr += x.charAt(0); //always add the first letter
        for(int i = 1; i < x.length()-1; i++){
            if(x.charAt(i) != 'x'){
                tempStr += x.charAt(i);
            }
        }
        tempStr += x.charAt(x.length()-1);  //always add the last letter
        System.out.println(tempStr);
        return tempStr;
    }


    /* Problem 05
    Agent 66 has been on hide out for a couple of months now, due to a last assignment going wrong on his part.
    Agent 66 also goes by agent 67; we need you to be on the lookout to see if he returns within a group of other agents.

    A given array of "code" agent numbers will be given to you to evaluate. Doing the below task will allow us to know
    if he appears based off his number or other code name number being seen.

    Return the number of times that two 6's are next to each other, also count instances where the second "6" is actually a 7.

    Example:
    agent667([6, 6, 2]) --> 1
    agent667([6, 6, 2, 6]) --> 1
    agent667([6, 7, 2, 6]) --> 1
     */
    public static Integer agent667(int[] codes) {
        int count = 0;
        for(int i = 0; i < codes.length -1; i++){
            if(codes[i] == 6 && (codes[i+1] == 6 || codes[i+1] == 7)){
                count++;
            }
        }
        return count;
    }
}
