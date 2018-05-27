package io.huangbaixun.springbootstarter.hello;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
	@RequestMapping("/hello")
	public String SayHi()
	{
		String ip ="";
		try {
			InetAddress addr = InetAddress.getLocalHost();
			ip= addr.getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Hi from "+ip;
	}
	
}
