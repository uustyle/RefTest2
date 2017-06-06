import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import Dto.Hoge2;
import Dto.SubHoge;

public class RefMain2 {

	public static void main(String[] args) throws Exception {
		Hoge2 h = new Hoge2();

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

//		List<SubHoge> subHogeList = new ArrayList<SubHoge>();
//		subHogeList.add(subHoge1);
//		subHogeList.add(subHoge2);
//		h.setSubHogeList(subHogeList);

		System.out.println(h.toString());

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oout = new ObjectOutputStream(bout);

        // オブジェクトをシリアライズ
        oout.writeObject(h);

        oout.close();
        bout.close();

        // ちゃんとシリアライズされている
        System.out.println(Arrays.toString(bout.toByteArray()));

        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream oin = new ObjectInputStream(bin);

        // デシリアライズ
        Hoge2 h2 = (Hoge2) oin.readObject();

		System.out.println(h2.toString());


	}

}
