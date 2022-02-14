package com.story.citizen.repository;

import com.story.citizen.domain.Citizen;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class CitizenRepository {

    private final EntityManager em;

    public void save(Citizen citizen) {
        em.persist(citizen);
    }

    public Citizen findOne(Long citizenNo) {
        return em.find(Citizen.class, citizenNo);
    }

}
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