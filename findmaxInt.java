import java.util.*;

public class findmaxInt {
    public int findMax() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<Integer>();
        System.out.println("Enter two values in list");
        for(int i = 0;i<2;++i){
            int j = sc.nextInt();
            list1.add(j);
        }
        int max = list1.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        sc.close();
        return max;
    }

    public static void main(String[] args){
       findmaxInt obj = new findmaxInt();
      int max = obj.findMax();
      System.out.print("Max interger is :" + max);
    }
}
