package cn.com.cnpc.clouddata;

import cn.com.cnpc.clouddata.listener.ExcelListener;
import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson2.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class CloudDataApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        // 生成Excel路径
        String fileName = "D:\\test\\测试.xlsx";

        //EasyExcel.write(fileName, User.class).sheet("模板").doWrite(data());

        /*EasyExcel.write(fileName).head(head()).registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                .sheet("模板").doWrite(dataList());*/


        //通过listener测试读取固定表格中的数据
        // 生成Excel路径
        //String fileName = "D:\\JetBrains\\IdeaProjects\\CNPC\\CloudData\\代理服务费开票信息登记表 - 测试.xlsx";
        ExcelListener excelListener = new ExcelListener();
        EasyExcel.read(fileName, excelListener).sheet().doRead();
        // 表格头数据
        Map<String, Integer> importHeads = excelListener.getImportHeads();
        System.out.println(importHeads);
        // 每一行数据
        List<JSONObject> dataList = excelListener.getDataList();
        for (JSONObject object : dataList) {
            System.out.println(object);
        }
    }

    private List<User> data() {
        List<User> userList = new ArrayList<>();
        User user;
        for (int i = 1; i <= 10; i++) {
            user = new User();
            user.setName("张三" + i);
            user.setSex("男");
            user.setAge(i);
            user.setCardid("440582xxxx");
            userList.add(user);
        }
        return userList;
    }



    /*更新*/


    /**
     //无对象的写入
    private List<List<String>> head() {
        List<List<String>> list = new ArrayList<>();
        List<String> head0 = new ArrayList<>();
        head0.add("姓名");
        List<String> head1 = new ArrayList<>();
        head1.add("年龄");
        List<String> head2 = new ArrayList<>();
        head2.add("生日");
        list.add(head0);
        list.add(head1);
        list.add(head2);
        return list;
    }

    private List<List<Object>> dataList() {
        List<List<Object>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Object> data = new ArrayList<>();
            data.add("张三");
            data.add(25);
            data.add(new Date());
            list.add(data);
        }
        return list;
    }
     */

    /**
     //无对象的写入
     private List<List<String>> head() {
     List<List<String>> list = new ArrayList<>();
     List<String> head0 = new ArrayList<>();
     head0.add("姓名");
     List<String> head1 = new ArrayList<>();
     head1.add("年龄");
     List<String> head2 = new ArrayList<>();
     head2.add("生日");
     list.add(head0);
     list.add(head1);
     list.add(head2);
     return list;
     }

     private List<List<Object>> dataList() {
     List<List<Object>> list = new ArrayList<>();
     for (int i = 0; i < 10; i++) {
     List<Object> data = new ArrayList<>();
     data.add("张三");
     data.add(25);
     data.add(new Date());
     list.add(data);
     }
     return list;
     }
     */

     /**
     //无对象的写入
     private List<List<String>> head() {
     List<List<String>> list = new ArrayList<>();
     List<String> head0 = new ArrayList<>();
     head0.add("姓名");
     List<String> head1 = new ArrayList<>();
     head1.add("年龄");
     List<String> head2 = new ArrayList<>();
     head2.add("生日");
     list.add(head0);
     list.add(head1);
     list.add(head2);
     return list;
     }

     private List<List<Object>> dataList() {
     List<List<Object>> list = new ArrayList<>();
     for (int i = 0; i < 10; i++) {
     List<Object> data = new ArrayList<>();
     data.add("张三");
     data.add(25);
     data.add(new Date());
     list.add(data);
     }
     return list;
     }
     */

    /**
     //无对象的写入
     private List<List<String>> head() {
     List<List<String>> list = new ArrayList<>();
     List<String> head0 = new ArrayList<>();
     head0.add("姓名");
     List<String> head1 = new ArrayList<>();
     head1.add("年龄");
     List<String> head2 = new ArrayList<>();
     head2.add("生日");
     list.add(head0);
     list.add(head1);
     list.add(head2);
     return list;
     }

     private List<List<Object>> dataList() {
     List<List<Object>> list = new ArrayList<>();
     for (int i = 0; i < 10; i++) {
     List<Object> data = new ArrayList<>();
     data.add("张三");
     data.add(25);
     data.add(new Date());
     list.add(data);
     }
     return list;
     }
     */

    /**
     //无对象的写入
     private List<List<String>> head() {
     List<List<String>> list = new ArrayList<>();
     List<String> head0 = new ArrayList<>();
     head0.add("姓名");
     List<String> head1 = new ArrayList<>();
     head1.add("年龄");
     List<String> head2 = new ArrayList<>();
     head2.add("生日");
     list.add(head0);
     list.add(head1);
     list.add(head2);
     return list;
     }

     private List<List<Object>> dataList() {
     List<List<Object>> list = new ArrayList<>();
     for (int i = 0; i < 10; i++) {
     List<Object> data = new ArrayList<>();
     data.add("张三");
     data.add(25);
     data.add(new Date());
     list.add(data);
     }
     return list;
     }
     */

    //无对象的写入
     private List<List<String>> head() {
     List<List<String>> list = new ArrayList<>();
     List<String> head0 = new ArrayList<>();
     head0.add("姓名");
     List<String> head1 = new ArrayList<>();
     head1.add("年龄");
     List<String> head2 = new ArrayList<>();
     head2.add("生日");
     list.add(head0);
     list.add(head1);
     list.add(head2);
     return list;
     }

     private List<List<Object>> dataList() {
     List<List<Object>> list = new ArrayList<>();
     for (int i = 0; i < 10; i++) {
     List<Object> data = new ArrayList<>();
     data.add("张三");
     data.add(25);
     data.add(new Date());
     list.add(data);
     }
     return list;
     }

    private List<User> data() {
        List<User> userList = new ArrayList<>();
        User user;
        for (int i = 1; i <= 10; i++) {
            user = new User();
            user.setName("张三" + i);
            user.setSex("男");
            user.setAge(i);
            user.setCardid("440582xxxx");
            userList.add(user);
        }
        return userList;
    }

    private List<User> 111() {
        List<User> userList = new ArrayList<>();
        User user;
        for (int i = 1; i <= 10; i++) {
            user = new User();
            user.setName("张三" + i);
            user.setSex("男");
            user.setAge(i);
            user.setCardid("440582xxxx");
            userList.add(user);
        }
        return userList;
    }
}
