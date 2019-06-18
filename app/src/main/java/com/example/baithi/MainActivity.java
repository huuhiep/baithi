package com.example.baithi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    Button tinhong;
    EditText so;
    TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        so = (EditText)findViewById(R.id.so);
        tinhong =(Button)findViewById(R.id.btnTinhtong);
        kq =(TextView)findViewById(R.id.textViewKq);
        tinhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = so.getText().toString();
                int tong =0;
                int so1= Integer.parseInt(chuoi1);
                for (int i = 0; i <=so1; i++) {
                    if (checkNumber(i)) {
                        tong+=i;
                    }
                }
                kq.setText(String.valueOf(tong));

            }
        });
    }
    public static boolean checkNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // kiem tra so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
