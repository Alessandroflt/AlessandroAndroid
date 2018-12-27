package sourceinformation.com.br.widgets_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    private Button btnChangeImage;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        btnChangeImage = findViewById(R.id.btnChangeImage);
        imageView = findViewById(R.id.imageView);

        btnChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.sport_recife);
            }
        });

    }
}
