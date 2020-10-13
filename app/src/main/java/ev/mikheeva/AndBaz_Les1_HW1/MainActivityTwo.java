package ev.mikheeva.AndBaz_Les1_HW1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity {
    private Button button;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        TextView textView = findViewById(R.id.textView);
        TextView textView13 = findViewById(R.id.textView13);
        TextView textView14 = findViewById(R.id.textView14);
        TextView textView15 = findViewById(R.id.textView15);
        TextView textView16 = findViewById(R.id.textView16);
        TextView textView17 = findViewById(R.id.textView17);
        TextView textView18 = findViewById(R.id.textView18);
        TextView textView19 = findViewById(R.id.textView19);
        TextView textView20 = findViewById(R.id.textView20);
        TextView textView21 = findViewById(R.id.textView21);
        ImageView imageView = findViewById(R.id.imageView2);
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}