package cn.com.cnpc.clouddata.filelistener;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.util.logging.Logger;

/**
2023.1.14日
对该文件进行L审核设置（之后每日更新一次）
*/

public class FileListener extends FileAlterationListenerAdaptor {
    private Logger log = Logger.getLogger(String.valueOf(FileListener.class));

    public String showFile(File file) {
        int fileCount = 0;
        int folderCount = 0;
        long length = 0;
        /*String parent = file.getParent();
        file = new File(parent);*/
        File[] list = file.listFiles();
        for (File files : list){
            if (files.isFile()){
                fileCount++;
                length += files.length();
            }else {
                folderCount++;
            }
        }
        return "文件数量：" + fileCount + "文件夹数量：" + folderCount + "文件大小：" + length;
    }

    /**
     * 文件创建执行
     */
    public void onFileCreate(File file) {
        log.info("[新建]:" + file.getAbsolutePath());
    }
    /**
     * 文件创建修改
     */
    public void onFileChange(File file) {
        log.info("[修改]:" + file.getAbsolutePath());
    }
    /**
     * 文件删除
     */
    public void onFileDelete(File file) {
        log.info("[删除]:" + file.getAbsolutePath());
    }
    /**
     * 目录创建
     */
    public void onDirectoryCreate(File directory) {
        // 循环遍历当前目录下所有的文件，包括子目录中的所有文件
        showFile(directory);
        log.info("[新建]:" + directory.getAbsolutePath());
    }
    /**
     * 目录修改
     */
    public void onDirectoryChange(File directory) {
        log.info("[修改]:" + directory.getAbsolutePath());
    }
    /**
     * 目录删除
     */
    public void onDirectoryDelete(File directory) {
        log.info("[删除]:" + directory.getAbsolutePath());
    }

    public void onStart(FileAlterationObserver observer) {
        // TODO Auto-generated method stub
        super.onStart(observer);
    }
    public void onStop(FileAlterationObserver observer) {
        // TODO Auto-generated method stub
        super.onStop(observer);
    }
}
