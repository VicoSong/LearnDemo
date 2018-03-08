package com.swk.librarymanagerdemo.Compz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JComboBox;

import com.swk.librarymanagerdemo.dao.Dao;
import com.swk.librarymanagerdemo.dao.SQLMethod;
import com.swk.librarymanagerdemo.model.BookType;

public class MapPz {
	static Map map = new HashMap();

	public static Map getMap() {
		List list = SQLMethod.selectBookCategory();
		for (int i = 0; i < list.size(); i++) {
			BookType booktype = (BookType) list.get(i);

			Item item = new Item();
			item.setId(booktype.getBookTypeID());
			item.setName(booktype.getTypeName());
			map.put(item.getId(), item);

		}
		return map;
	}
}
