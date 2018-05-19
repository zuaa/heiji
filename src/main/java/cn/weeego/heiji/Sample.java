package cn.weeego.heiji;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import java.util.HashMap;

public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "11264241";
    public static final String API_KEY = "MAhi1rZBVwskkDwhirsqakNK";
    public static final String SECRET_KEY = "mPfE3bbrZIE1381Q1eOtwxWcGDmtNSYz";

    public static void main(String[] args) {
        // 初始化一个AipSpeech
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);


        // 调用接口
        String path = "x:/temp/1.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
        System.out.println(res );
    }
}
