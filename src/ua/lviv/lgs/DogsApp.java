package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.WriteAbortedException;
import java.lang.reflect.Field;
import java.util.Arrays;

public class DogsApp  {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		getAnnotFields(Dogs.class);
		
		

		
	}
	public static void getAnnotFields (Class <Dogs> dog) throws NotSerializableException, IOException, ClassNotFoundException {
		Field[] fields = dog.getDeclaredFields();
		System.out.println(Arrays.toString(fields));
		MyList list = new MyList(fields);
		System.out.println(list.getList());
		try {
			File file = new File("newannotationsFields.txt");
			FileOutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(list);			
			oos.close();
		} catch (NotSerializableException e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
//		List<Field>  fieldList = new ArrayList<>();
//		File file = new File("annotationsFields.txt");
//		for(int i = 0; i < fields.length; i ++) {
//			Field field = fields[i];
//			if(field.getAnnotation(DogsAnnotation.class) instanceof DogsAnnotation) {
//				FileOutputStream os = new FileOutputStream(file);
//				ObjectOutputStream oos = new ObjectOutputStream(os);
//				oos.writeObject(field);			
//				oos.close();
//				fieldList.add( fields[i]);
//			}
//		}
//		System.out.println(fieldList);			
//		
		
		
		
	
	}

}
