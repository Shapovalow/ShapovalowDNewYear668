package shapovalov.example.com.shapovalowdnewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Button BtnImage = findViewById(R.id. BtnMainPage);
        BtnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(Activity_image.this, MainActivity.class);
                startActivity(intentAbout);
            }
        });
    }
}