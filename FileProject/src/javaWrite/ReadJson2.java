package javaWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJson2 {
	//data.json 파일에서 성별이 남자고 Id 값이 3의 배수인 사람만 조회한다.

	public static void main(String[] args) {
		File file = new File("data.json");
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String r = new String();
			
			while(true) {
				String s = br.readLine();
				if( s == null ) break;
				r += s;
			}
			JSONArray arr = new JSONArray(r); //json으로 바꾼부분
			for (int i = 0; i < arr.length(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				if(obj.get("gender").equals("Male") && obj.getInt("id") % 3 == 0 ){
					System.out.println(obj.get("id")+ " " + obj.get("first_name")+ " " +obj.get("last_name")+ " " + obj.get("gender")+ " " + obj.get("ip_address")+" " + obj.get("email"));					
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}
	

}
