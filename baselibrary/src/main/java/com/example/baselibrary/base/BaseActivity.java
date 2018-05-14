package com.example.baselibrary.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.baselibrary.R;
import com.example.baselibrary.ioc.ViewUtils;

/**
 * 基础类，规范方法的命名和使用
 * Created by sn on 2018/5/14.
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        ViewUtils.inject(this);
        initTitle();
        initView();
        initListeners();
        initData();
    }


    //加载布局文件
    public abstract void setContentView();


    //初始化布局，查找id
    public abstract void initView();


    //初始化监听器，注册监听器
    public abstract void initListeners();


    //初始化基本数据，活动初始化使用的数据
    public abstract void initData();


    //初始化头部
    public abstract void initTitle();


    //    启动activity
    public void startActivity(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "not activiy exits", Toast.LENGTH_SHORT).show();
        }

    }


    protected <T extends View> T viewById(int id) {
        return findViewById(id);
    }
}
