package EnjoyYuanModel;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

	private Map<String, Website> ws = new HashMap<>();

	// �����վ����
	public Website gainWebsite(String key) {
		if (!ws.containsKey(key)) {
			Website website = new concreteWebstite();
			website.setName(key);
			ws.put(key, website);
		}
		return ws.get(key);
	}

	public  int getCount(){
		return ws.size();
	}
}
