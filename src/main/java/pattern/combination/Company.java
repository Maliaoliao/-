package pattern.combination;

/**
 * 组合模式，使用组合模式算出部门人数的总和
 * mall 公司，
 * 有3个部门
 * 财务
 * 财务下有
 * 售前 1人 名字叫：A_1， A_2
 * 售后 2人 名字叫： B_2 B_2
 * 研发
 * 华南
 * 广东 2人 名字叫： C_1 C_2
 * <p>
 * 广西 4人 名字叫： D_1,D_2,D_3,D_4
 * 华北
 * 内蒙古 2人 名字叫： E_1,E_2
 * <p>
 * 华中 2人 名字叫：F_1 F_1
 * HR 1人 名字叫：  G_1
 * <p>
 * 抽象构建.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-18 15:11
 */
public interface Company {

    /**
     * Add 成员.
     *
     * @param c the c
     */
    void add(Company... c);

    /**
     * Remove 成员.
     *
     * @param c the c
     */
    void remove(Company... c);

    /**
     * Gets child.
     *
     * @param i the
     * @return the child
     */
    Company getChild(int i);

    /**
     * Operation.
     */
    public void operation ();

    /**
     * Op name.
     */
    public void opName();

}
