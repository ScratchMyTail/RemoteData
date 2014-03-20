package com.example.RemoteData;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import model.Weather;

import java.util.List;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private static final String TAG = "MyActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GetWeatherDataRest fetchr = new GetWeatherDataRest(this);
        fetchr.execute();
    }

    public void updateFields(List<Weather> list){
        Weather now = list.get(0);

        TextView sun = (TextView)findViewById(R.id.sun);
        sun.setText(now.getId());

        TextView temp = (TextView)findViewById(R.id.temp);
        temp.setText(now.getTemperature());

        TextView hum = (TextView)findViewById(R.id.humidity);
        hum.setText(now.getHumidity());

        TextView bea = (TextView)findViewById(R.id.beaufort);
        bea.setText(now.getWindSpeed().getBeaufort());
    }
}
