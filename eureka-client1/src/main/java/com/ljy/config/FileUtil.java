package com.ljy.config;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileUtil {


    public static String fileUpdate(MultipartFile file) throws IOException {
        //上传默认文件大小是1M
        //可以早配置文件修改上传文件的大小
        String fileName=file.getOriginalFilename();
        System.out.println("-----"+file+"-----"+fileName);
        File file2=new File("D:/temp"+File.separator+fileName);
        file.transferTo(file2);
        return fileName;
    }

    public static void downLoad(HttpServletResponse response, HttpServletRequest request){
        OutputStream output = null;
        FileInputStream input = null;
        try {
            output = response.getOutputStream();
            String str = request.getParameter("fileName");//pic2.png
            if (StringUtils.isEmpty(str)) {
                return;
            }
            str = "D://temp//" + str;
            //biye[] -->InputStream-->out
            input = new FileInputStream(str);//D:\temp\pic2.png
            int actual = 0;
            byte[] b = new byte[1024];
            while ((actual = input.read(b)) > 0) {
                output.write(b, 0, actual);
            }
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
