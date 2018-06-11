package cn.itcast.ws.server.test;

import cn.itcast.ws.server.MyWebServer;
import cn.itcast.ws.server.MyWebServerService;

public class Demo {

	public static void main(String[] args) {
		MyWebServerService mss=new MyWebServerService();
		MyWebServer port = mss.getMyWebServerPort();
		String str = port.echo("hello welcome to beijing");
		System.out.println(str);
	}
}
