package com.story.citizen.repository;

import com.story.citizen.domain.ProfileFile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class FileRepository {

    private final EntityManager em;

    public void saveProfileFile(ProfileFile profileFile) {
        if (profileFile.getProfileFileNo() == null) {
            em.persist(profileFile);
        } else {
            em.merge(profileFile);
        }
    }
}
