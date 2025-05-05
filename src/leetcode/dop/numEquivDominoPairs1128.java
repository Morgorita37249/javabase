package leetcode.dop;

import java.util.HashMap;
import java.util.Map;

public class numEquivDominoPairs1128 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 1},
                {2, 2},
                {1, 1},
                {1, 2},
                {1, 2},
                {1, 1}
        };
        System.out.println(numEquivDominoPairs(array));
    }
    public static int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i=0; i < dominoes.length; i++) {
            String tmp = "";
            if (dominoes[i][0] < dominoes[i][1] || dominoes[i][0] == dominoes[i][1]){
                tmp = dominoes[i][0] + " " + dominoes[i][1];
            } else if (dominoes[i][0] > dominoes[i][1]){
                tmp = dominoes[i][1] + " " + dominoes[i][0];
            }
            if (hashMap.containsKey(tmp)){
                int count = hashMap.get(tmp)+1;
                hashMap.put(tmp, count);
            } else{
                hashMap.put(tmp, 1);
            }

        }
        int pairs = 0;
        for (String key : hashMap.keySet()){
            Integer value = hashMap.get(key);
            while( value >0) {
                value--;
                pairs += value;
            }
        }
        return pairs;
    }
    public static int numEquivDominoPairs1(int[][] dominoes) {
        int[] num = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1]
                    ? domino[0] * 10 + domino[1]
                    : domino[1] * 10 + domino[0];
            ret += num[val];
            num[val]++;
        }
        return ret;
    }
    public int numEquivDominoPairs2(int[][] dominoes) {
        int[] mpp = new int[100];
        for (int[] d : dominoes)
            if (d[0] > d[1]) mpp[d[0] * 10 + d[1]]++;
            else mpp[d[1] * 10 + d[0]]++;

        int count = 0;
        for (int freq : mpp)
            count += (freq - 1) * freq / 2;

        return count;
    }
}
