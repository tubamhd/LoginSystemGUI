import java.util.HashMap;

public class IDandPassword {

    HashMap <String, String> loginInfo = new HashMap<String, String>();

    IDandPassword(){
        loginInfo.put("Sophia", "hello");
        loginInfo.put("Daniel", "abc123");
        loginInfo.put("Brian", "aaa123");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
