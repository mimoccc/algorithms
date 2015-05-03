package sort;

import java.util.Random;

/**
 * 
 * 快速排序类
 * 
 * @author flatychen
 * 
 */
public  class QuickSort extends AbstractSort implements Sortable {

	@Override
	public void sort(Comparable[] c) {
		this.sort(c,0,c.length-1);
		
	}

	@Override
	public void sort(Comparable[] c, int off, int len) {
		if(off >= len) return;
		int x = this.partion2(c, off, len);
		this.sort(c,off,x-1);
		this.sort(c,x+1,len);
		
	}

	
	/**
	 * 大学数据结构  分割法
 	 * 
	 * @param c
	 * @param off
	 * @param len
	 * @return
	 * @author flatychen
	 */
	private int partion(Comparable[] c, int off, int len){
		// 使用第一个元素做分割点
		int pivot = off, i = off,j = len;
		Comparable cPivot = c[off];
		while( i<j ){
			// find the less
			while(c[j].compareTo(cPivot) >= 0 && i<j ) j--;
			if(i<j) c[i++] = c[j]; 
			// find the great
			while(c[i].compareTo(cPivot) <= 0 && i<j ) i++;
			if(i<j) c[j--] = c[i]; 
		}
		c[i] = cPivot;
		return i;
	}
	
	
	/**
	 * 算法一书分割法  JDK亦使用
	 * 
	 * @param c
	 * @param off
	 * @param len
	 * @return
	 * @author flatychen
	 */
	private int partion2(Comparable[] c, int off, int len){
		int x = off, i = off,j = len;
		while( i<j ){
			while(c[j].compareTo(c[x]) >= 0 && i<j ) j--;
			while(c[i].compareTo(c[x]) <= 0 && i<j ) i++;
			if(i<j) super.swap(c, i++, j--);
		}
		// 处理最后
		super.swap(c, x, i);
		return x;
	}
	

	/**
	 * 算法导论分割法 
	 * 
	 * @param c
	 * @param off
	 * @param len
	 * @return
	 * @author flatychen
	 */
	private int partion3(Comparable[] c, int off, int len){
		int x = off, i = off,j = len;
		while( i<j ){
			while(c[j].compareTo(c[x]) >= 0 && i<j ) j--;
			while(c[i].compareTo(c[x]) <= 0 && i<j ) i++;
			if(i<j) super.swap(c, i++, j--);
		}
		// 处理最后
		super.swap(c, x, i);
		return x;
	}
	
	
	
	private int getPivotPos(Comparable[] c, int off, int len) {
		return off;
	}

	
}
