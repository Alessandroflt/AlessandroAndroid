package sourceinformation.com.br.widgets_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity {

    protected static final int TIMER_RUNTIME = 10000;

    private boolean mbActive; //verifica se progress está ativa
    private ProgressBar mProgressBar;
    private Button mbVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar);
        mbVoltar = (Button) findViewById(R.id.btnVoltar);

        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        final Thread timeThread = new Thread() {

            @Override
            public void run() {
                mbActive = true;

                try {
                    int waited = 0;

                    while (mbActive && (waited < TIMER_RUNTIME)) {
                        sleep(200);
                        if (mbActive) {
                            waited += 200;
                            updateProgress(waited);
                        }
                    }
                } catch (InterruptedException e) {

                } finally {
                    onContinue();
                }
            }
        };
        timeThread.start();
    }

    private void updateProgress(final int timePassed) {
        if (null != mProgressBar) {
            final int progress = mProgressBar.getMax() * timePassed /TIMER_RUNTIME;
            mProgressBar.setProgress(progress);
        }
    }

    private void onContinue() {
        Log.d("messagemFinal", "Seu load finalizou");
        mbVoltar.setEnabled(true);
    }

    public void voltarPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
