package com.example.sam.intentmessage;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Sam on 8/17/2014.
 */
public class BaseIntent extends Intent {
    private String source;
    private static final String sourceKey="i am from";
    public BaseIntent(Class<?> currentClass,Context context,Class<?> distension){
        super(context,distension);
        source=currentClass.getSimpleName();
        putExtra(sourceKey,source);
    }
    public static String getSource(Intent intent){
        String from= intent.getExtras().getString(sourceKey);
        return from!=null?from:"";
    }
}
