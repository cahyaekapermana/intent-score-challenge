package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.txt_winner);

        Bundle bundle = getIntent().getExtras();
        String value = bundle.getString("hasil");

        if (bundle != null) {
            result.setText(value);
        }

    }
}
