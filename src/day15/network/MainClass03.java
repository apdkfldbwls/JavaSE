package day15.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass03 {
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://n.news.naver.com/article/082/0001209735?ntype=RANKING");
		// URLConnection ��ü ����
		// 1. URLConnection�� ������ ��� ������ ���� �� �ִ�
		// 2. URLConnection�� ���ҽ�(HTML)�� ��Ʈ������ ���� �� �ִ�
		URLConnection urlConn = url.openConnection();
		
		// getHeaderFields() �޼���� ����� ������ Map���� ��ȯ
		// key - String, value - List<String>
		Map<String, List<String>> headMap = urlConn.getHeaderFields();
		
		Set<String> set = headMap.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { 
			String key = iterator.next();
			List<String> listValue = headMap.get(key);
			
			System.out.print(key + ": ");
			for(String values : listValue) {
				System.out.print(values + " ");
			}
			System.out.println();
		}
		
		// getInputStream() �޼ҵ�� URLConnection ���� �Է� ��Ʈ���� ��� �´�.
		InputStream in = urlConn.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
	}

}









