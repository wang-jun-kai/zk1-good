package com.ljy.controller;

import com.ljy.config.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@CrossOrigin
public class FileUpdate {


    @PostMapping("fileUpdate")
    @ResponseBody
    public String fileUpdate(String ceshi, @RequestParam("file") MultipartFile file) throws IOException {
        //上传默认文件大小是1M
        //可以早配置文件修改上传文件的大小
//        String fileName=file.getOriginalFilename();
//        System.out.println(ceshi+"-----"+file+"-----"+fileName);
//        File file2=new File("D:/temp"+File.separator+fileName);
//        file.transferTo(file2);
//        return fileName;

        String s = FileUtil.fileUpdate(file);
        return s;

    }


    @RequestMapping("/downLoad")
    public String downLoad(HttpServletResponse response, HttpServletRequest request) {
        FileUtil.downLoad(response, request);
        return null;


    }







}
