import java.io.*;
import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double min = 0.0001;
        double max = 10; // 总和
        int cnt = 5; // 数量
        int scl = 6; // 小数最大位数
        int pow = (int) Math.pow(10, scl); // 用于提取指定小数位
        double sum = 0; // 用于验证总和
        double one;

        one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;

        System.out.println(((Math.random() * 5) * 1000) / 1000);

        // 输出
        System.out.println(one);
        double i = 2.0346768768;
        System.out.println(Math.round(i * 1000000) / 1000000.0);
        if (1.0 == 1) {
            System.out.println("等于");

        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("张三", "1");
        hashMap.put("张三", "2");
        System.out.println(hashMap);


        String path = System.getProperty("user.dir");
        File file = new File(path + "/setrate.txt");
        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        StringBuilder writeMsg = stringBuilder.append("时间：").append(format).append("    设置的ccy是：").append("ccy").append(" baseRate：").append("baseRate").append("  delta：").append("delta").append("\n");
        FileOutputStream fileOutputStream;

        if (!file.exists()) {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);

        } else {
            fileOutputStream = new FileOutputStream(file, true);
        }
        fileOutputStream.write(writeMsg.toString().getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();


        HashMap<String, String> map = new HashMap<>();
        map.put("yyy","111");
        map.put("zzz","222");
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(map);
        outputStream.close();


        FileInputStream freader = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(freader);
        HashMap<String, String> readMap = new HashMap<>();
        readMap = (HashMap<String, String>)objectInputStream.readObject();

        System.out.println(readMap);


    }


    }
