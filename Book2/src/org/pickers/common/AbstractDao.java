package org.pickers.common;

import java.util.ArrayList;
import java.util.List;


public class AbstractDao<E extends PrimaryKey<T>, T> {

	private List<E> list = new ArrayList<E>();

	public void create(E obj) {
		list.add(obj);
	}

	public E read(T no) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getKey() == no) {
				return list.get(i);
			}

		}
		
		return null;

	}

	public void delete(T no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getKey() == no) {
				list.remove(i);
				break;
			}
		}
	}

	public List<E> list() {

		return list;

	}
	
}
