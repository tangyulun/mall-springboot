package com.springboot.mall.controller;

import com.springboot.mall.dto.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件上传和下载
 */
@Controller
@Api(tags = "UploadController", description = "文件上传和下载管理")
@RequestMapping("/file")
public class UploadController {
  /**
   * 文件上传地址
   */
  private static String UPLOADED_FOLDER = "D:/FTP/";
  @ApiOperation(value = "单文件上传")
  @RequestMapping(value = "/upload", method = RequestMethod.POST)
  @ResponseBody
  public Object singleFileUpload(@RequestParam("file") MultipartFile file) {
    if (file.isEmpty() ){
      return new CommonResult().unauthorized("文件不能为空！");
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
  @ResponseBody
  public Object multiFileUpload(@RequestParam("file") MultipartFile[] file) {
    if (file == null ){
      return new CommonResult().unauthorized("文件不能为空！");
    }
    try {
      for (int i = 0; i <= file.length ; i++ ) {
        byte[] bytes = file[i].getBytes();
        Path path = Paths.get(UPLOADED_FOLDER + file[i].getOriginalFilename());
        Files.write(path, bytes);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new CommonResult().success("上传文件成功！");
  }
}
