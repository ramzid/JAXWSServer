package training.JAXWSServer;
import javax.xml.ws.Endpoint;

public class CalculPublisher {
	public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new CalculServiceImpl());
        
        endpoint.publish("http://localhost:8888/ws/add");
 
    }
 
}
