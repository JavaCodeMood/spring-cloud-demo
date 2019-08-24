package com.lhf.springcloud.controller;

import com.lhf.springcloud.exception.StorageFileNotFoundException;
import com.lhf.springcloud.service.StorangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @ClassName: FileUploadController
 * @Description:  实现文件上传
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Controller
public class FileUploadController {

    private final StorangeService storangeService;

    @Autowired  //自动装配
    public FileUploadController(StorangeService storangeService){
        this.storangeService = storangeService;
    }


    /**
     * 展示上传的所有文件
     * @param model
     * @return
     * @throws IOException
     */
    @GetMapping("/")
    public String listUploadedFiles(Model model) throws IOException {
        model.addAttribute("files", storangeService.loadAll().map(
                path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class, "serverFile", path.getFileName().toString()).build().toString()
        ).collect(Collectors.toList()));

        return "uploadForm";
    }

    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serverFile(@PathVariable String filename){
        Resource file = storangeService.loadResource(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=\"" + file.getFilename() + "\"").body(file);
    }

    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file")MultipartFile file, RedirectAttributes redirectAttributes){
        storangeService.store(file);
        redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!" );

        return "redirect:/";  //重定向
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }


}
