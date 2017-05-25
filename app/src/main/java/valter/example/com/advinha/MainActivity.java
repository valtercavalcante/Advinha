package valter.example.com.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    private Button botaoJogar;
    private TextView textoResultado;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.bt_jogar_id);
        textoResultado = (TextView) findViewById(R.id.txt_numero_id);

        textoResultado.setText("Texto Alterado");
    }
}
