package com.story.citizen.controller;

import com.story.citizen.domain.Citizen;
import com.story.citizen.domain.enumType.YnType;
import com.story.citizen.dto.CitizenDto;
import com.story.citizen.service.CitizenService;
import com.story.citizen.service.FileService;
import com.story.citizen.util.code.FileStatusCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("/member")
@RequiredArgsConstructor @Slf4j
public class CitizenController {

    private final CitizenService citizenService;
    private final FileService fileService;

    @ResponseBody
    @PostMapping("/join")
    public ResponseEntity<Long> saveNewCitizen(@RequestBody CitizenDto dto, @RequestParam("file") MultipartFile file) {
        log.info("******* [신규 회원 가입 API 호출 시작] *******");
        log.info("******* 수신 Data::" + dto.toString());

        if(YnType.Y.equals(dto.getProfilePhotoYn())) {
            fileService.saveProfileFile(file);
        }

        Citizen newCitizen = Citizen.builder().email(dto.getEmail()).realName(dto.getRealName())
                .password(dto.getPassword()).birth(dto.getBirth()).id(dto.getId())
                .citizenName(dto.getCitizenName()).profileDetail(dto.getProfileDetail())
                .profilePhotoYn(dto.getProfilePhotoYn()).build();

        citizenService.saveNewCitizen(newCitizen);

        ResponseEntity<Long> responseEntity = new ResponseEntity<>(newCitizen.getPkNo(), HttpStatus.OK);

        return responseEntity;
    }
}
/*  Citizen 기능
- 회원가입
- 회원 하나 찾기(여럿 찾기는 필요 없음)
- 회원 비밀번호 변경
- 회원 아이디(citizen id) 변경
- 회원 이름 변경
- 회원 프로필 디테일 변경
- 회원 프로필 사진 변경 및 프로필 사진유무 확인/변경
- 회원 포스트 내역 조회
- 회원 조회(citizen id, citizenName, profileDetail, profilePhotoYn, profileFile)
 */
/*
    private Long pkNo;
    private String email;
    private String realName;
    private String password;
    private LocalDate birth;
    private LocalDateTime joinDate;

    private String id; (citizen id)
    private String citizenName;
    private String profileDetail;
    private YnType profilePhotoYn;
    private ProfileFile profileFile;
    List<Post> posts = new ArrayList<>();
 */