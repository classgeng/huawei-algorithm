package com.huawei.algorithm;


import java.util.*;

/**
 * 实现一个简易的重复内容识别系统，通过给定的两个内容名称，和相似内容符号，判断两个内容是否相似；如果相似，返回相似的内容；如果不相似，返回不相似的内容
 *
 * 初始化：给出两个字符串，一些相似字符对，如顿号和逗号相似，的和de相似，猪和潴，给出两个字符串的相似判断结果
 * 输入：两条语句，给出是否相似，对于相似的语句，返回True和相似的字符对；对于不相似的内容，则返回第一个内容的不相似信息，方便后续补充
 *
 *  注意：
 * 1、相似关系是 具有 传递性的。例如，如果 "顿号" 和 "逗号" 是相似的，"逗号" 和 "分号" 是相似的，则 "顿号" 和 "逗号" 是相似的。
 * 2、为了过滤一些无意义的信息，这里***可以匹配任意长度的内容，
 * 例如：给出相似对 "(***)",""时，'异世邪君（人气玄幻作家）'和'异世邪君' 认为是相似，此时相似符号返回 *** 即可
 * 3、不相似的内容，需要给出不相似的字符串，多处不相似的字符串用空格分隔
 */
public class SimilarContentChecker {

    public static final String PATTERN_STR = "(***)";

    public static void main(String[] args) {
        // 读取输入
        String str1 = "幸福de猪的个人专辑";
        String str2 = "幸福的猪的个人专辑";
        String str3 = "的 de";

        if(PATTERN_STR.equals(str3)){
            System.out.println("True");
            System.out.println(PATTERN_STR);
            return;
        }

        //Map<String,String> result = new HashMap<>();
        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();

        String[] similarPairs = str3.split(" ");
        // 构建并查集
        for (int i = 0; i < similarPairs.length - 1; i++) {
            if(str1.contains(similarPairs[i])){
                result1.add(similarPairs[i]);
            }
            if(str2.contains(similarPairs[i])){
                result2.add(similarPairs[i]);
            }
        }
        if(result1.size() == result2.size()){
            System.out.println("true");
            System.out.println(result1 + " " + result2);
        }else{
            System.out.println("false");
            System.out.println(result1 + " " + result2);
        }


    }

}
