package org.dlea.match;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class MatchService {

    @Inject
    EntityManager em;

    @Transactional
    public Long createMatch(Match matchToBeCreated) {
        em.persist(matchToBeCreated);
        return matchToBeCreated.getId();
    }
}
