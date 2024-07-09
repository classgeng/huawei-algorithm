package com.huawei.algorithm;

/**
 * 二分查找
 *
 *孙悟空爱吃蟠桃，有一天趁着蟠桃园守卫不在来偷吃。已知蟠桃园有N颗桃树，每颗树上都有桃子，守卫将在H小时后回来。
 *
 * 孙悟空可以决定他吃蟠桃的速度K（个/小时），每个小时选一颗桃树，并从树上吃掉K个，如果树上的桃子少于K个，则全部吃掉，并且这一小时剩余的时间里不再吃桃。
 *
 * 孙悟空喜欢慢慢吃，但又想在守卫回来前吃完桃子。
 *
 * 请返回孙悟空可以在H小时内吃掉所有桃子的最小速度K（K为整数）。如果以任何速度都吃不完所有桃子，则返回0。
 */
public class MinSelect {

    public static void main(String[] args) {
        int[] peaches = {2,3,6,7};
        int h = 4;
        System.out.println(minSpeedK(peaches, h));

    }


    /**
     * 最小速度
     * @param peaches
     * @param h
     * @return
     */
    public static int minSpeedK(int[] peaches, int h){
        if(peaches == null || peaches.length > h){
            return 0;
        }
        int leftK = 1, rightK = 1000000000;
        while (leftK <= rightK){
            int midK = (leftK + rightK) / 2;
            if(eatPeaches(peaches, midK, h)){
                rightK = midK - 1;
            } else {
                leftK = midK + 1;
            }
        }
        return leftK;
    }


    /**
     * 以速度k能否吃完全部桃子
     * @param peaches
     * @param k 吃桃速度
     * @param h 守卫h小时后回来
     * @return
     */
    public static boolean eatPeaches(int[] peaches, int k, int h){
        int time = 0;
        for (int i = 0; i < peaches.length; i++){
            int t1 = peaches[i] / k;
            int t2 = peaches[i] % k > 0 ? 1 : 0;
            time += t1 + t2;
            if (time > h){
                return false;
            }
        }
        return true;
    }

}
