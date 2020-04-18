package pattern.combination;

import org.junit.Test;

/**
 * 组合模式，使用组合模式算出部门人数的总和
 *  * mall 公司，
 *  *  有3个部门
 *  *      财务
 *  *          财务下有
 *  *              售前 1人 名字叫：A_1
 *  *              售后 2人 名字叫： B_2 B_2
 *  *      研发
 *  *          华南
 *  *              广东 2人 名字叫： C_1 C_2
 *  *
 *  *              广西 4人 名字叫： D_1,D_2,D_3,D_4
 *  *          华北
 *  *              内蒙古 2人 名字叫： E_1,E_2
 *  *
 *  *          华中 2人 名字叫：F_1 F_1
 *  *       HR 1人 名字叫：  G_1.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 15:31
 **/
public class ComTest {

    @Test
    public void test() {
        Company mall = new Department("Mall");
        //财务
        Company c = new Department("财务");
        Company shouqian = new Department("售前");
        Company shouhuo = new Department("售后");
        Member c_1 = new Member("A_1","男",25);
        Member c_2 = new Member("B_2","男",25);
        Member c_3 = new Member("B_3","女",18);
        c.add(shouqian,shouhuo);
        shouqian.add(c_1);
        shouhuo.add(c_2,c_3);


        Company y = new Department("研发");
        Company huanan = new Department("华南");

        Company guangdong = new Department("广东");

        Company huabei = new Department("华北");

        Company neimeng = new Department("内蒙古");

        Company huazhong = new Department("华中");

        Member c_4 = new Member("C_1","男",25);
        Member c_5 = new Member("C_2","男",25);
        Member c_6 = new Member("D_1","女",18);
        Member c_7 = new Member("D_2","女",18);
        Member c_8 = new Member("E_1","女",18);
        Member c_9 = new Member("马里奥","总裁",18);
        //研发不下的公司
        y.add(huanan,huabei,huazhong);
        huanan.add(guangdong);
        huabei.add(neimeng);
        //广东下的成员
        guangdong.add(c_4,c_5);
        //内蒙下的成员
        neimeng.add(c_6,c_7);
        //华中下的成员
        huazhong.add(c_8);
        huazhong.add(c_8);
        //mall公司下的 财务部门和研发部门
        mall.add(c,y);
        mall.add(c_9);
        mall.add(c_8);
        mall.operation() ;
        //扩展 统计指定部门下的成员数量
        c.opName();


    }
}
