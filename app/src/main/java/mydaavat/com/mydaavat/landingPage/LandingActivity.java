package mydaavat.com.mydaavat.landingPage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import mydaavat.com.mydaavat.R;
import mydaavat.com.mydaavat.onboarding.SignupActivity;
import mydaavat.com.mydaavat.payment.PaymentPage;

public class LandingActivity extends Activity {

    Button serve,order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        serve = (Button)findViewById(R.id.serve);
        order = (Button)findViewById(R.id.order);

        serve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LandingActivity.this,"Serve Clicked",Toast.LENGTH_LONG).show();
                startActivity(new Intent(LandingActivity.this, PaymentPage.class));


            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LandingActivity.this,"Order Clicked",Toast.LENGTH_LONG).show();

            }
        });
    }
}
