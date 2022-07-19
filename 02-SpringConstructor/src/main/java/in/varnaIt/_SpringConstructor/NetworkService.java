package in.varnaIt._SpringConstructor;

public class NetworkService {
	private String ip;
	private NetworkAdapter adapter;
	public NetworkService(String ip, NetworkAdapter adapter) {
		super();
		this.ip = ip;
		this.adapter = adapter;
	}
	public void connect() {
		
		System.out.println("This system is connected to :" + this.ip + "with port : " + "adapter");
	}
	
public void disconnect() {
		
		System.out.println("This system is disconnected from :" + this.ip + "with port : " + "adapter");
	}

}
