package com.example.RemoteData;

import android.os.AsyncTask;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Weather;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by christerhansen on 19.03.14.
 */
public class GetWeatherDataRest extends AsyncTask<Void, Void, String> {
    private static final String TAG = "GetWeatherDataRest";
    String url = "http://studit.hinesna.no:3000/weather/5days?lat=66.31163889999999&lng=14.1376939";
    public MyActivity context;
    private List<Weather> posts;

    public GetWeatherDataRest(MyActivity activity){
        this.context = activity;
    }

    @Override
    protected String doInBackground(Void... params) {
        try {
            //Create an HTTP client
            HttpClient client = new DefaultHttpClient();
            HttpGet get = new HttpGet(url);

            //Perform the request and check the status code
            HttpResponse response = client.execute(get);
            StatusLine statusLine = response.getStatusLine();
            if(statusLine.getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();
                InputStream content = entity.getContent();

                try {
                    //Read the server response and attempt to parse it as JSON
                    Reader reader = new InputStreamReader(content);
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setDateFormat("M/d/yy hh:mm a");
                    Gson gson = gsonBuilder.create();
                    posts = new ArrayList<Weather>();
                    posts = Arrays.asList(gson.fromJson(reader, Weather[].class));
                    content.close();
                } catch (Exception ex) {
                    Log.e(TAG, "Failed to parse JSON due to: " + ex);
                }
            } else {
                Log.e(TAG, "Server responded with status code: " + statusLine.getStatusCode());
            }
        } catch(Exception ex) {
            Log.e(TAG, "Failed to send HTTP POST request due to: " + ex);
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        context.updateFields(posts);
    }
}
