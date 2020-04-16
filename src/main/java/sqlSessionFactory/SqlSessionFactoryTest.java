package sqlSessionFactory;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-13 13:59
 **/
public class SqlSessionFactoryTest{


    @Test
    public void test() {
        Configuration configuration = new Configuration();
        SqlSessionFactory res = new DefaultSqlSessionFactory(configuration);

    }
}
