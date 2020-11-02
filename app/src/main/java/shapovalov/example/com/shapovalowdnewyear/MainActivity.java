package shapovalov.example.com.shapovalowdnewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnImage = findViewById(R.id. BtnImage);
        BtnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(MainActivity.this, Activity_image.class);
                startActivity(intentAbout);
            }
        });

        Button BtnInformation = findViewById(R.id. BtnInformation);
        BtnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(MainActivity.this, Activity_information.class);
                startActivity(intentAbout);
            }
        });

        Button BtnTrap = findViewById(R.id. BtnTrap);
        BtnTrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(MainActivity.this, ActivityItsATrap.class);
                startActivity(intentAbout);
            }
        });
    }
}