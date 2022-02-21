package services;

import com.weaver.weaverminds.dto.ResisterDTO;

import dao.DetailsDAO;
import entity.DetailsEntity;

@Service
public class RegisterServiceImpl  implements RegisterService {

	@Autowired
	DetailsDAO dao;

	public String validateAndSave(ResisterDTO dto) {
		System.out.println("invoking validateAndSave()");
		String msg = null;

		DetailsEntity entity1 = dao.getByMail(dto.getEmailAddress());
		if (entity1 == null) {
			DetailsEntity entity = new DetailsEntity();
			BeanUtils.copyProperties(dto, entity);

			msg = dao.save(entity);
		} else {
			msg = "emailId Exist ";
		}
		return msg;
	}

}
