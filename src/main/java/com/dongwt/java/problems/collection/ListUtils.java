package com.dongwt.java.problems.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * list工具方法
 * @author dongwt
 *
 */
public class ListUtils {
	
	
	public static <T> List<T> removeDuplicate1(List<T> lists){
		HashSet<T> sets = new HashSet<T>(lists);
		List<T> result = new LinkedList<T>();
		result.addAll(sets);
		return result;
	} 
	
	public static <T> List<T> removeDuplicate2(List<T> lists){
		List<T> result = new LinkedList<T>();
		Iterator<T>  iterator = lists.iterator();
		
		while (iterator.hasNext()) {
			T t = (T) iterator.next();
			if(result.contains(t)){
				iterator.remove();
			}else{
				result.add(t);
			}
		}
		
		return result;
	}

}
