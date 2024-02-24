package cn.com.cnpc.clouddata.controller;

import cn.com.cnpc.clouddata.listener.ExcelListener;
import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson2.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("test")
public class excelController {

    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        ExcelListener excelListener = new ExcelListener();
        EasyExcel.read(file.getInputStream(), excelListener).sheet().doRead();

        Map<String, Integer> importHeads = excelListener.getImportHeads();
        System.out.println(importHeads);

        List<JSONObject> dataList = excelListener.getDataList();
        for (JSONObject jsonObject : dataList) {
            System.out.println(jsonObject);
        }

        //打印一下接收到的file
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getInputStream());
        System.out.println(file.getBytes());
        System.out.println(file.getInputStream().available());
        System.out.println(file.getInputStream().read());
        System.out.println(file.getInputStream().read());

        return "打印在控制台了";
    }
}
