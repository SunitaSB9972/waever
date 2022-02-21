package dao;

import entity.DetailsEntity;

public interface DetailsDAO {

	String save(DetailsEntity detailsEntity) ;
	DetailsEntity getByMail(String string);
	
}
