package algorithm.binarysystem;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 11:50
 **/
public class BinarySystem {

    //10 2 5 0
    //5 2 2 1
    //2 2 1 0
    //1     1
    public String res(int num) {
        StringBuffer sb = new StringBuffer();
        int res = num;
        if (num == 0 && num == 1){
            return String.valueOf(num);
        }
        int n = num;
        do {
            n = n / 2;
            sb.append(n % 2);
        }while (n > 1);
        sb.append(n);
        return sb.toString();
    }
    @Test
    public void get(){
        System.out.println(res(10));
    }
}
