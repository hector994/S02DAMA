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


public class FragmentoDos extends Fragment {

    Button link;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmento_dos, container, false);
        link = (Button) view.findViewById(R.id.button2);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkUnivo();
            }
        });
        return view;
    }

    private void LinkUnivo() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.univo.edu.sv/"));
        startActivity(intent);
    }
}