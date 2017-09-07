package com.trj.bindview;

/**
 * Created by TRJ on 2017/9/7.
 * Description:
 */

public interface ViewInjector<T> {
    void inject(T t,Object object);
}
