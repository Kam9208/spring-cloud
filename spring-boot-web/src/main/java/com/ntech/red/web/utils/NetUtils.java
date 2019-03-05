package com.ntech.red.web.utils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetUtils {

	public static boolean isLocalPortUsing(int port) {
		boolean flag = false;
		try {
			InetAddress address = InetAddress.getByName("127.0.0.1");
			Socket socket = new Socket(address,port);
			flag = true;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
