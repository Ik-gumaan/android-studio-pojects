package com.myandroidapp.famous_quotes_apk.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.myandroidapp.famous_quotes_apk.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MargaretMeadQuoteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MargaretMeadQuoteFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MargaretMeadQuoteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MargaretMeadQuoteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MargaretMeadQuoteFragment newInstance(String param1, String param2) {
        MargaretMeadQuoteFragment fragment = new MargaretMeadQuoteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_margaret_mead_quote, container, false);

        Button backHome=view.findViewById(R.id.btn_home);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_nav_margaretMeadQuote_to_nav_home);

            }
        });


        Button send=view.findViewById(R.id.button4);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView quote=view.findViewById(R.id.textView2);
                String quoteString=quote.getText().toString();
                Intent shareIntent=new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("plain/text");
                shareIntent.putExtra(Intent.EXTRA_TEXT,quoteString);

                startActivity(shareIntent);

            }
        });

        // Inflate the layout for this fragment
        return view;


    }
}