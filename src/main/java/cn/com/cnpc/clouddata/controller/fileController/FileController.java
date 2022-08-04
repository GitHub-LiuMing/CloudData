package cn.com.cnpc.clouddata.controller.fileController;

import cn.com.cnpc.clouddata.filelistener.FileListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/file")   //访问路径
public class FileController {

    @RequestMapping("/test")
    public String test(){


        return new FileListener().showFile(new File("D:\\test"));
    }
}
