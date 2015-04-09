package com.jucky.administrator.pupupwindow;


import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;


public class MainActivity extends ActionBarActivity {

    private Button button;
    private PopupWindow popupwindow;
    private View popwindow_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = ((Button) findViewById(R.id.Button_click));
        popwindow_view=getLayoutInflater().inflate(R.layout.pupwidow,null);
        popupwindow=new PopupWindow(popwindow_view, WindowManager.LayoutParams.MATCH_PARENT,200,true);
        popupwindow.setBackgroundDrawable(new BitmapDrawable());
        popupwindow.setFocusable(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void ButtonClick(View v)
    {
       switch (v.getId())
        {
            case R.id.Button_click:
                popupwindow.showAtLocation(v, Gravity.LEFT,0,0);
                //Toast.makeText(this,"哈哈",Toast.LENGTH_SHORT).show();
                break;

        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
