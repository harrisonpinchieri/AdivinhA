package adivinha.cursoandroid.com.adivinha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       botaoJogar =  findViewById(R.id.botaoJogarId);
        textoResultado =  findViewById(R.id.resultadoId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //cria um numero aleatorio
               Random randomico = new Random();
               int numeroaleatorio = randomico.nextInt(10); //define o limite do random

                textoResultado.setText("Numero escolhido: "+ numeroaleatorio);
            }
        });

    }
}
