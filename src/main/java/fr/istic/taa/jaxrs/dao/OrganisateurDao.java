package fr.istic.taa.jaxrs.dao;

import fr.istic.taa.jaxrs.domain.Organisateur;

public class OrganisateurDao extends AbstractJpaDao<Long, Organisateur> {
    public OrganisateurDao() {
        super(Organisateur.class);
    }
    
}
