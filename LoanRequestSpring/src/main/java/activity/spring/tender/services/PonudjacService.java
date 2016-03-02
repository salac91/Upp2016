package activity.spring.tender.services;

import activiti.spring.tender.entity.Ponudjac;

public interface PonudjacService {

	public Ponudjac findPonudjac(int id);
	public Ponudjac createPonudjac(Ponudjac data);
}
