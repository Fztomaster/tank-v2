package com.jack.tank;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author fztomaster
 * tank类
 */
public class Tank {

    // 定义坐标值
    private int x = 100, y = 100;

    // 设置速度
    public static final int SPEED = 5;

    // 坦克方向
    private Dir dir;

    private boolean bL, bU, bR, bD;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    /**
     * 绘画方法，g是画笔，可以绘画tank
     * @param g
     */
    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
        move();
    }

    /**
     * 键盘按下
     * @param e
     */
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT :
                bL = true;
                break;
            case KeyEvent.VK_UP :
                bU = true;
                break;
            case KeyEvent.VK_RIGHT :
                bR = true;
                break;
            case KeyEvent.VK_DOWN :
                bD = true;
                break;
        }
        
        setMainDir();

    }

    /**
     * 键盘弹起
     * @param e
     */
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT :
                bL = false;
                break;
            case KeyEvent.VK_UP :
                bU = false;
                break;
            case KeyEvent.VK_RIGHT :
                bR = false;
                break;
            case KeyEvent.VK_DOWN :
                bD = false;
                break;
        }
    }

    /**
     * 计算坦克方向
     */
    private void setMainDir() {
        if (!bL && !bU && !bR && !bD) {
            dir = Dir.STOP;
        }
        if (bL && !bU && !bR && !bD) {
            dir = Dir.L;
        }
        if (!bL && bU && !bR && !bD) {
            dir = Dir.U;
        }
        if (!bL && !bU && bR && !bD) {
            dir = Dir.R;
        }
        if (!bL && !bU && !bR && bD) {
            dir = Dir.D;
        }
    }

    /**
     * 坦克移动
     */
    private void move() {
        switch (dir) {
            case L:
                x -= SPEED;
                break;
            case U:
                y -= SPEED;
                break;
            case R:
                x += SPEED;
                break;
            case D:
                y += SPEED;
                break;
        }
    }

}
