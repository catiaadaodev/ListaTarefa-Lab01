package ao.co.isptec.aplm.exercise_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView= findViewById(R.id.textView);
        String valor= getIntent().getStringExtra("chave");
        textView.setText(valor.substring(16));
    }
}