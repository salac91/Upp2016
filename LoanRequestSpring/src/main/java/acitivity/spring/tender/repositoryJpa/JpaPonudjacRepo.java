package acitivity.spring.tender.repositoryJpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import activiti.spring.tender.entity.Ponudjac;
import activity.spring.tender.repository.PonudjacRepo;

@Repository
public class JpaPonudjacRepo implements PonudjacRepo {
	
	@PersistenceContext
	private EntityManager em;

	public Ponudjac findPonudjac(int id) {
		return em.find(Ponudjac.class, id);
	}

	public Ponudjac createPonudjac(Ponudjac data) {
		em.persist(data);
		return data;
	}

}