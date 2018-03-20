package com.lw.imgdata.controll;

import com.lw.imgdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *@Title: OrderController
 *@Author:LiMan
 *@Date:2018/2/7 9:40
 *@Description: 工单
 */
@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/downloadZip")
    public void downloadZip(String schemeCode, HttpServletRequest request, HttpServletResponse response){
        //获取打包好的文件位置
        String path = null;
        try {
            path = orderService.createZipFile(schemeCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(path != null){
            //设置响应头和客户端保存文件名
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition", "attachment;fileName=" + schemeCode+".zip");
            //用于记录以完成的下载的数据量，单位是byte
            long downloadedLength = 0l;
            try {
                //打开本地文件流
                InputStream inputStream = new FileInputStream(path);
                //激活下载操作
                OutputStream os = response.getOutputStream();

                //循环写入输出流
                byte[] b = new byte[2048];
                int length;
                while ((length = inputStream.read(b)) > 0) {
                    os.write(b, 0, length);
                    downloadedLength += b.length;
                }

                // 这里主要关闭。
                os.close();
                inputStream.close();
            } catch (Exception e){
               e.printStackTrace();
            }
        }

    }
}
