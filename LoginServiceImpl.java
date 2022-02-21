package services;

import com.weaver.weaverminds.dto.LoginDTO1;

import dao.DetailsDAO;
import entity.DetailsEntity;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	DetailsDAO dao;

	public boolean validateAndLogin(LoginDTO1 dto) {
		boolean make = true;
		DetailsEntity detailsEntity = dao.getByMail(dto.getEmail());
		if (detailsEntity != null) {
			if (detailsEntity.getPassword().equals(dto.getPass())) {
				System.out.println("password match");
				return make;
			}

			else {
				System.out.println("invalid password");
				return false;
			}

		} else {
			System.out.println("user not exist");
			return false;
		}

	}
}