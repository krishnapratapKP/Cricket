package com.example.krishnapratap.cricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int run=0;
    private int ball=0;
    private  int wick=0;
    private  String in ;
    private  String ba="0";
    private  String k;
    private int l=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixRun(View view)
    {
        if(wick>9)
            return;
        run=run+6;
        display(run);

    }

    public void fourRun(View view)
    {
        if(wick>9)
            return;
        run=run+4;
        display(run);

    }

    public void threeRun(View view)
    {
        if(wick>9)
            return;
        run=run+3;
        display(run);

    }

    public void  twoRun(View view)
    {
        if(wick>9)
            return;
        run=run+2;
        display(run);

    }

    public void oneRun(View view)
    {
        if(wick>9)
            return;
        run=run+1;
        display(run);

    }

    public void oneBall(View view)
    {
        if(wick>9)
            return;
            ball= ball+1;
            if(ball<6)
            {
                in=""+ball;
                k=ba+"."+in;
            }
            else
            {
                ball=0;
                l++;
                ba=""+l;
                k=l+"."+0;
            }

             dispallball(k);
    }


    public void wickett(View view)
    {

        if(wick>9)
            return;
         wick++;

         displayWicket(wick);

    }

    private  void displayWicket(int wick)
    {
        TextView wicke=(TextView)findViewById(R.id.wicket);
        wicke.setText(""+wick);
    }

    private void display(int run)
    {
        TextView textView=(TextView)findViewById(R.id.score);
         textView.setText(""+run);
    }

    private void dispallball(String ball) {
        TextView textView = (TextView) findViewById(R.id.over);

         textView.setText(ball);

        }


    public  void reset(View view)
    {
        run=0;
        k=""+0;
        wick=0;
        ba="0";
        in="0";
        ball=0;
        l=0;
        display(run);
       dispallball(k);
       displayWicket(wick);
    }

}
