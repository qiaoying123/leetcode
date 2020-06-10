package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-08 19:33
 */
public class GrayCode_89 {

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>() {{add(0);}};
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size() -1; j >= 0 ; j--) {
                res.add(head + res.get(j));
            }
            head <<= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        GrayCode_89 g = new GrayCode_89();
        System.out.println(g.grayCode(n));
    }
}
