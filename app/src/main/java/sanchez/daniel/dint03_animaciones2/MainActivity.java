package sanchez.daniel.dint03_animaciones2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Animation tD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = (TextView) findViewById(R.id.txt);

        //Primera animación
        tD = AnimationUtils.loadAnimation(this, R.anim.animacion);
        tD.setRepeatMode(Animation.RESTART); //Para repetir la animación
        tD.setRepeatCount(20); //Para repetirlo 20 veces
        txt.startAnimation(tD);

        txt.append("\nRepeatMode: " + tD.getRepeatMode());
        txt.append("\nRepeatCount: " + tD.getRepeatCount());

        //Al pasar tan rápido de la 1ª a la 2ª no da tiempo a ver la 1ª ya que la 2ª se carga

        //Segunda animación (Rotación)
        tD = AnimationUtils.loadAnimation(this, R.anim.animacion2);
        tD.setRepeatMode(Animation.RESTART);
        tD.setRepeatCount(10);
        txt.startAnimation(tD);

        txt.append("\nRepeatMode: " + tD.getRepeatMode());
        txt.append("\nRepeatCount: " + tD.getRepeatCount());
    }
}