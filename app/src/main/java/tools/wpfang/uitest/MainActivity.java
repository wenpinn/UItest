package tools.wpfang.uitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doScreen1(View view) {
        Intent i1=new Intent(this,Screen1.class);
        startActivity(i1);
    }
    public void doScreen2(View view) {
        Intent i2=new Intent(this,Screen2.class);
        startActivity(i2);
    }
}
