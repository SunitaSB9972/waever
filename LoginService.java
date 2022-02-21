package services;

import com.weaver.weaverminds.dto.LoginDTO1;

public interface LoginService {
	public boolean validateAndLogin(LoginDTO1 dto);

}
