package pattern.prototype;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型模式.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-27 15:03
 **/
public class Tests {


    @Test
    public void test() throws CloneNotSupportedException {
        User u = new User();

        User res = (User) u.clone();

        if(u == res){
            System.out.println("对象相等");
        }


        if(u == res){
            System.out.println("对象相等");
        }
        System.out.println(u.getName());

        System.out.println(res.getName());

    }

    @Test
    public void t(){
        Map<String,String> map = new HashMap<>();


        String id = "f15bb096ff244670bb0f1e8f7d6746d5";
        map.put("E0003810063,zhouhangyu@hq.cmcc,zhouhangyu@hq.cmcc","周航宇");
        map.put("E0055000138,wangpengchengds@hq.cmcc,wangpengchengds@hq.cmcc","王鹏程");
        map.put("E0003870265,wenxiaohua@hq.cmcc,wenxiaohua@hq.cmcc","文晓华");
        map.put("E0048340158,zhaoych1@gs.cmcc,zhaoych1@gs.cmcc","赵玉成");
        map.put("E0050005717,leiyue@nx.cmcc,leiyue@nx.cmcc","雷玥");

        map.forEach((k,v)->{
            for (int i = 0 ;i < 5;i++){

                System.out.println("INSERT INTO WFBIZ_CATAPERM_RELATION\n" +
                        "        (MAPPINGID,\n" +
                        "         CATALOGUUID,\n" +
                        "         PERMISSIONTYPE,\n" +
                        "         PARTITYPE,\n" +
                        "         PARTIID,\n" +
                        "         PARTINAME,\n" +
                        "         UPTTIME,\n" +
                        "         TENANT_ID)\n" +
                        "      VALUES\n" +
                        "        (wfbiz_cataperm_relation_seq.nextval,\n" +
                        "'"+id +"',"+
                        i +
                        ",'person'\n" +
                        ",'"+k+"'"+
                        ",'"+v+"',"+
                        "         SYSDATE,\n" +
                        "         'IHR');");
                System.out.println();
            }
        });

    }
}
