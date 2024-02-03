package net.lrivas.s02dama.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import net.lrivas.s02dama.R;

public class FragmentoUno extends Fragment {
    Button btnEnviar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragmento_uno, container, false);
        btnEnviar = (Button) view.findViewById(R.id.button);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarWhatsup();
            }
        });
        return view;
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragmento_uno, container, false);
    }
    private void enviarWhatsup() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("smsto:"));  // Only SMS apps respond to this.
        intent.putExtra("sms_body", "Developer");
        intent.setType("text/plain");
        startActivity(intent);

    }
    public void enviaMensajeWhatsApp() {

        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        String text = "Tu texto aquí";
        String msjs = "Mi mensaje";
        String numeroTel = "+50375477499";
        String uri = "whatsapp://send?phone=" + numeroTel + "&text=" + msjs;
        sendIntent.setData(Uri.parse(uri));
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");
        sendIntent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(sendIntent);
        //startActivity(Intent.createChooser(sendIntent, "Compartir con"));

    }

}