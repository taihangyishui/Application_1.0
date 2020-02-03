package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=30;
    public void bigger(View v){     // 按钮对应的 onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextSize(++size);       // 修改对象的字符大小-size
    }

    public void display(View v){     // 另外一个按钮对应的 onclick 响应
        EditText name= (EditText) findViewById(R.id.name);  //还是根据ID找到对象，并进行接下来的操作
        TextView text2= (TextView) findViewById(R.id.txv);

        text2.setText(name.getText().toString());   // 设置字符
    }
    public void resetSize(View v){
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        int sizeYuan=10;
        txv.setTextSize(sizeYuan);       // 修改对象的字符大小-size
        txv.setTextColor(Color.BLUE);
    }

    //版权声明：本文为CSDN博主「herr_kun」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
    //原文链接：https://blog.csdn.net/herr_kun/article/details/84146462
}
