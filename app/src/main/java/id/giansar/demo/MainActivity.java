package id.giansar.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoordinatorLayout mainActivity = findViewById(R.id.mainActivity);
        Snackbar snackbar = Snackbar.make(mainActivity, "Great, You've clicked a button !", Snackbar.LENGTH_INDEFINITE)
                .setBackgroundTint(Color.parseColor("#F5F3FF"))
                .setTextColor(Color.BLACK);
        snackbar.setAction("OK", view -> {
            snackbar.dismiss();
        });

        RelativeLayout btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked SHARE button, Thanks").show();
        });

        TextView btnContact = findViewById(R.id.btnContact);
        btnContact.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked CONTACT button, Thanks").show();
        });

        TextView btnDownload = findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked DOWNLOAD button, Thanks").show();
        });

        RelativeLayout btnComments = findViewById(R.id.btnComments);
        btnComments.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked COMMENTS button, Thanks").show();
        });

        RelativeLayout btnSettings = findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked SETTINGS button, Thanks").show();
        });

        RelativeLayout btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked SEARCH button, Thanks").show();
        });

        RelativeLayout btnAddToCart = findViewById(R.id.btnAddToCart);
        btnAddToCart.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked ADD TO CART button, Thanks").show();
        });

        RelativeLayout btnReadMore = findViewById(R.id.btnReadMore);
        btnReadMore.setOnClickListener(view -> {
            snackbar.setText("Great, You've clicked READ MORE button, Thanks").show();
        });
    }
}