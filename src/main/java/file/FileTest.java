package file;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-07 14:31
 **/
public class FileTest {
    @Test
    public void wiith() throws IOException {
        String path = "/Users/maliao/app/设计模式/dp/target/redis.txt";
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("文件写入失败！");
            e.printStackTrace();
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb.append("set ").append(i).append(" " + i + " \n");
        }
        outputStream.write(sb.toString().getBytes());
    }
}
