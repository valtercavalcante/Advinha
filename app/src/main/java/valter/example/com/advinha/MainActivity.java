package valter.example.com.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        textoResultado = (TextView) findViewById(R.id.txt_numero_id);
        botaoJogar = (Button) findViewById(R.id.bt_jogar_id);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random numRandomico = new Random();
                int numeroAleatorio = numRandomico.nextInt(10);
                textoResultado.setText("O numero gerado foi:" + numeroAleatorio);
            }
        });



    }
}
