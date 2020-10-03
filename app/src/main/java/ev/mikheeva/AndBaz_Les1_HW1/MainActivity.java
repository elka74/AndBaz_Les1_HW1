package ev.mikheeva.AndBaz_Les1_HW1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2= findViewById(R.id.textView2);
        TextView textView3= findViewById(R.id.textView3);
        TextView textView4= findViewById(R.id.textView4);
        TextView textView5= findViewById(R.id.textView5);
        TextView textView6= findViewById(R.id.textView6);
        TextView textView7 = findViewById(R.id.textView7);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        EditText editText = findViewById(R.id.editTextTime);
        EditText editTextdata = findViewById(R.id.editTextDate);

        View.OnClickListener clickButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              imageView.setImageResource(R.drawable.background_dent);
            }
        };
        button.setOnClickListener(clickButton);
    }
}