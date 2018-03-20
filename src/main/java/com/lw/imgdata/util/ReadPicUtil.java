package com.lw.imgdata.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.lw.imgdata.pojo.ImageInfo;

public class ReadPicUtil {
    /**
     * 处理 单张 图片
     * 
     * @return void
     * @date 2015-7-25 下午7:30:47
     */
    public static ImageInfo readPic(String url) {
        File jpegFile = new File(url);
        ImageInfo im = new ImageInfo();
        Metadata metadata;
        try {
            metadata = JpegMetadataReader.readMetadata(jpegFile);
            Iterator<Directory> it = metadata.getDirectories().iterator();
            while (it.hasNext()) {
                Directory exif = it.next();
                if(exif.getName().equals("Exif IFD0")) {
                	Iterator<Tag> tags = exif.getTags().iterator();
                	
                    while (tags.hasNext()) {
                        Tag tag = (Tag) tags.next();
                        if("Make".equals(tag.getTagName())) {
                        	im.setEquipmentManufacturer(tag.getDescription());
                        }
                        if("Model".equals(tag.getTagName())) {
                        	im.setEquipmentModel(tag.getDescription());
                        }
                        if("Date/Time".equals(tag.getTagName())) {
                        	if(tag.getDescription() != null) {
                        		im.setPhotoOp(TimeUtil.format(tag.getDescription(),"yyyy:MM:dd HH:mm:ss"));
                        	}
                        }
                    }
                }
                if(exif.getName().equals("File")) {
                	Iterator<Tag> tags = exif.getTags().iterator();
                	while (tags.hasNext()) {
                        Tag tag = (Tag) tags.next();
                       
                        if("File Modified Date".equals(tag.getTagName())) {
                        	if(tag.getDescription() != null) {
                        		String str = tag.getDescription();
                        		str = str.replace("+08:00", "+0800");
                        		im.setUploadTime(TimeUtil.format(str,"EEE MMM dd HH:mm:ss Z yyyy"));
                        	}
                        }
                    }
                }
            }
            //获取图片指纹
            FingerPrint fp1 = new FingerPrint(ImageIO.read(jpegFile));
            im.setImageFingerprint(fp1.getBinaryzationMatrix());
        } catch (JpegProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return im;

    }

}
