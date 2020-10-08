package ev.mikheeva.AndBaz_Les1_HW1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Menu menu_main;
        TextView editText = findViewById(R.id.editTextTime);
        TextView editTextdata = findViewById(R.id.editTextDate);
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(this);

    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.action_setting:
                    Intent intent = new Intent(this, MainActivity3.class);
                    startActivity(intent);
            }
            return super.onOptionsItemSelected(item);
        }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivityTwo.class);
        startActivity(intent);
    }
}


