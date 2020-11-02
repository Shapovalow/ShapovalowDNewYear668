package shapovalov.example.com.shapovalowdnewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Button BtnMainPage = findViewById(R.id. BtnMainPage);
        BtnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(Activity_information.this, MainActivity.class);
                startActivity(intentAbout);
            }
        });

        ImageView animation1 = findViewById(R.id.imageView);
        Animation AnimFlight = AnimationUtils.loadAnimation(this, R.anim.animation);
        animation1.startAnimation(AnimFlight);
    }
}