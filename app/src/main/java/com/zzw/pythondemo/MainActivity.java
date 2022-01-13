package com.zzw.pythondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etIP;
    private ImageView ivClear;
    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIP = findViewById(R.id.et_query);
        ivClear = findViewById(R.id.iv_clear);
        tvContent = findViewById(R.id.tv_content);

        initListener();
    }

    private void initListener() {
        findViewById(R.id.tv_query).setOnClickListener(this);
        ivClear.setOnClickListener(this);
        etIP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ivClear.setVisibility(TextUtils.isEmpty(s.toString()) ? View.INVISIBLE : View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tv_query) {

        } else if (id == R.id.iv_clear) {
            etIP.setText("");
        }
    }
}