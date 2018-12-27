package sourceinformation.com.br.widgets_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "br.com.sourceinformation.widgets_app";

    //private EditText vNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //vNome = (EditText)  findViewById(R.id.edtNome);
    }

    public void sendMenssage(View view) {
        //Toast.makeText(getApplicationContext(), vNome.getText().toString(), Toast.LENGTH_SHORT).show();
        //vNome.getText().clear();

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edtNome);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void callProgress(View view) {
        Intent intent = new Intent(this, ProgressBarActivity.class);
        startActivity(intent);
    }

    public void callView(View view) {
        Intent intent = new Intent(this, ViewActivity.class);
        startActivity(intent);
    }

    public void callImageView(View view) {
        Intent intent = new Intent(this, ImageViewActivity.class);
        startActivity(intent);
    }

    public void callSeekBar(View view) {
        Intent intent = new Intent(this, SeekBarActivity.class);
        startActivity(intent);
    }
}
