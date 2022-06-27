package javaWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 파일 오픈 - write.txt
		File file = new File("write.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//2. 스트림 생성 ,fileReader, bufferedReader
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//3. 파일 내용 읽기
			while(true) {
				String s = br.readLine();
				if(s == null) break;
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//4. 스트림 닫기
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
