package com.gj.demo.java.annotation.demo1;

import java.awt.Point;

/**
 * Created by guanjian on 17-6-28.
 */

@DBTable("Member")
public class Member {

    @TableColumn
    private String name;

    @TableColumn(
            name = "id",
            constraints = @Constraints(primaryKey = true, unique = true))
    private int oooo;

    @TableColumn(
            property = PropertyType.TEXT,
            constraints = @Constraints(allowNull = false))
    private Point point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return oooo;
    }

    public void setId(int id) {
        this.oooo = id;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
