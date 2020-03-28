package pattern.proxy.dynamicproxy;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 23:22
 **/
public class HuaweiImpl implements Huawei {
    @Override
    public String getPhone(String name) {
        return "华为" + name;
    }
}
