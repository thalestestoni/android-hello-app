package ifsc.testoni.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("cycleTime", "onCreate");
        setMyTextViewWithClickCounter();
    }

    public void addClickToClickCounter(View view) {
        clickCounter += 1;
        setMyTextViewWithClickCounter();
    }

    public void setMyTextViewWithClickCounter() {
        TextView textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(clickCounter));
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