package com.softbd.apiproject;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView userNameTV, emailTV, addressTV, detailTV;
    private ExpandableRelativeLayout expandableRelativeLayout1Address, expandableRelativeLayoutDetails;
    private JsonPlaceHolderApi jsonPlaceHolderApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameTV = findViewById(R.id.userNameTV);
        emailTV = findViewById(R.id.emailTV);
        expandableRelativeLayout1Address = findViewById(R.id.expandableLayout1);
        expandableRelativeLayoutDetails = findViewById(R.id.expandableLayout2);
        addressTV = findViewById(R.id.addressTV);
        detailTV = findViewById(R.id.detailTV);

        // for get request
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://skills.gov.bd/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        getData();

    }


    public void getData() {

        Call<GetResponse> call = jsonPlaceHolderApi.getData("01731914336");

        call.enqueue(new Callback<GetResponse>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NotNull Call<GetResponse> call, @NotNull Response<GetResponse> response) {
                if (!response.isSuccessful()) {
                    userNameTV.setText("Code: " + response.code());
                    return;
                }
                GetResponse data = response.body();
                assert data != null;
                userNameTV.setText(data.getApplicant().getUsersDetail().getFatherNameBn());
                emailTV.setText(data.getApplicant().getEmail());
                String address = "";
                address += ("Present Address: " + data.getApplicant().getUsersDetail().getPresentAddress() + "\n"
                        + "Permanent Address: " + data.getApplicant().getUsersDetail().getPermanentAddress());

                addressTV.setText(address);

                String details = "";
                details += ("Father's Name: " + data.getApplicant().getUsersDetail().getFatherNameBn() + "\n"
                        + "Mother's Name: " + data.getApplicant().getUsersDetail().getMotherNameBn() + "\n"
                        + "Phone Number: " + data.getApplicant().getMobileNo());

                detailTV.setText(details);
            }

            @Override
            public void onFailure(Call<GetResponse> call, Throwable throwable) {
                userNameTV.setText(throwable.getMessage());
            }
        });
    }


    public void expandableButton1(View view) {
        expandableRelativeLayout1Address.toggle();
    }

    public void expandableButton2(View view) {

        expandableRelativeLayoutDetails.toggle();
    }
}
