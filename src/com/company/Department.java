package com.company;

import java.util.Objects;

public class Department {
    int departmentId;
    String departmentName;

    @Override
    public String toString() {
        return "************* Department *************\n" +
                "DepartmentId: " + departmentId + "\n" +
                "DepartmentName: " + departmentName;
    }

    @Override
    public boolean equals(Object obj) {
        //Check obj truyền vào chính là cái cần mang đi so sánh
        if (this == obj) return true;

        //Check obj truyền vào là null hoặc khác type
        if (obj == null || getClass() != obj.getClass()) return false;

        //Check đối tượng truyền vào và đối tượng cần so sánh
        Department that = (Department) obj;
        return that.departmentName == departmentName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, departmentName);
    }
}
