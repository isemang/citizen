package com.story.citizen.util;

import com.story.citizen.util.code.FileStatusCode;
import org.springframework.web.multipart.MultipartFile;

/**
 * 실제 사진/영상파일 저장 및 삭제를 위한 Util
 */
public class FileUtil {

    public FileStatusCode saveFile(MultipartFile file) {
        return FileStatusCode.SUCCESS;
    }

    public FileStatusCode deleteFile() {
        return FileStatusCode.SUCCESS;
    }

    public FileStatusCode updateFile(MultipartFile file) {
        deleteFile();
        return saveFile(file);
    }
}
