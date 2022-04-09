package com.example.UIWidgetTest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 方式一
        //findViewById(R.id.button).setOnClickListener((v)->{
        //    // 添加点击事件的处理逻辑
        //});
        // 方式二
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                // 添加点击事件的处理逻辑
                // 获取edittext中输入的内容的字串
                //String inputStr = ((EditText) findViewById(R.id.edittext)).getText().toString();
                //Toast.makeText(this, inputStr, Toast.LENGTH_SHORT).show();

                //((ImageView) findViewById(R.id.iamgeview)).setImageResource(R.drawable.image_2);

                //ProgressBar progressBar = findViewById(R.id.progressbar);
                //if (progressBar.getVisibility() == View.VISIBLE) {
                //    progressBar.setVisibility(View.GONE);
                //} else {
                //    progressBar.setVisibility(View.VISIBLE);
                //}
                //progressBar.setProgress(progressBar.getProgress() >= progressBar.getMax() ? 0 : progressBar.getProgress() + 10);

                new AlertDialog.Builder(this)
                        .setTitle("this is dialog")
                        .setMessage("this is message")
                        .setCancelable(false)
                        .setPositiveButton("OK", this)
                        .setNegativeButton("CANCLE", this)
                        .show();
            default:
                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        //添加dialog的点击事件
    }
}