package mx.com.happypoint.calendario;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Configuracion extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent = new Intent (Configuracion.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        },4000);






    }
}
