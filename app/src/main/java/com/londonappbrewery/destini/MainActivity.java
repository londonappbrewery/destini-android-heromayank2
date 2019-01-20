package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button op1;
    Button op2;
    TextView tate;
    int flag=0;
    int flag2=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        tate=(TextView)findViewById(R.id.storyTextView);
        op1=(Button)findViewById(R.id.buttonTop);
        op2=(Button)findViewById(R.id.buttonBottom);
        tate.setText(R.string.T1_Story);
        op1.setText(R.string.T1_Ans1);
        op2.setText(R.string.T1_Ans2);
        flag=1;
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==1) {
                    tate.setText(R.string.T3_Story);
                    op1.setText(R.string.T3_Ans1);
                    op2.setText(R.string.T3_Ans2);
                    flag=2;
                }
                else if(flag==2){
                    tate.setText(R.string.T6_End);
                    op1.setVisibility(View.INVISIBLE);
                    op2.setVisibility(View.INVISIBLE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2==2){
                    tate.setText(R.string.T4_End);
                    op1.setVisibility(View.INVISIBLE);
                    op2.setVisibility(View.INVISIBLE);
                }
                else if (flag == 1) {
                    tate.setText(R.string.T2_Story);
                    op1.setText(R.string.T2_Ans1);
                    op2.setText(R.string.T2_Ans2);
                    flag=1;
                    flag2+=1;
                }
                else if(flag==2){
                    tate.setText(R.string.T5_End);
                    op1.setVisibility(View.INVISIBLE);
                    op2.setVisibility(View.INVISIBLE);
                }

            }
        });



    }
}
