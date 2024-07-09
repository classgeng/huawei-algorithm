package com.huawei.algorithm;

/**
 * 字符串操作
 */
public class StringOperate {

    public static void main(String[] args) {
       /* String S = "aec";
        String L = "abghcde";
        System.out.println(isCheck(S,L));*/

        String s = "asdfodsfgsdgodsfsdfosdfogdggsgo";
        System.out.println(longestEvenLengthSubstring(s));
    }

    /**
     * 输入两个字符串S和L，都只包含英文小写字母。S长度<=100，L长度<=500,000。判定S是否是L的有效字串。
     *
     * 判定规则：S中的每个字符在L中都能找到（可以不连续），且S在Ｌ中字符的前后顺序与S中顺序要保持一致。
     * （例如，S="ace"是L="abcde"的一个子序列且有效字符是a、c、e，而"aec"不是有效子序列，且有效字符只有a、e）
     * @param S
     * @param L
     * @return
     */
    public static boolean isCheck(String S, String L){
        if(S.length() > 100 || L.length() > 500000){
            return false;
        }
        int index = 0;
        for (int i=0; i<S.length(); i++){
            String str = String.valueOf(S.charAt(i));
            int currIndex = L.indexOf(str);
            if(currIndex < index){
                return false;
            }
            index = currIndex;
        }
        return true;
    }

    /**
     * 给你一个字符串 s，字符串s首尾相连成一个环形 ，请你在环中找出 'o' 字符出现了偶数次最长子字符串的长度。
     * @param s
     * @return
     */
    public static int longestEvenLengthSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int count = 0;
        int index = 0;
        for (int i=0; i<n; i++){
            char cc = s.charAt(i);
            if(cc == 'o'){

            }
        }

        return maxLength;
    }

}
