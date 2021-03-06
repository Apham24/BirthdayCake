package cs301.birthdaycake;

import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class CakeController implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, SeekBar.OnSeekBarChangeListener,View.OnTouchListener{
    private CakeView cakeView = null;
    private CakeModel cakeModel = null;
    public CakeController(CakeView cakeView){
        this.cakeView = cakeView;
        this.cakeModel = this.cakeView.getCakeModel();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
    this.cakeModel.candleStatus = !this.cakeModel.candleStatus;
    cakeView.invalidate();
    }

    @Override
    public void onClick(View view) {
    this.cakeModel.litStatus = !this.cakeModel.litStatus;
    cakeView.invalidate();
        //Log.d("CakeController","x");
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        this.cakeModel.numCandle = i;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        cakeModel.xCord = (int) motionEvent.getX();
        cakeModel.yCord = (int) motionEvent.getY();
        //cakeView.drawText();
        cakeModel.clicked = true;
        blueBalloon randomSpot = new blueBalloon(cakeModel.xCord, cakeModel.yCord);
        cakeView.addBalloon(randomSpot);
        cakeView.invalidate();
        return true;
    }
}
