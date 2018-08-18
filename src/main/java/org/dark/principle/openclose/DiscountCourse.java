package org.dark.principle.openclose;

import lombok.Data;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午3:01
 */
@Data
public class DiscountCourse implements Course{
    private Course course;

    private double discount;

    public DiscountCourse(Course course, double discount) {
        this.course = course;
        this.discount = discount;
    }

    @Override
    public int getId() {
        return course.getId();
    }

    @Override
    public String getName() {
        return course.getName();
    }

    @Override
    public double getPrice() {
        return course.getPrice() * this.discount;
    }
}
