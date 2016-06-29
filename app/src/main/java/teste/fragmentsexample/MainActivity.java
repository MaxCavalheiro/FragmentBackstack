package teste.fragmentsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //First fragment didn't added on "BackStack" because it is the first fragment. And when back button is pressed in this position app needs to exit.
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Fragment1()).commit();
    }
}
