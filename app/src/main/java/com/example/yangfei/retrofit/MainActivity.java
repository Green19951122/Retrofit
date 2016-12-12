package com.example.yangfei.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yangfei.retrofit.apiservice.LitchiApiService;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRetorfit();
        int i= 0;
    }

    private void initRetorfit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(UrlContent.BASE_URL)
                .build();
        LitchiApiService litchiapiService = retrofit.create(LitchiApiService.class);
    }
}
