
package com.example.sn.enjoyjoke;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.ioc.*;


/**
 * Created by pc on 2018/4/25.
 */

public class MainActivity extends BaseActivity {


    private TextView textView;



    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        textView = findViewById(R.id.tv_Test);
    }

    @Override
    public void initListeners() {
      textView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(getBaseContext(),"weclome to come to annotion workd",Toast.LENGTH_SHORT).show();

          }
      });
    }

    @Override
    public void initData() {
        textView.setText("test the base");
    }

//    @OnClick(value = R.id.tv_Test)
//    private void onClick(View view){
//        Toast.makeText(getBaseContext(),"weclome to come to annotion workd",Toast.LENGTH_SHORT).show();
//    }
}