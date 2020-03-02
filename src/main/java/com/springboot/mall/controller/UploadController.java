package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 文件上传和下载
 */
@RestController
@Api(tags = "UploadController", description = "文件上传和下载管理")
@RequestMapping("/file")
public class UploadController {

  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
  /**
   * 文件上传地址
   */
  //private static String UPLOADED_FOLDER = "D:/FTP/";
  @Value("${file.uploadFolder}")
  private String UPLOADED_FOLDER;

  @ApiOperation(value = "单文件上传")
  @RequestMapping(value = "/upload", method = RequestMethod.POST)
  public Object singleFileUpload(@RequestParam("file") MultipartFile file) {
    if (file.isEmpty() ){
      return new CommonResult().failed("文件不能为空！");
    }
    try {
      // 获取文件保存位置
      byte[] bytes = file.getBytes();
      Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
      Files.write(path, bytes);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return new CommonResult().success("上传文件成功！");
  }


  @ApiOperation(value = "多文件上传")
  @RequestMapping(value = "/uploads", method = RequestMethod.POST)
  public Object downFileUploads(@RequestParam("files") List<MultipartFile> files) {
    if (files.isEmpty() ){
      return new CommonResult().failed("文件不能为空！");
    }
    for (MultipartFile file : files){
      String fileName = file.getOriginalFilename();
      //取文件后缀名
      String suffixName = fileName.substring(fileName.lastIndexOf("."));
      //重新生成文件名
      String newName = System.currentTimeMillis() + suffixName;
      String filePath = UPLOADED_FOLDER;
      File dest = new File(filePath + fileName);
      try {
        file.transferTo(dest);
      } catch (IOException e) {
        e.printStackTrace();
        return new CommonResult().failed("文件上传失败！");
      }
    }
    return new CommonResult().success("上传文件成功！");
  }


}
