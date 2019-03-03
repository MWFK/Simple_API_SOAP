//de soap vers wsdl

package entities;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Remote
@WebService(targetNamespace="http://faceDetect.tn",name="fac")
public interface ServiceVisageRemote {
	
	@WebResult(name="Visage")
	Visage getVisageById(@WebParam(name="id")int id);
	
	@WebResult(name="age")
	String getAgeVisage(@WebParam(name="id")int id);
	
	@WebResult(name="gender")
	Visage getImageByGender(@WebParam(name="gender")String gender);

}
