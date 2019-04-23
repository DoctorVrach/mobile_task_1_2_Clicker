package com.example.mobile_task_1_2_clicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button mainBtn2;
    Button mainBtn3;
    ImageButton mainImg;

    private long score = 0;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.button);
        mainBtn2 = (Button) findViewById(R.id.button2);
        mainBtn3 = (Button) findViewById(R.id.button3);
        mainImg=(ImageButton) findViewById(R.id.imageButton);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                if (Math.abs(score)<10 & 5>Math.abs(score) & Math.abs(score)>1 || Math.abs(score)<100 & Math.abs(score)>15 & 5>(Math.abs(score)%10) & (Math.abs(score)%10)>1)
                {
                    st=getString(R.string.a1);
                }
                else
                {
                    st=" ";
                }
                String s = getString(R.string.qq) + score + getString(R.string.qe) + st;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn.setOnClickListener(clickListener);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                if (Math.abs(score)<10 & 5>Math.abs(score) & Math.abs(score)>1 || Math.abs(score)<100 & Math.abs(score)>15 & 5>(Math.abs(score)%10) & (Math.abs(score)%10)>1)
                {
                    st=getString(R.string.a);
                }
                else
                {
                    st=" ";
                }
                String s = getString(R.string.qrr) + score + getString(R.string.qy) + st;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn2.setOnClickListener(clickListener2);

        View.OnClickListener clickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score =0;
                if (Math.abs(score)<10 & 5>Math.abs(score) & Math.abs(score)>1 || Math.abs(score)<100 & Math.abs(score)>15 & 5>(Math.abs(score)%10) & (Math.abs(score)%10)>1)
                {
                    st=getString(R.string.aa1);
                }
                else
                {
                    st=" ";
                }
                String s = getString(R.string.aa) + score + getString(R.string.as) + st;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn3.setOnClickListener(clickListener3);

        View.OnClickListener clickListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score =666;
                String s = "AVE SATAN" + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainImg.setOnClickListener(clickListener4);

    }
}

