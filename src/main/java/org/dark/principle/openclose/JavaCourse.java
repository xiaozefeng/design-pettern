package org.dark.principle.openclose;

import lombok.Data;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午2:46
 */
@Data
public class JavaCourse implements Course {
    private int id;

    private String name;

    private double price;

    public JavaCourse(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
