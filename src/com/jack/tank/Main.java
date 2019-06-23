package com.jack.tank;

/**
 * @author fztomaster
 */
public class Main {

    public static void main(String[] args) {
        TankFrame tf = new TankFrame();
        // 设置窗体可见
        tf.setVisible(true);

        for (;;) {
            try {
                // 设置睡眠1000毫秒, 每隔1000秒调用repaint()方法
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 只要调用repaint()->update()->paint()
            tf.repaint();
        }
    }
}
