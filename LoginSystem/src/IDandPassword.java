import java.util.HashMap;

public class IDandPassword {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPassword(){
		logininfo.put("Sin","pass");
		logininfo.put("map","pas");
		logininfo.put("Sid","pasword");
	}
	
	protected HashMap getLogininfo() {
		return logininfo;
		
	}
}
