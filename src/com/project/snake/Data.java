package com.project.snake;

import javax.swing.*;
import java.net.URL;

public class Data {
    //头部图片
    public static URL headerUrl = Data.class.getResource("/images/header.png");//定位图片地址
    public static ImageIcon header = new ImageIcon(headerUrl);
    //头部：上下左右
    public static URL upUrl = Data.class.getResource("/images/up.png");
    public static URL downUrl = Data.class.getResource("/images/down.png");
    public static URL leftUrl = Data.class.getResource("/images/left.png");
    public static URL rightUrl = Data.class.getResource("/images/right.png");
    public static ImageIcon up = new ImageIcon(upUrl);
    public static ImageIcon down = new ImageIcon(downUrl);
    public static ImageIcon left = new ImageIcon(leftUrl);
    public static ImageIcon right = new ImageIcon(rightUrl);
    //身体
    public static URL bodyUrl = Data.class.getResource("/images/body.png");
    public static ImageIcon body = new ImageIcon(bodyUrl);
    //食物
    public static URL foodUrl = Data.class.getResource("/images/food.png");
    public static ImageIcon food = new ImageIcon(foodUrl);
    //炸弹
    public static URL bombUrl = Data.class.getResource("/images/bomb.png");
    public static ImageIcon bomb = new ImageIcon(bombUrl);
}
