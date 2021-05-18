
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class DemoTesting {
    public static void main(String[] args) throws IOException {
      // 在项目根目录下创建fuhao.txt文件，将以下代表富豪名称和财富的“键值对”手动存到文件中，利用所学的Properties类的相关知识,
      // 将文件内容读取到项目中，判断“键值对”中是否有王卫的数据，如果有，将其对应的身价修改为1860亿。并利用Properties类的相关
      // 知识把修改后的最新数据写入到新的文件newfuhao.txt中；

        Properties pps = new Properties();
        pps.load(new FileReader("fuhao.txt"));
        if((pps.get("王卫"))!=null){
            pps.setProperty("王卫","1860亿");
        }

        pps.store(new FileWriter("newfuhao.txt"),"UTF-8");

    }
}
