package com.mysandbox.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private static List<Entity> list;

	public static void main(String[] args) {
		
		list = new ArrayList<Entity>();
		String code[] = {"1", "2", "3", "4", "5", 
				"6", "7", "A", "B", "X", };
		
		for (int i = 0; i < 10; i++) {
			Entity entity = new Entity();
			entity.setCode(code[i]);
			entity.setName("name" + entity.getCode());
			list.add(entity);
		}

		System.out.println("before sort ------------------------");
		for (Entity ent : list) {
			System.out.println(ent.getCode() + ":" + ent.getName());
		}
		
		Collections.sort(list, new Comparator<Entity>(){
			@Override
			public int compare(Entity o1, Entity o2) {
				char code1 = o1.getCode().toCharArray()[0];
				char code2 = o2.getCode().toCharArray()[0];
				
				return Character.compare(code1, code2) * -1;
			}
		});
		
		System.out.println("sorted ------------------------");
		for (Entity ent : list) {
			System.out.println(ent.getCode() + ":" + ent.getName());
		}
	}
}
