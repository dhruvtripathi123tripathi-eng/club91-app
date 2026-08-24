package com.example.club91;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private boolean ownerMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Default: block screenshots/screen recording.
        // Owner mode must be enabled only after secure server-side owner authentication.
        if (!ownerMode) {
            getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE
            );
        }

        setContentView(R.layout.activity_main);

        Button join = findViewById(R.id.joinButton);
        Button verify = findViewById(R.id.verifyButton);
        TextView status = findViewById(R.id.statusText);

        join.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://t.me/+hpFBl54c1pY5NDZl"));
            startActivity(i);
        });

        verify.setOnClickListener(v -> {
            status.setText("Secure Telegram membership verification backend connect karna baaki hai.");
        });
    }
}
