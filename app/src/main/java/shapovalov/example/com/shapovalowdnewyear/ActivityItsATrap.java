package shapovalov.example.com.shapovalowdnewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityItsATrap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_its_a_trap);

        ImageButton imageButton = findViewById(R.id. imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(ActivityItsATrap.this,MainActivity .class);
                startActivity(intentAbout);
            }
        });

        ImageButton imageButton2 = findViewById(R.id. imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(ActivityItsATrap.this,MainActivity .class);
                startActivity(intentAbout);
            }
        });

        ImageButton imageButton3 = findViewById(R.id. imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(ActivityItsATrap.this,MainActivity .class);
                startActivity(intentAbout);
            }
        });
    }
}