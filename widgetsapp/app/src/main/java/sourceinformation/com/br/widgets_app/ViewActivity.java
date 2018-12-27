package sourceinformation.com.br.widgets_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ViewActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        view = findViewById(R.id.view);
        view.setVisibility(View.VISIBLE);
        checkBox = findViewById(R.id.checkBox);
        callCheck();
    }

    private void callCheck() {
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    //Toast.makeText(getApplicationContext(), "true", Toast.LENGTH_SHORT).show();
                    view.setVisibility(View.INVISIBLE);
                } else {
                    //Toast.makeText(getApplicationContext(), "false", Toast.LENGTH_SHORT).show();
                    view.setVisibility(View.VISIBLE);
                }

            }
        });
    }

}
