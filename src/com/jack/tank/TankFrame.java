package com.jack.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author fztomaster
 * tank 窗体类
 */
public class TankFrame extends Frame {

    Tank myTank;
    Tank enemies;


    public TankFrame() {
        this.setTitle("tank war");
        this.setLocation(400, 100);
        this.setSize(800, 600);
        // 添加键盘监听事件
        this.addKeyListener(new TankKeyListener());
        myTank = new Tank(50, 50, Dir.R);
        enemies = new Tank(100, 100, Dir.D);
    }

    /**
     * 绘画方法
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
        enemies.paint(g);
    }

    /**
     * 继承KeyAdapter类，只需要继承想继承的方法
     */
    private class TankKeyListener extends KeyAdapter {

        /**
         * 键盘按下事件
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            myTank.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            myTank.keyReleased(e);
        }
    }
}
