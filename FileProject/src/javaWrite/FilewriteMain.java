package javaWrite;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilewriteMain {

	public static void main(String[] args) {
		//1 파일 오픈
		File file = new File("write.txt");
		//2 스트림 생성(입력/출력)
		FileWriter fw = null; //전역 변수로 만들어주기 위해서 fileWriter를 밖에서 선언해준다.
		PrintWriter pw =null;
		try {
			fw = new FileWriter(file); //한글에 유리하다
			//FileOutputStream fos;//바이트 기준(문자)
			pw = new PrintWriter(file);
			
			//3 입출력 수행
			pw.println("Hello Wolrd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//4 스트림 닫기
				if(pw != null )pw.close();
				if(fw != null )fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 

		
		
		
		
		
	}

}
