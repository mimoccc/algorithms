package sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public  class SortTest {
	
	
	protected Integer array[];
	
	@Before
	public void init(){
		array = new Integer[20];
		Random random = new Random(new Date().getTime());
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
	}
	
	
	
	@Test
	public void selectTest(){
		SelectionSort ss = new SelectionSort();
		ss.sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	
	@Test
	public void insertTest(){
		InsertSort ss = new InsertSort();
		ss.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
