//de soap vers wsdl


package entities;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService(targetNamespace="http://faceDetect.tn",serviceName="Envelope")
public class ServiceVisage implements ServiceVisageRemote{

	Visage v = new Visage(1,"25-32","photo","male",117);
	
	@Override
	public Visage getVisageById(int id) {
		// TODO Auto-generated method stub
		return v;
	}

	@Override
	public String getAgeVisage(int id) {
		// TODO Auto-generated method stub
		return "25-32";
	}

	@Override
	public Visage getImageByGender(String gender) {
		// TODO Auto-generated method stub
		return v;
	}

}
