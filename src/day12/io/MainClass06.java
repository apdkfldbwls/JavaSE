package day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * [[ Try-with-resources ]]
 * 	 try 코드 블록이 끝나면 자동으로 resources를 종료해주는 기능이다.
 * 
 * 	 AutoCloseable 상속받은 resources만 가능!
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		File f1 = null;
		File f2 = null;
		
		try {
			// upload3 폴더 생성
			f1 = new File("./upload3");
			f1.mkdir();
			
			// hello5.txt 파일 생성
			f2 = new File(f1, "hello5.txt");
			f2.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(	// 자동으로 close 해준다.
				FileInputStream fis = new FileInputStream("./upload/hello.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(f2);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos, true);
		) {
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush();
			
			ps.println();
			ps.println("**************************");
			ps.println("Try-with-resources 테스트 중입니다.");
			ps.println("**************************");
			
			System.out.println("실행 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}








