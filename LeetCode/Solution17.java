//Google Question 17: Letter Combinations of a Phone Number

import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        String digits = "23";
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println(combinations); // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        backtrack(result, mapping, digits, 0, new StringBuilder());
        return result;
    }
    private void backtrack(List<String> result, String[] mapping, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, mapping, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
