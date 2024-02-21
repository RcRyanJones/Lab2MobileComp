package com.mobile_computing;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);
        Intent intentOBJ = getIntent();
        int id = intentOBJ.getIntExtra("id", -1);
        String title = intentOBJ.getStringExtra("title");
        String date = intentOBJ.getStringExtra("date");
        String text = intentOBJ.getStringExtra("text");
        String imageURL = intentOBJ.getStringExtra("imageURL");

        //////////////etc
        TextView Book_Title = (TextView) findViewById(R.id.textView2);
        //
        ImageView Book_image = (ImageView) findViewById(R.id.imageView);
        TextView Book_Text = (TextView) findViewById(R.id.textView4);
        //utilizing textview and img view for xml displaying
        TextView Book_Date = (TextView) findViewById(R.id.textView3);

        Book_Date.setText(date);
       // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //book title set
    }
  /*  Button backButton = findViewById(R.id.backButton);
    backButton.setOnClickListener(new View.OnClickListener()) {
        @Override
        public void onClick(View v) {
            finish();
        }
    };*/
}
