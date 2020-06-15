package fe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import doa.Human;

public class FileClass {
	private File file;

	public FileClass(String filename) {
		file = new File("/Users/simseongbo/Downloads/tmp/" + filename + ".txt");
	}

	public void createFile() {
		try {
			if (file.createNewFile()) {
				System.out.println("파일생성성공");
			} else {
				System.out.println("파일생성실패");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> loadData () throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> list = new ArrayList<String>();
		String str="";
		while((str =br.readLine())!=null) {
			list.add(str);
			
			
		}
		br.close();
		
			return list ;
		}
	
public void saveData(ArrayList<Human> datas)	{
		
	try {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		for (int i = 0; i < datas.size(); i++) {
			pw.println(datas.get(i));
			
		}
		pw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("파일에 저장되었습니다");
	
}
		
		
		
		
}
	


