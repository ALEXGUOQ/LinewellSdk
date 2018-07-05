package com.linewell.library;

import android.util.Log;

/**
 * @desc: E证通sdk
 * @author：gqy
 * @date：2018/7/4 22:53
 */
public class Linewell {
    private static Linewell mLinewell;

    private Linewell(){
    }

    public static Linewell getmLinewell() {
        if (mLinewell == null){
            synchronized (Linewell.class) {
                if (mLinewell == null) {
                    mLinewell = new Linewell();
                }
            }
        }
        return mLinewell;
    }

    public void init(){
        Log.i("s8", "this is init method");
    }

    public int test(){
        return 10;
    }

    public int sum(int a,int b){
        return a + b;
    }
}
