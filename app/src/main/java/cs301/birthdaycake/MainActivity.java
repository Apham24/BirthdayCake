package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.AbsSeekBar;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);
        cakeView.setOnTouchListener(cakeController);
        Button blowButton = findViewById(R.id.button);
        CompoundButton candSwitch = findViewById(R.id.switch1);
        SeekBar numCand = findViewById(R.id.seekBar);
        blowButton.setOnClickListener(cakeController);
        candSwitch.setOnCheckedChangeListener(cakeController);
        numCand.setOnSeekBarChangeListener(cakeController);

    }
    public void goodbye(View button){
        //System.out.println("Goodbye");
        Log.i("button2","Goodbye");
    }
}
