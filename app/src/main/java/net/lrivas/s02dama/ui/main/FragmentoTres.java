package net.lrivas.s02dama.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.lrivas.s02dama.R;


public class FragmentoTres extends Fragment {

    Button correo;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] correos=new String[1]; //String Array Declared
        correos[0]="hector-murillo94@outlook.com";// Value intialized
        // Inflate the layout for this
        View view = inflater.inflate(R.layout.fragment_fragmento_tres, container, false);
        correo = (Button) view.findViewById(R.id.button3);
        correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCorreoYEnviar(correos);
            }
        });
        return view;
    }

    private void abrirCorreoYEnviar(String[] addresses) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // Only email apps handle this.
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Me interesan tus servicios");
        startActivity(intent);
    }
}