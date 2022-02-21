package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.DetailsEntity;

public class DetailsDAOImpl  implements DetailsDAO{
	
	@Autowired
	SessionFactory factoryBean;

	public String save(DetailsEntity detailsEntity) {
		Session session=factoryBean.openSession();
	Transaction transaction	=session.beginTransaction();
	session.save(detailsEntity);
	transaction.commit();
	session.close();
	
		return "";
	}

	public DetailsEntity getByMail(String emailAddress) {
		Session session=factoryBean.openSession();
//		session.get(ResisterDTO.class,emailAddress );
		Query query = session.createQuery("from DetailsEntity where emailAddress=:email");
		query.setParameter("email", emailAddress);
	DetailsEntity detailsEntity	=(DetailsEntity) query.uniqueResult();
		session.close();
		return detailsEntity;
	

}}
