package pattern.bridging.jacket;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 14:51
 **/
public class AcstractionColor extends Abstraction{


    protected AcstractionColor(Brand brand) {
        super(brand);
    }

    @Override
    public String getRadColor() {

        return "红色的：" + brand.getLogo();
    }

    @Override
    public String getbalkColor() {
        return "黑色的：" + brand.getLogo();
    }
}
