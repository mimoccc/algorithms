package sort;

/**
 * 
 * 
 * 插入排序
 * 
 * @author flatychen
 * 
 */
public class InsertSort extends AbstractSort implements Sortable {

	public void sort(Comparable [] c) {
		Comparable currentObj = null;
		for (int currentPos = 1; currentPos < c.length; currentPos++) {
			currentObj = c[currentPos];
			int j = currentPos;
			// find the  right position
			for ( ; j > 0 ; j--) {
				if (super.less(currentObj, c[j-1]))
					c[j] = c[j-1];
				else break;
			}
			// insert 
			c[j] = currentObj;
		}

	}
	
	
	
	

}
