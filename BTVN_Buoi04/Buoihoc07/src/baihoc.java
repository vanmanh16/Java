import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baihoc {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        //nguyen thuy: int, float, double, char
//        //wrapper: Interger, Floayt, Double, Character
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        for(int i = 0; i < list.size(); i++){
//            System.out.print(list.get(i) + " ");
//        }
//        for(Integer i :list){
//            System.out.print(i + " ");
//        }
//        System.out.print("List.size: " + list.size());
//        list.add(4);
//        System.out.print(list.size());
//        list.add(1,5);
//        for(Integer i : list) {
//            System.out.print(i + " ");
//        }
//        list2.add(11);
//        list.addAll(list2);
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(Integer i = 0; i<n; i++){
//            int x = sc.nextInt();
//            list.add(x);
//        }
//        for (Integer i : list){
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");
//        System.out.print(list.contains(100));
//        System.out.print(list.containsAll(list2));
//        List<Integer> list3 = new ArrayList<>();
//        System.out.print(list.retainAll(list2));
//        list2.add(10);
//        list2.add(11);
////        for (Integer i : list2){
////            System.out.print(i + " ");
////        }
//        System.out.println("abc");
//        System.out.println(list2.size());
//        for(int i=0;i<list2.size();i++){
//            System.out.print(list2.get(i)+" ");
//        }

        Sinhvien sinhviens = new Sinhvien();
        sinhviens.setAge(16);
        System.out.println(sinhviens.getAge());

        Nhanvien nhanvien = new Nhanvien();
        nhanvien.setMaNhanvien("manh16");
        System.out.println(nhanvien.getMaNhanvien());


    }
}
//add, addAll
//size
//removeAll: xoa cac phan tu cung thuoc 2 mang
//retainAll:
//get: