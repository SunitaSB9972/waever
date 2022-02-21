package services;

import com.weaver.weaverminds.dto.ResisterDTO;

public interface RegisterService {
	
	String validateAndSave(ResisterDTO dto);

}
