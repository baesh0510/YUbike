package jj17.yubicycle.util;

import java.io.*;

/**
 * RFID를 받아오는 소스를 입력한다
 * @author Administrator
 *
 */
public class getRFIDvalue {	

	public String getUid() {
		try{
			System.out.println("try시작");
			Process p = Runtime.getRuntime().exec("python Read.py");
			BufferedReader in = new BufferedReader (new InputStreamReader(p.getInputStream()));
			String uid = in.readLine();
			System.out.println("uid : "+uid);
			System.out.println("try종료");
			return uid;
		}catch (Exception e) {
			System.out.println("catch시작");
		}
		return null;
	}
}