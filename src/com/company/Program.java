package com.company;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        //khoi tao du lieu
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Phòng A";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Phòng A";

        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Phòng số 3";

        Department[] departments = {department1, department2, department3};

        //Cau 1:
//        Cau1(department1);

        //Cau 2:
//        Cau2(departments);

        //Câu 3:
//        Cau3(department1);

        //Câu 4:
//        Cau4(department1);

        //Câu 5:
        Cau5(department1, department3);
    }

    public static void Cau1(Department department){
        System.out.println(department.toString());
    }

    public static void Cau2(Department[] departments){
        for (Department d : departments) {
            System.out.println(d);
        }
    }

    public static void Cau3(Department department){
        System.out.println(department.hashCode());
    }

    public static void Cau4(Department department){
        if(department.departmentName.equals("Phòng A")){
            System.out.println("Đúng là Phòng A");
        } else {
            System.out.println("Không phải Phòng A");
        }
    }

    public static void Cau5(Department department1, Department department2){
        if(department1.equals(department2)){
            System.out.println("Hai phòng ban bằng nhau");
        } else {
            System.out.println("Hai phòng ban khác nhau");
        }
    }
}
