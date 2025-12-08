package day03.superMarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> appleBox = new ArrayList<>();
        ArrayList<Fruit> orangeBox = new ArrayList<>();
        ArrayList<Fruit> bananaBox = new ArrayList<>();

        appleBox.add(new Apple("사과A", 30, "금색"));
        appleBox.add(new Apple("사과B", 10, "다홍색"));
        appleBox.add(new Apple("사과C", 20, "빨간색"));
        orangeBox.add(new Orange("오렌지A", 10, "초록색"));
        orangeBox.add(new Orange("오렌지B", 10, "노란색"));
        orangeBox.add(new Orange("오렌지C", 20, "주황색"));
        bananaBox.add(new Banana("바나나A", 15, "노란색"));
        bananaBox.add(new Banana("바나나B", 20, "초록색"));
        bananaBox.add(new Banana("바나나C", 40, "주황색"));


        // HashMap<key, value>
        HashMap<Integer, ArrayList<Fruit>> map = new HashMap();
        map.put(1, appleBox);
        map.put(2, orangeBox);
        map.put(3, bananaBox);

        map.get(2).forEach((v) -> v.getInfo());
        map.get(1).forEach((v) -> v.getInfo());
//        HashSet<String> test = new HashSet<>();
//        test.add("안녕");
//        test.add("안녕하세요");
//        test.add("안녕하살법");
//        test.add("안녕하세요");
//        test.add("안녕하지마세요");
//        test.add("안녕할뻔");
//        test.add("안녕할뻔");
//
//        // Arraylist vs. HashSet
//        // 중복&순서 O vs 중복&순서 X
//        Iterator it = test.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
