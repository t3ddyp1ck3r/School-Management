package service;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PayService {
	
	public List<Students> read() throws IOException {
		
		BufferedReader br = new BufferedReader  (new FileReader("C:\\Users\\Administrator\\Downloads\\Java Application Development\\students.csv"));

			String line = null;
			String splitBy = ",";
			List<String> students = new ArrayList<>();
			int count = 0;
			if (count != 0) {
				while((line = br.readLine())!= null) {
					if(count != 0) { //This is to keep count of the CSV rows
						Students student = new Students();
						String[] studentList = line.split(splitBy);
						student.setStudId(studentList[0].trim());
						student.setName(studentList[1].trim());
						student.setDepartment(studentList[2].trim());
						String age =studentList[4].trim();
						age = ((Integer.valueOf(studentList[4].trim()))) >=19) ?
								Integer.valueOf(studentList[4].trim()):(0);
					
						}
						String CSV = studentList[4].trim();
						String[] values = CSV.split(",");
						//System.out,println(Arrays.toString(values));
						student.setCourse(Arrays.asList(values));
					}
				}
			}
		
	}
	
	br.close();
	fread.close();		
	} catch (IOException ex) {
		ex.printStackTrace();
	}
}