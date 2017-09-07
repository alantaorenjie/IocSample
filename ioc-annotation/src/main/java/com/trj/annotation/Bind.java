package com.trj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by TRJ on 2017/9/7.
 * Description:
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface Bind
{
    int value();
}
