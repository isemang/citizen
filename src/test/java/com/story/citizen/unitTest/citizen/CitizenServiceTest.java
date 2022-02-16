package com.story.citizen.unitTest.citizen;

import com.story.citizen.domain.Citizen;
import com.story.citizen.domain.enumType.YnType;
import com.story.citizen.service.CitizenService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.mockito.Mockito.mock;

public class CitizenServiceTest {

    private EntityManager em;

    @Test
    @DisplayName("citizenRepository_저장테스트_성공")
    void citizenService_저장테스트_성공() {
        //given
        CitizenService citizenService = mock(CitizenService.class);

        Citizen citizen1 = Citizen.builder()
                .email("asdf@asdf.com").realName("찐이름").password("password")
                .birth(LocalDate.now()).joinDate(LocalDateTime.now()).id("instagramId")
                .citizenName("딩딩").profileDetail("프로필내용")
                .profilePhotoYn(YnType.N).build();

        //when
        citizenService.saveNewCitizen(citizen1);

        System.out.println(citizen1.getPkNo());

        Citizen findResult = citizenService.findOne(citizen1.getPkNo());

        //then
        Assertions.assertThat(citizen1 == findResult);
    }


}
