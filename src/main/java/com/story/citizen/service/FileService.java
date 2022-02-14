package com.story.citizen.service;

import com.story.citizen.exception.FileManageException;
import com.story.citizen.repository.FileRepository;
import com.story.citizen.util.FileUtil;
import com.story.citizen.util.code.FileStatusCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * 프로필 사진 or 포스트 사진/영상 삭제하는 Service
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class FileService {

    private final FileRepository fileRepository;
    private final FileUtil fileUtil;

    @Transactional
    public void saveProfileFile(MultipartFile file) {
        //1) 실제 multipartFile 저장(FileUtil 이용)
        //2) profileFile 테이블에 저장(여기서 직접 해야 함)
        FileStatusCode fileSavingStatus = fileUtil.saveFile(file);

        if(!fileSavingStatus.equals(FileStatusCode.SUCCESS)) {
            throw new FileManageException(fileSavingStatus.getMessage());
        }
    }

    @Transactional
    public void deleteProfileFile() {
        //1) 파일번호&위치&파일명 찾기
        //2) 실제 file 삭제 (FileUtil 이용)
        //2) profileFile 테이블에서 삭제(여기서 직접 해야 함)
        FileStatusCode fileDeleteStatus = fileUtil.deleteFile();

        if(!fileDeleteStatus.equals(FileStatusCode.SUCCESS)) {
            throw new FileManageException(fileDeleteStatus.getMessage());
        }
    }

    public void updateProfileFile(MultipartFile file) {
        deleteProfileFile();
        saveProfileFile(file);
    }
}
