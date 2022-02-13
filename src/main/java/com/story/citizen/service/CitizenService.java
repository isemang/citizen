package com.story.citizen.service;

import com.story.citizen.domain.Citizen;
import com.story.citizen.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CitizenService {

    private final CitizenRepository citizenRepository;

    @Transactional
    public void saveNewCitizen(Citizen citizen) {
        citizenRepository.save(citizen);
    }

    @Transactional
    public void updatePassword(Long citizenNo, String password) {
        Citizen updatedMember = citizenRepository.findOne(citizenNo);

        updatedMember = Citizen.builder().password(password).build();
    }

    public Citizen findOne(Long citizenNo) {
        return citizenRepository.findOne(citizenNo);
    }
}
