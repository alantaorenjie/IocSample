package com.trj.bindview;

import android.app.Activity;

/**
 * Created by TRJ on 2017/9/7.
 * Description:
 */

public class Ioc {
    public static void inject(Activity activity) {
        inject(activity, activity);
    }

    public static void inject(Object host, Object root) {
        Class<?> clazz = host.getClass();
        String proxyClassFullName = clazz.getName() + "$$ViewInjector";
        //省略try,catch相关代码
        try {
            Class<?> proxyClazz = Class.forName(proxyClassFullName);
            ViewInjector viewInjector = (ViewInjector) proxyClazz.newInstance();
            viewInjector.inject(host, root);
        } catch (Exception e) {
        }
    }
}
