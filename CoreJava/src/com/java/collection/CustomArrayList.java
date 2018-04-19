package com.java.collection;

import java.util.Arrays;

public class CustomArrayList {
	
private	static Object[] empty_Elements= {};
	
	private Object[] elementsData;
	
	private int size;
	
	public CustomArrayList() {
		this.elementsData=empty_Elements;
	}
	
	public CustomArrayList(int capacity) throws Exception {
		if(capacity>0) {
			this.elementsData=new Object[capacity];
		}else if(capacity==0) {
			this.elementsData=empty_Elements;
		}
		else {
			throw new Exception("Value is in Minus");
		}
	     
	}
	
	public boolean add(Object e) {
		capacityEnsurement(size+1);
		elementsData[size++] = e;
		return true;
	}
	
	public Object get(int index) {
		
		return elementsData[index];
	}
	public int size() {
		return size;
	}
	
	public Object remove(int index) {
		if(index<size) {
			Object obj=elementsData[index];
			elementsData[index]=null;
			int tmp=index;
			while(tmp<size-1) {
				elementsData[tmp]=elementsData[tmp+1];
				elementsData[tmp+1]=null;
				tmp++;
				
			}
			size--;
			return obj;
		}
		return null;
	}

	private void capacityEnsurement(int minCapacity) {
		if(this.elementsData==empty_Elements) {
			   minCapacity = Math.max(10, minCapacity);
		}
		ensureCapacity(minCapacity);
	}
	private void ensureCapacity(int minCapacity) {
		 if (minCapacity - elementsData.length > 0) {
			int newCapacity  = elementsData.length + (elementsData.length>>1);
			   if(newCapacity-minCapacity<0)
				   newCapacity=minCapacity;
			 elementsData = Arrays.copyOf(elementsData,newCapacity);
		 
		 }
	          //  grow(minCapacity);
		
	}

	public static void main(String[] args) {
		CustomArrayList arrayList=new CustomArrayList();
		System.out.println("Initial size "+arrayList.size);
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("DD");
		arrayList.add("n");
		System.out.println("After add size of array :"+arrayList.size());
		System.out.println("Remove value from arrayList "+arrayList.remove(4)+" size "+arrayList.size);
		
		System.out.println(arrayList.get(0));
		for(int i=0;i<arrayList.size;i++) {
			System.out.print(" "+arrayList.get(i));
		}
		

	}

}
