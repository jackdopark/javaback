package javaWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJson3 {
	//city.list.json에 있는 내용 중 한국 도시마나 꺼내서 출

	public static void main(String[] args) {

		try {
			//밑에 두줄은 파일에 텍스트가 많을떄 검색시간을 줄이기 위해 쓰인다. 
			byte[] encode = Files.readAllBytes(Paths.get("city.list.json"));
			String r = new String(encode,"UTF-8");

			JSONArray arr = new JSONArray(r);
			for (int i = 0; i < arr.length(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				//System.out.println(Arrays.toString(JSONObject.getNames(obj)));
				if(obj.get("country").equals("KR")){
					JSONObject coord = obj.getJSONObject("coord");
					System.out.println(obj.get("id")+ " " + obj.get("name")+ " " 
				+obj.get("state")+ " " + obj.get("country")+ " (" +coord.getDouble("lon") +","+coord.getDouble("lat")+")" );
					
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
