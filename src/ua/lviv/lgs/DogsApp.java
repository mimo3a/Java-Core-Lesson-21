package ua.lviv.lgs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class DogsApp  {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		getAnnotFields(Dogs.class);
		
	}
	
	public  static void getAnnotFields (Class <?> dog) throws IOException, ClassNotFoundException {
		Field[] fields = dog.getDeclaredFields();
		File file = new File("annFields.txt");
		FileWriter fw = new FileWriter(file);
		
		for(int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			
			if(field.getDeclaredAnnotation(DogsAnnotation.class) instanceof DogsAnnotation) {
				String fileName = "-" + field.getName() + "-";
				fw.write(fileName);							
			}
		}
		fw.close();		
	}

}
