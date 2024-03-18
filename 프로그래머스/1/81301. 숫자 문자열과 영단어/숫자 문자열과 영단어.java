import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int solution(String s) {
        char[] charArr = s.toCharArray();
        ArrayList<Integer> numList = new ArrayList<>();
        
        for (int i=0; i<charArr.length; i++) {
            StringBuffer bf = new StringBuffer(); 
            
            if (charArr[i] >= '0' && charArr[i] <= '9') {
                numList.add(charArr[i]-'0');
            } else {
                for (int j=0; j<charArr.length-i; j++) {
                    bf.append(charArr[i+j]);
                    switch (bf.toString()) {
                        case "zero":
                            numList.add(0);
                            break;
                        case "one":
                            numList.add(1);
                            break;
                        case "two":
                            numList.add(2);
                            break;
                        case "three":
                            numList.add(3);
                            break;
                        case "four":
                            numList.add(4);
                            break;
                        case "five":
                            numList.add(5);
                            break;
                        case "six":
                            numList.add(6);
                            break;
                        case "seven":
                            numList.add(7);
                            break;
                        case "eight":
                            numList.add(8);
                            break;
                        case "nine":
                            numList.add(9);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        
        int answer = Integer.parseInt(numList.toString().replaceAll("[^0-9]",""));
        return answer;
    }
}