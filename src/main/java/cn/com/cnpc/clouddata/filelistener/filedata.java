package cn.com.cnpc.clouddata.filelistener;

import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.util.concurrent.TimeUnit;


public class filedata {

    public static void main(String[] args) {
        // 轮询间隔 5 秒
        long interval = TimeUnit.SECONDS.toMillis(5);
        //不使用过滤器,使用过滤器时创建FileAlterationObserver对象时传入第二个参数FileFilter
        FileAlterationObserver observer = new FileAlterationObserver("D:\\test");
        FileListener fileListener = new FileListener();
        observer.addListener(fileListener);
        //创建文件变化监听器
        FileAlterationMonitor monitor = new FileAlterationMonitor(interval, observer);
        // 开始监控
        try {
            monitor.start();
        }catch (Exception e){}
    }
}
