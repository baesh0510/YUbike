package jj17.yubicycle.util;

import java.io.*;

/**
 * RFID�� �޾ƿ��� �ҽ��� �Է��Ѵ�
 * @author Administrator
 *
 */
public class getRFIDvalue {	

	public String getUid() {
		try{
			System.out.println("try����");
			Process p = Runtime.getRuntime().exec("python Read.py");
			BufferedReader in = new BufferedReader (new InputStreamReader(p.getInputStream()));
			String uid = in.readLine();
			System.out.println("uid : "+uid);
			System.out.println("try����");
			return uid;
		}catch (Exception e) {
			System.out.println("catch����");
		}
		return null;
	}
}