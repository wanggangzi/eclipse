package cn.com.webxml.test;

import java.net.URL;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class Demo {

	public static void main(String[] args) throws Exception {
		MobileCodeWS ws = new MobileCodeWS(new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx"));
		MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
		String info = soap.getMobileCodeInfo("1553459", "");
		System.out.println(info);
	}
}
