package leetcode2020;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coderjoin
 * @date 2020-05-30 21:02
 */
public class WordPattern_290 {


    public static boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" "); //以空格分隔str
        if(s.length != pattern.length()) return false; //如果没有全部成对的映射则返回false
        Map<Character, String> map = new HashMap<>(); //存放映射
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){ //1. 没有映射时执行
                if(map.containsValue(s[i])) return false; //2. 没有映射的情况下s[i]已被使用，则不匹配返回false
                map.put(pattern.charAt(i), s[i]); //3. 构建映射
            }else{
                if(!map.get(pattern.charAt(i)).equals(s[i])) return false; //当前字符串与映射不匹配,返回false
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern,str));
    }
}
