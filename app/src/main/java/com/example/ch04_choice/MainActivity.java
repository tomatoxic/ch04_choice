package com.example.ch04_choice;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoOreo, rdoPie, rdoQ;
    Button btnExit, btnHome;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 버전 고르기");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (Switch) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoOreo = (RadioButton) findViewById(R.id.RdoOreo);
        rdoPie = (RadioButton) findViewById(R.id.RdoPie);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);

        btnExit = (Button) findViewById(R.id.BtnExit);
        btnHome = (Button) findViewById(R.id.BtnHome);
        imgAndroid = (ImageView) findViewById(R.id.ImgAndroid);

        chkAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkAgree.isChecked()) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgAndroid.setVisibility(View.VISIBLE);
                    btnExit.setVisibility(View.VISIBLE);
                    btnHome.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnExit.setVisibility(View.INVISIBLE);
                    btnHome.setVisibility(View.INVISIBLE);
                    imgAndroid.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.RdoOreo:
                        imgAndroid.setImageResource(R.drawable.oreo);
                        break;
                    case R.id.RdoPie:
                        imgAndroid.setImageResource(R.drawable.pie);
                        break;
                    case R.id.RdoQ:
                        imgAndroid.setImageResource(R.drawable.q10);
                        break;
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkAgree.setChecked(false);
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                btnExit.setVisibility(View.INVISIBLE);
                btnHome.setVisibility(View.INVISIBLE);
                imgAndroid.setVisibility(View.INVISIBLE);
            }
        });
    }
}