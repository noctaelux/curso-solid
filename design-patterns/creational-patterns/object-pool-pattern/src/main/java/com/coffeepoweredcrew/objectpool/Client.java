package com.coffeepoweredcrew.objectpool;

import javafx.geometry.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()->new Bitmap("logo.bmp"),3);

    public static void main(String[] args) {

        Bitmap bitmap1 = bitmapPool.get();
        Bitmap bitmap2 = bitmapPool.get();
        Bitmap bitmap3 = bitmapPool.get();

        bitmap1.setLocation(new Point2D(10,10));
        bitmap2.setLocation(new Point2D(-10,-2));
        bitmap3.setLocation(new Point2D(-20,0));

        bitmap1.draw();
        bitmap2.draw();
        bitmap3.draw();

        bitmapPool.release(bitmap1);
        bitmapPool.release(bitmap2);
        bitmapPool.release(bitmap3);

        Bitmap bitmap4 = bitmapPool.get();
        bitmap4.setLocation(new Point2D(3,20));
        bitmap4.draw();
        bitmapPool.release(bitmap4);

    }
}
