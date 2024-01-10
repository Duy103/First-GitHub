package t013.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadMap {
    // yêu cầu: ReadMap koong cần khởi tạo đối tượng => vẫn có thể sử dụng các func.

    /**
     * Dùng để lấy thông tin map theo cấp độ level
     *
     * @param level : cấp độ người chơi
     * @return mảng các chuỗi là thông tin của map
     */
    public static List<String> getMap(int level) {
        ArrayList<String> result = new ArrayList<>();
        File file = new File("src/t013/assets/map/" + level + ".txt");
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader buf = new BufferedReader(fileReader);

                String line;

                while ((line = buf.readLine()) != null) {
                    result.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
