package leet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
数字组合变字母组合的问题
可以用定长的字符数组替换掉这里的LinkedList，因为最终长度是可以计算出来的
这样会提高一些效率
 */
public class LetterCombinations {
    private static Map<Character, String> buttonMap = new HashMap<>();
    static {
        buttonMap.put('1', "1");
        buttonMap.put('2', "abc");
        buttonMap.put('3', "def");
        buttonMap.put('4', "ghi");
        buttonMap.put('5', "jkl");
        buttonMap.put('6', "mno");
        buttonMap.put('7', "pqrs");
        buttonMap.put('8', "tuv");
        buttonMap.put('9', "wxyz");
        buttonMap.put('0', " ");

    }
    public List<String> letterCombinations(String digits) {
        List<List<Character>> result = new LinkedList<>();
        for (int i = 0; i < digits.length(); ++i) {
            String values = buttonMap.get(digits.charAt(i));
            if (result.size() == 0) {
                for (int j = 0; j < values.length(); ++j) {
                    List<Character> characters = new LinkedList<>();
                    characters.add(values.charAt(j));
                    result.add(characters);
                }
            } else {
                List<List<Character>> currentResult = new LinkedList<>();
                for (int j = 0; j < values.length(); ++j) {
                    for (int k = 0; k < result.size(); ++k) {
                        List<Character> characters = new LinkedList<>();
                        characters.addAll(result.get(k));
                        characters.add(values.charAt(j));
                        currentResult.add(characters);
                    }
                }
                result.clear();
                result.addAll(currentResult);
            }
        }
        List<String> allWords = new LinkedList<>();
        for (List<Character> characters : result) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Character character : characters) {
                stringBuilder.append(character);
            }
            allWords.add(stringBuilder.toString());
        }
        return allWords;
    }
}
