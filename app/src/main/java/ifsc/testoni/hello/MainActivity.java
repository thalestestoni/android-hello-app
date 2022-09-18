package ifsc.testoni.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("cycleTime", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("cycleTime", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("cycleTime", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("cycleTime", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("cycleTime", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("cycleTime", "onDestroy");
    }
}