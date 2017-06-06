import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import Dto.Hoge;
import Dto.SubHoge;

public class RefMain {

	public static void main(String[] args) throws Exception {
		Hoge h = new Hoge();
		// ReflectionUtil.output(h);
		//
		// ReflectionUtil.sortFld(h);

		h.setName("name");
		h.setValue(1);

		SubHoge subHoge = new SubHoge();
		subHoge.setSubname("subname");
		subHoge.setSubvalue(1);
		h.setSubHoge(subHoge);

		SubHoge subHoge1 = new SubHoge();
		subHoge1.setSubname("subname1");
		subHoge1.setSubvalue(1);

		SubHoge subHoge2 = new SubHoge();
		subHoge2.setSubname("subname2");
		subHoge2.setSubvalue(2);
		List<SubHoge> subHogeList = new ArrayList<SubHoge>();
		subHogeList.add(subHoge1);
		subHogeList.add(subHoge2);
		h.setSubHogeList(subHogeList);

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		h.setIntList(intList);

		List<List<Integer>> intList2 = new ArrayList<List<Integer>>();
		intList2.add(intList);

//		Field field = h.getClass().getDeclaredField("intList2");
//		boolean ret = ReflectionUtil.isNumber(field.getType(), h, field);
//System.out.println("ret=" + ret);


		Field[] fields = ReflectionUtil.sortFld2(h);
		ReflectionUtil.getFldData(h, fields);

	}

}
