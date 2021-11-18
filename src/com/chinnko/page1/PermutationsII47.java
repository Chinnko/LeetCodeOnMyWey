package page1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationsII47 {
    public static void main(String[] args) {
        System.out.println(new PermutationsII47().permuteUnique(new int[]{1, 1, 3}));
    }

    HashSet<List<Integer>> objects = new HashSet<>();


    public List<List<Integer>> permuteUnique(int[] nums) {
        orderPoint(new ArrayList<>(), nums);
        ArrayList<List<Integer>> objects = new ArrayList<>();
        for (List<Integer> object : this.objects) {
            objects.add(object);
        }
        return objects;
    }

    public void orderPoint(List<Integer> integers, int[] num) {
        if (integers.size() == num.length) {
            ArrayList<Integer> objects = new ArrayList<>();
            for (Integer integer : integers) {
                objects.add(num[integer]);
            }
            this.objects.add(objects);
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (integers.contains(i)) {
                continue;
            }
            integers.add(i);

            orderPoint(integers, num);

            integers.remove(integers.size() - 1);
        }
    }
}
