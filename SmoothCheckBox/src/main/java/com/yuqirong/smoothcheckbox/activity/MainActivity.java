package com.yuqirong.smoothcheckbox.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.yuqirong.smoothcheckbox.R;
import com.yuqirong.smoothcheckbox.view.SmoothCheckBox;

public class MainActivity extends AppCompatActivity {

    private SmoothCheckBox checkBox;
    private SmoothCheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (SmoothCheckBox) findViewById(R.id.smoothCheckBox);
        checkBox2 = (SmoothCheckBox) findViewById(R.id.smoothCheckBox2);
        checkBox.setOnCheckedChangeListener(new SmoothCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SmoothCheckBox smoothCheckBox, boolean isChecked) {
                Toast.makeText(MainActivity.this,isChecked+"",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox.setChecked(!checkBox.isChecked());
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox2.setChecked(!checkBox2.isChecked(),true);
            }
        });

    }

}
