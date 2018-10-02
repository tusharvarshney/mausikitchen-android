package mydaavat.com.mydaavat.payment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mydaavat.com.mydaavat.R;

public class PaymentPage extends Activity {

    private static final int TEZ_REQUEST_CODE = 123;

    private static final String GOOGLE_TEZ_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_page);

        Button payButton = findViewById(R.id.pay_button);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =
                        new Uri.Builder()
                                .scheme("upi")
                                .authority("pay")
                                .appendQueryParameter("pa", "tusharvarshney34810@dbs")
                                .appendQueryParameter("pn", "Tushar Varshney")
                                .appendQueryParameter("mc", "1234")
                                .appendQueryParameter("tr", "123456789")
                                .appendQueryParameter("tn", "Mausi's Kitchen [Dal Makhani Combo]")
                                .appendQueryParameter("am", "110.01")
                                .appendQueryParameter("cu", "INR")
                                .appendQueryParameter("url", "https://test.merchant.website")
                                .build();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                intent.setPackage(GOOGLE_TEZ_PACKAGE_NAME);
                startActivityForResult(intent, TEZ_REQUEST_CODE);
            }
        });
    }
}
