package ua.lviv.lgs;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MyList implements Serializable{
	private Field [] array;

	public MyList(Field[] array) {
		super();
		this.array = array;
	}
	public   Serializable getList () {
		List<Field> myList = new ArrayList<Field>();
		for (int i = 0; i < array.length; i++) {
			if(array[i].getAnnotation(DogsAnnotation.class) instanceof DogsAnnotation ) {
				myList.add(array[i]);
			}
		}
		
		return (Serializable) myList;
		
	}
	

}
