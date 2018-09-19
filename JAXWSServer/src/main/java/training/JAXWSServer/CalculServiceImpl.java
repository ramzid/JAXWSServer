package training.JAXWSServer;
import javax.jws.WebService;

@WebService(endpointInterface="training.JAXWSServer.ICalculService")
public class CalculServiceImpl implements ICalculService {

	public int add(int number1, int number2) {
		int result=number1+number2;
		// TODO Auto-generated method stub
		return result;
	}

}
