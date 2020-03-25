package back;


import http.HttpClientUtils;
import org.json.JSONObject;

/**
 * @description: 银行
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-25 18:14
 **/
public class Back {

    public static void main(String[] args) throws Exception {
        String bankNo = "6228483610058294110";
        //银行代码请求接口 url
        String url = "https://ccdcapi.alipay.com/validateAndCacheCardInfo.json?_input_charset=utf-8&cardNo=" + bankNo
                + "&cardBinCheck=true";
        //发送请求，得到 josn 类型的字符串
        String result = HttpClientUtils.doGet(url).getContent();
        // 转为 Json 对象
        JSONObject json = new JSONObject(result);
        //获取到 bank 代码
        String bank = String.valueOf(json.get("bank"));
        //爬取支付宝银行合作商页面
        String listContent = HttpClientUtils.doGet("http://ab.alipay.com/i/yinhang.htm").getContent();
        //过滤得到需要的银行名称
        System.out.println(listContent);
    }
}
