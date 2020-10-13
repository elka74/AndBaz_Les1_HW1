package ev.mikheeva.AndBaz_Les1_HW1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText cityName;
    private String city = "";
    public static final String CITY_KEY = "CITY_KEY";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // final MainPresenter presenter = new MainPresenter.getInstance();
        String instanceState;
        if (savedInstanceState == null){
            instanceState = "Первый запуск";
        }
        else {
            instanceState = "Повторный запуск";
            city = savedInstanceState.getString(CITY_KEY);
        }
        Log.d("MainActivity", city + " - city");

        cityName = findViewById(R.id.editTextTextPersonName);
       // cityName.setText(city);
        cityName.setOnKeyListener(new View.OnKeyListener()
                                  {
                                      public boolean onKey(View v, int keyCode, KeyEvent event)
                                      {
                                          if(event.getAction() == KeyEvent.ACTION_DOWN &&
                                                  (keyCode == KeyEvent.KEYCODE_ENTER))
                                          {
                                              // сохраняем текст, введенный до нажатия Enter в переменную
                                              city = cityName.getText().toString();
                                              return true;
                                          }
                                          return false;
                                      }
                                  }
        );
       // cityName.setText(format(presenter.getCity()));
        Menu menu_main;
        TextView editText = findViewById(R.id.editTextTime);
        TextView editTextdata = findViewById(R.id.editTextDate);
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivityTwo.class));
            }

        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity", "onStart()");
    }
     @Override
     protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Log.d("MainActivity", "Повторный запуск - onRestoreInstanceState()");
     }

     @Override
     protected void onResume(){
       super.onResume();
       Log.d("MainActivity", "1# - onResume()");
     }

     @Override
     protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "1# - onPause()");
     }

     @Override
     protected void onSaveInstanceState(Bundle outState){
        outState.putString(CITY_KEY, city);
        super.onSaveInstanceState(outState);
        Log.d("MainActivity", city + " - city ");
     }

     @Override
     protected void onStop(){
        super.onStop();
        Log.d("MainActivity", "onStop()");
     }

     @Override
     protected void onRestart(){
        super.onRestart();
        Log.d("MainActivity", "onRestart()");
     }

     @Override
     protected void onDestroy(){
      super.onDestroy();
      Log.d("MainActivity", "onDestroy()");
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
                    startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
            return super.onOptionsItemSelected(item);
        }



}


