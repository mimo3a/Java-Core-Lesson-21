package ua.lviv.lgs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DogsApp  {
	public static void main(String[] args) throws IOException {
		getAnnotFields(Dogs.class);

		
	}
	public static void getAnnotFields (Class <Dogs> dog) throws IOException {
		Field[] fields = dog.getDeclaredFields();
		System.out.println(Arrays.toString(fields));
		List<Field>  fieldList = new ArrayList<>();
		for(int i = 0; i < fields.length; i ++) {
			if(!(fields[i].getAnnotation(DogsAnnotation.class) == null)) {
				fieldList.add( fields[i]);
			}
		}
		System.out.println(fieldList);			
		File file = new File("annotationsFields.txt");
		FileOutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(fieldList);			
		oos.close();
		
	
	}

}
