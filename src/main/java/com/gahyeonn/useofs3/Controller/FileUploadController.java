package com.gahyeonn.useofs3.Controller;

import com.gahyeonn.useofs3.Service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
public class FileUploadController {
    private final FileUploadService fileUploadService;

    @PostMapping("/s3/upload-file")
    public String uploadImage(@RequestPart MultipartFile file){
        return fileUploadService.uploadImage(file);
    }
}
