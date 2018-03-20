package com.lw.imgdata.util;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/**
 * @Title: FileUtil
 * @Author:LiMan
 * @Date:2018/2/6 14:24
 * @Description: 文件帮助类
 */
public class FileUtil {
    /**
     * 创建目录
     *
     * @param dir_path
     */
    public static void mkDir(String dir_path) throws Exception {
        File myFolderPath = new File(dir_path);
        if (!myFolderPath.exists()) {
            myFolderPath.mkdir();
        }
    }

    /**
     * 创建文件
     *
     * @param file_path
     */
    public static void createNewFile(String file_path) throws Exception {
        File myFilePath = new File(file_path);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
    }

    /**
     * 递归删除文件或者目录
     *
     * @param file_path
     */
    public static void deleteEveryThing(String file_path) throws Exception {
        File file = new File(file_path);
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                String root = files[i].getAbsolutePath();//得到子文件或文件夹的绝对路径
                deleteEveryThing(root);
            }
            file.delete();
        }
    }

    /**
     * @param fromFilePath 来源文件路径, toFilePath 目标地址
     * @return void
     * @Title: copyFile
     * @Description:复制文件
     * @author LiMan
     * @date 2018/2/6 14:33
     */
    public static void copyFile(String fromFilePath, String toFilePath) throws IOException {
        File fromFile = new File(fromFilePath);
        File toFile = new File(toFilePath);
        FileInputStream ins = new FileInputStream(fromFile);
        FileOutputStream out = new FileOutputStream(toFile);
        byte[] b = new byte[1024];
        int n = 0;
        while ((n = ins.read(b)) != -1) {
            out.write(b, 0, n);
        }
        ins.close();
        out.close();
    }

    /**
     * 将存放在sourceFilePath目录下的源文件，打包成fileName名称的zip文件，并存放到zipFilePath路径下
     *
     * @param sourceFilePath :待压缩的文件路径
     * @param zipFilePath    :压缩后存放路径
     * @param fileName       :压缩后文件的名称
     * @return
     */
    public static boolean fileToZip(String sourceFilePath, String zipFilePath, String fileName) {
        boolean flag = false;
        File sourceFile = new File(sourceFilePath);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        ZipOutputStream zos = null;

        if (sourceFile.exists() == false) {
            System.out.println("待压缩的文件目录：" + sourceFilePath + "不存在.");
        } else {
            try {
                File zipFile = new File(zipFilePath + "/" + fileName + ".zip");
                if (zipFile.exists()) {
                    System.out.println(zipFilePath + "目录下存在名字为:" + fileName + ".zip" + "打包文件.");
                } else {
                    File[] sourceFiles = sourceFile.listFiles();
                    if (null == sourceFiles || sourceFiles.length < 1) {
                        System.out.println("待压缩的文件目录：" + sourceFilePath + "里面不存在文件，无需压缩.");
                    } else {
                        fos = new FileOutputStream(zipFile);
                        zos = new ZipOutputStream(new BufferedOutputStream(fos));
                        byte[] bufs = new byte[1024 * 10];
                        for (int i = 0; i < sourceFiles.length; i++) {
                            //创建ZIP实体，并添加进压缩包
                            ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getName());
                            zos.putNextEntry(zipEntry);
                            //读取待压缩的文件并写进压缩包里
                            fis = new FileInputStream(sourceFiles[i]);
                            bis = new BufferedInputStream(fis, 1024 * 10);
                            int read = 0;
                            while ((read = bis.read(bufs, 0, 1024 * 10)) != -1) {
                                zos.write(bufs, 0, read);
                            }
                        }
                        flag = true;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } finally {
                //关闭流
                try {
                    if (null != bis) bis.close();
                    if (null != zos) zos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
        return flag;
    }

    /**
     * 压缩整个文件夹中的所有文件，生成指定名称的zip压缩包
     * @param filepath 文件所在目录
     * @param zippath 压缩后zip文件名称
     * @param dirFlag zip文件中第一层是否包含一级目录，true包含；false没有
     * 2015年6月9日
     */
    public static void zipMultiFile(String filepath ,String zippath, boolean dirFlag) {
        try {
            File file = new File(filepath);// 要被压缩的文件夹
            File zipFile = new File(zippath);
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for(File fileSec:files){
                    if(dirFlag){
                        recursionZip(zipOut, fileSec, file.getName() + File.separator);
                    }else{
                        recursionZip(zipOut, fileSec, "");
                    }
                }
            }
            zipOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void recursionZip(ZipOutputStream zipOut, File file, String baseDir) throws Exception{
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File fileSec:files){
                recursionZip(zipOut, fileSec, baseDir + file.getName() + File.separator);
            }
        }else{
            byte[] buf = new byte[1024];
            InputStream input = new FileInputStream(file);
            zipOut.putNextEntry(new ZipEntry(baseDir + file.getName()));
            int len;
            while((len = input.read(buf)) != -1){
                zipOut.write(buf, 0, len);
            }
            input.close();
        }
    }

    public static void main(String[] args) {
        try {
           /* //创建文件夹
            FileUtil.mkDir("D://pic//newFile");
            //创建文件
            FileUtil.createNewFile("D://pic//newFile//test.txt");
            //复制文件
            FileUtil.copyFile("D://pic//test.jpg", "D://pic//newFile//t1.jpg");
            //压缩文件
            FileUtil.fileToZip("D://pic//newFile", "D://pic", "files");*/
            //删除文件
            // FileUtil.deleteEveryThing("D://pic//newFile");
            //FileUtil.deleteEveryThing("D://pic//files.zip");
            FileUtil.zipMultiFile("D:\\pic\\1517908557298","D:\\zip\\57298.zip",true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
