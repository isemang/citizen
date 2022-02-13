package com.story.citizen.controller;

import com.story.citizen.dto.CitizenDto;
import com.story.citizen.service.CitizenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/member")
@RequiredArgsConstructor @Slf4j
public class CitizenController {

    private final CitizenService citizenService;

    @ResponseBody
    @PostMapping("/new")
    public <T> ResponseEntity<T> createNewCitizen(@RequestBody CitizenDto citizenDto) {
        log.info("==== [신규 회원 가입 API 시작] ====");
        log.info("*******수신 Data::" + citizenDto.toString());

        ResponseEntity<T> responseEntity = new ResponseEntity<>(HttpStatus.OK);

        return responseEntity;
    }
}
/*  Citizen
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
    private Long citizenNo;
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