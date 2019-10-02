package academie.duello.bluecordhandbook.ui.misc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import academie.duello.bluecordhandbook.MainActivity;
import academie.duello.bluecordhandbook.R;

public class SparringRecordFragment extends Fragment implements TextWatcher{

    EditText any1,any2,any3,any4,any5,any6,any7,any8,any9,any10,any11,any12,any13,any14,
            any15,any16,any17,any18,any19,any20,any21,any22,any23,any24,any25,
            any26,any27,any28,any29,any30,any31,any32,any33,any34,any35,any36,any37,any38,any39,
            any40,any41,any42,any43,any44,any45,any46,any47,any48,any49,any50;
    EditText higher1,higher2,higher3,higher4,higher5,higher6,higher7,higher8,higher9,higher10,
            higher11,higher12,higher13,higher14,higher15,higher16,higher17,higher18,higher19,
            higher20,higher21,higher22,higher23,higher24,higher25;
    TextView any_comp;
    TextView higher_comp;
    ViewGroup any_view;
    ViewGroup higher_view;
    ArrayList<EditText> any_list;
    ArrayList<EditText> higher_list;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_sparring_record, container, false);
        final TextView textView = root.findViewById(R.id.sparring_text);

        ((MainActivity) getActivity())
                .setActionBarTitle("Sparring Record");

        any_view = (LinearLayout) root.findViewById( R.id.any_view );
        higher_view = (LinearLayout) root.findViewById(R.id.higher_view);

        textView.setText("Lorem ipsum dolor sit amet, consectetur adipiscing " +
                "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
                "ex ea commodo consequat.");

        any1 = (EditText) root.findViewById(R.id.any1);
        any2 = (EditText) root.findViewById(R.id.any2);
        any3 = (EditText) root.findViewById(R.id.any3);
        any4 = (EditText) root.findViewById(R.id.any4);
        any5 = (EditText) root.findViewById(R.id.any5);
        any6 = (EditText) root.findViewById(R.id.any6);
        any7 = (EditText) root.findViewById(R.id.any7);
        any8 = (EditText) root.findViewById(R.id.any8);
        any9 = (EditText) root.findViewById(R.id.any9);
        any10 = (EditText) root.findViewById(R.id.any10);
        any11 = (EditText) root.findViewById(R.id.any11);
        any12 = (EditText) root.findViewById(R.id.any12);
        any13 = (EditText) root.findViewById(R.id.any13);
        any14 = (EditText) root.findViewById(R.id.any14);
        any15 = (EditText) root.findViewById(R.id.any15);
        any16 = (EditText) root.findViewById(R.id.any16);
        any17 = (EditText) root.findViewById(R.id.any17);
        any18 = (EditText) root.findViewById(R.id.any18);
        any19 = (EditText) root.findViewById(R.id.any19);
        any20 = (EditText) root.findViewById(R.id.any20);
        any21 = (EditText) root.findViewById(R.id.any21);
        any22 = (EditText) root.findViewById(R.id.any22);
        any23 = (EditText) root.findViewById(R.id.any23);
        any24 = (EditText) root.findViewById(R.id.any24);
        any25 = (EditText) root.findViewById(R.id.any25);
        any26 = (EditText) root.findViewById(R.id.any26);
        any27 = (EditText) root.findViewById(R.id.any27);
        any28 = (EditText) root.findViewById(R.id.any28);
        any29 = (EditText) root.findViewById(R.id.any29);
        any30 = (EditText) root.findViewById(R.id.any30);
        any31 = (EditText) root.findViewById(R.id.any31);
        any32 = (EditText) root.findViewById(R.id.any32);
        any33 = (EditText) root.findViewById(R.id.any33);
        any34 = (EditText) root.findViewById(R.id.any34);
        any35 = (EditText) root.findViewById(R.id.any35);
        any36 = (EditText) root.findViewById(R.id.any36);
        any37 = (EditText) root.findViewById(R.id.any37);
        any38 = (EditText) root.findViewById(R.id.any38);
        any39 = (EditText) root.findViewById(R.id.any39);
        any40 = (EditText) root.findViewById(R.id.any40);
        any41 = (EditText) root.findViewById(R.id.any41);
        any42 = (EditText) root.findViewById(R.id.any42);
        any43 = (EditText) root.findViewById(R.id.any43);
        any44 = (EditText) root.findViewById(R.id.any44);
        any45 = (EditText) root.findViewById(R.id.any45);
        any46 = (EditText) root.findViewById(R.id.any46);
        any47 = (EditText) root.findViewById(R.id.any47);
        any48 = (EditText) root.findViewById(R.id.any48);
        any49 = (EditText) root.findViewById(R.id.any49);
        any50 = (EditText) root.findViewById(R.id.any50);
        higher1 = (EditText) root.findViewById(R.id.higher1);
        higher2 = (EditText) root.findViewById(R.id.higher2);
        higher3 = (EditText) root.findViewById(R.id.higher3);
        higher4 = (EditText) root.findViewById(R.id.higher4);
        higher5 = (EditText) root.findViewById(R.id.higher5);
        higher6 = (EditText) root.findViewById(R.id.higher6);
        higher7 = (EditText) root.findViewById(R.id.higher7);
        higher8 = (EditText) root.findViewById(R.id.higher8);
        higher9 = (EditText) root.findViewById(R.id.higher9);
        higher10 = (EditText) root.findViewById(R.id.higher10);
        higher11 = (EditText) root.findViewById(R.id.higher11);
        higher12 = (EditText) root.findViewById(R.id.higher12);
        higher13 = (EditText) root.findViewById(R.id.higher13);
        higher14 = (EditText) root.findViewById(R.id.higher14);
        higher15 = (EditText) root.findViewById(R.id.higher15);
        higher16 = (EditText) root.findViewById(R.id.higher16);
        higher17 = (EditText) root.findViewById(R.id.higher17);
        higher18 = (EditText) root.findViewById(R.id.higher18);
        higher19 = (EditText) root.findViewById(R.id.higher19);
        higher20 = (EditText) root.findViewById(R.id.higher20);
        higher21 = (EditText) root.findViewById(R.id.higher21);
        higher22 = (EditText) root.findViewById(R.id.higher22);
        higher23 = (EditText) root.findViewById(R.id.higher23);
        higher24 = (EditText) root.findViewById(R.id.higher24);
        higher25 = (EditText) root.findViewById(R.id.higher_final);
        any_comp = (TextView) root.findViewById(R.id.any_comp);
        higher_comp = (TextView) root.findViewById(R.id.higher_comp);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("academie.duello.bluecordhandbook", Context.MODE_PRIVATE);

        String initials1 = (String) sharedPreferences.getString("any1", null);
        String initials2 = (String) sharedPreferences.getString("any2", null);
        String initials3 = (String) sharedPreferences.getString("any3", null);
        String initials4 = (String) sharedPreferences.getString("any4", null);
        String initials5 = (String) sharedPreferences.getString("any5", null);
        String initials6 = (String) sharedPreferences.getString("any6", null);
        String initials7 = (String) sharedPreferences.getString("any7", null);
        String initials8 = (String) sharedPreferences.getString("any8", null);
        String initials9 = (String) sharedPreferences.getString("any9", null);
        String initials10 = (String) sharedPreferences.getString("any10", null);
        String initials11 = (String) sharedPreferences.getString("any11", null);
        String initials12 = (String) sharedPreferences.getString("any12", null);
        String initials13 = (String) sharedPreferences.getString("any13", null);
        String initials14 = (String) sharedPreferences.getString("any14", null);
        String initials15 = (String) sharedPreferences.getString("any15", null);
        String initials16 = (String) sharedPreferences.getString("any16", null);
        String initials17 = (String) sharedPreferences.getString("any17", null);
        String initials18 = (String) sharedPreferences.getString("any18", null);
        String initials19 = (String) sharedPreferences.getString("any19", null);
        String initials20 = (String) sharedPreferences.getString("any20", null);
        String initials21 = (String) sharedPreferences.getString("any21", null);
        String initials22 = (String) sharedPreferences.getString("any22", null);
        String initials23 = (String) sharedPreferences.getString("any23", null);
        String initials24 = (String) sharedPreferences.getString("any24", null);
        String initials25 = (String) sharedPreferences.getString("any25", null);
        String initials26 = (String) sharedPreferences.getString("any26", null);
        String initials27 = (String) sharedPreferences.getString("any27", null);
        String initials28 = (String) sharedPreferences.getString("any28", null);
        String initials29 = (String) sharedPreferences.getString("any29", null);
        String initials30 = (String) sharedPreferences.getString("any30", null);
        String initials31 = (String) sharedPreferences.getString("any31", null);
        String initials32 = (String) sharedPreferences.getString("any32", null);
        String initials33 = (String) sharedPreferences.getString("any33", null);
        String initials34 = (String) sharedPreferences.getString("any34", null);
        String initials35 = (String) sharedPreferences.getString("any35", null);
        String initials36 = (String) sharedPreferences.getString("any36", null);
        String initials37 = (String) sharedPreferences.getString("any37", null);
        String initials38 = (String) sharedPreferences.getString("any38", null);
        String initials39 = (String) sharedPreferences.getString("any39", null);
        String initials40 = (String) sharedPreferences.getString("any40", null);
        String initials41 = (String) sharedPreferences.getString("any41", null);
        String initials42 = (String) sharedPreferences.getString("any42", null);
        String initials43 = (String) sharedPreferences.getString("any43", null);
        String initials44 = (String) sharedPreferences.getString("any44", null);
        String initials45 = (String) sharedPreferences.getString("any45", null);
        String initials46 = (String) sharedPreferences.getString("any46", null);
        String initials47 = (String) sharedPreferences.getString("any47", null);
        String initials48 = (String) sharedPreferences.getString("any48", null);
        String initials49 = (String) sharedPreferences.getString("any49", null);
        String initials50 = (String) sharedPreferences.getString("any50", null);

        String initialsH1 = (String) sharedPreferences.getString("higher1", null);
        String initialsH2 = (String) sharedPreferences.getString("higher2", null);
        String initialsH3 = (String) sharedPreferences.getString("higher3", null);
        String initialsH4 = (String) sharedPreferences.getString("higher4", null);
        String initialsH5 = (String) sharedPreferences.getString("higher5", null);
        String initialsH6 = (String) sharedPreferences.getString("higher6", null);
        String initialsH7 = (String) sharedPreferences.getString("higher7", null);
        String initialsH8 = (String) sharedPreferences.getString("higher8", null);
        String initialsH9 = (String) sharedPreferences.getString("higher9", null);
        String initialsH10 = (String) sharedPreferences.getString("higher10", null);
        String initialsH11 = (String) sharedPreferences.getString("higher11", null);
        String initialsH12 = (String) sharedPreferences.getString("higher12", null);
        String initialsH13 = (String) sharedPreferences.getString("higher13", null);
        String initialsH14 = (String) sharedPreferences.getString("higher14", null);
        String initialsH15 = (String) sharedPreferences.getString("higher15", null);
        String initialsH16 = (String) sharedPreferences.getString("higher16", null);
        String initialsH17 = (String) sharedPreferences.getString("higher17", null);
        String initialsH18 = (String) sharedPreferences.getString("higher18", null);
        String initialsH19 = (String) sharedPreferences.getString("higher19", null);
        String initialsH20 = (String) sharedPreferences.getString("higher20", null);
        String initialsH21 = (String) sharedPreferences.getString("higher21", null);
        String initialsH22 = (String) sharedPreferences.getString("higher22", null);
        String initialsH23 = (String) sharedPreferences.getString("higher23", null);
        String initialsH24 = (String) sharedPreferences.getString("higher24", null);
        String initialsH25 = (String) sharedPreferences.getString("higher25", null);

        if (initials1 != null){
            any1.setText(initials1);
        }
        if (initials2 != null){
            any2.setText(initials2);
        }
        if (initials3 != null){
            any3.setText(initials3);
        }
        if (initials4 != null){
            any4.setText(initials4);
        }
        if (initials5 != null){
            any5.setText(initials5);
        }
        if (initials6 != null){
            any6.setText(initials6);
        }
        if (initials7 != null){
            any7.setText(initials7);
        }
        if (initials8 != null){
            any8.setText(initials8);
        }
        if (initials9 != null){
            any9.setText(initials9);
        }
        if (initials10 != null){
            any10.setText(initials10);
        }
        if (initials11 != null){
            any11.setText(initials11);
        }
        if (initials12 != null){
            any12.setText(initials12);
        }
        if (initials13 != null){
            any13.setText(initials13);
        }
        if (initials14 != null){
            any14.setText(initials14);
        }
        if (initials15 != null){
            any15.setText(initials15);
        }
        if (initials16 != null){
            any16.setText(initials16);
        }
        if (initials17 != null){
            any17.setText(initials17);
        }
        if (initials18 != null){
            any18.setText(initials18);
        }
        if (initials19 != null){
            any19.setText(initials19);
        }
        if (initials20 != null){
            any20.setText(initials20);
        }
        if (initials21 != null){
            any21.setText(initials21);
        }
        if (initials22 != null){
            any22.setText(initials22);
        }
        if (initials23 != null){
            any23.setText(initials23);
        }
        if (initials24 != null){
            any24.setText(initials24);
        }
        if (initials25 != null) {
            any25.setText(initials25);
        }
        if (initials26 != null){
            any26.setText(initials26);
        }
        if (initials27 != null){
            any27.setText(initials27);
        }
        if (initials28 != null){
            any28.setText(initials28);
        }
        if (initials29 != null){
            any29.setText(initials29);
        }
        if (initials30 != null){
            any30.setText(initials30);
        }
        if (initials31 != null){
            any31.setText(initials31);
        }
        if (initials32 != null){
            any32.setText(initials32);
        }
        if (initials33 != null){
            any33.setText(initials33);
        }
        if (initials34 != null){
            any34.setText(initials34);
        }
        if (initials35 != null){
            any35.setText(initials35);
        }
        if (initials36 != null){
            any36.setText(initials36);
        }
        if (initials37 != null){
            any37.setText(initials37);
        }
        if (initials38 != null){
            any38.setText(initials38);
        }
        if (initials39 != null){
            any39.setText(initials39);
        }
        if (initials40 != null){
            any40.setText(initials40);
        }
        if (initials41 != null){
            any41.setText(initials41);
        }
        if (initials42 != null){
            any42.setText(initials42);
        }
        if (initials43 != null){
            any43.setText(initials43);
        }
        if (initials44 != null){
            any44.setText(initials44);
        }
        if (initials45 != null){
            any45.setText(initials45);
        }
        if (initials46 != null){
            any46.setText(initials46);
        }
        if (initials47 != null){
            any47.setText(initials47);
        }
        if (initials48 != null){
            any48.setText(initials48);
        }
        if (initials49 != null){
            any49.setText(initials49);
        }
        if (initials50 != null){
            any50.setText(initials50);
        }

        if (initialsH1 != null){
            higher1.setText(initialsH1);
        }
        if (initialsH2 != null){
            higher2.setText(initialsH1);
        }
        if (initialsH3 != null){
            higher3.setText(initialsH3);
        }
        if (initialsH4 != null){
            higher4.setText(initialsH4);
        }
        if (initialsH5 != null){
            higher5.setText(initialsH5);
        }
        if (initialsH6 != null){
            higher6.setText(initialsH6);
        }
        if (initialsH7 != null){
            higher7.setText(initialsH7);
        }
        if (initialsH8 != null){
            higher8.setText(initialsH8);
        }
        if (initialsH9 != null){
            higher9.setText(initialsH9);
        }
        if (initialsH10 != null){
            higher10.setText(initialsH10);
        }
        if (initialsH11 != null){
            higher11.setText(initialsH11);
        }
        if (initialsH12 != null){
            higher12.setText(initialsH12);
        }
        if (initialsH13 != null){
            higher13.setText(initialsH13);
        }
        if (initialsH14 != null){
            higher14.setText(initialsH14);
        }
        if (initialsH15 != null){
            higher15.setText(initialsH15);
        }
        if (initialsH16 != null){
            higher16.setText(initialsH16);
        }
        if (initialsH17 != null){
            higher17.setText(initialsH17);
        }
        if (initialsH18 != null){
            higher18.setText(initialsH18);
        }
        if (initialsH19 != null){
            higher19.setText(initialsH19);
        }
        if (initialsH20 != null){
            higher20.setText(initialsH20);
        }
        if (initialsH21 != null){
            higher21.setText(initialsH21);
        }
        if (initialsH22 != null){
            higher22.setText(initialsH22);
        }
        if (initialsH23 != null){
            higher23.setText(initialsH23);
        }
        if (initialsH24 != null){
            higher24.setText(initialsH24);
        }
        if (initialsH25 != null){
            higher25.setText(initialsH25);
        }

        String anyComplete = (String) sharedPreferences.getString("any_complete", null);
        String higherComplete = (String) sharedPreferences.getString("higher_complete", null);

        if (anyComplete != null){
            any_comp.setVisibility(View.VISIBLE);
        } else {
            any_comp.setVisibility(View.GONE);
        }

        if (higherComplete != null){
            higher_comp.setVisibility(View.VISIBLE);
        } else {
            higher_comp.setVisibility(View.GONE);
        }

        any1.addTextChangedListener(this);
        any2.addTextChangedListener(this);
        any3.addTextChangedListener(this);
        any4.addTextChangedListener(this);
        any5.addTextChangedListener(this);
        any6.addTextChangedListener(this);
        any7.addTextChangedListener(this);
        any8.addTextChangedListener(this);
        any9.addTextChangedListener(this);
        any10.addTextChangedListener(this);
        any11.addTextChangedListener(this);
        any12.addTextChangedListener(this);
        any13.addTextChangedListener(this);
        any14.addTextChangedListener(this);
        any15.addTextChangedListener(this);
        any16.addTextChangedListener(this);
        any17.addTextChangedListener(this);
        any18.addTextChangedListener(this);
        any19.addTextChangedListener(this);
        any20.addTextChangedListener(this);
        any21.addTextChangedListener(this);
        any22.addTextChangedListener(this);
        any23.addTextChangedListener(this);
        any24.addTextChangedListener(this);
        any25.addTextChangedListener(this);
        any26.addTextChangedListener(this);
        any27.addTextChangedListener(this);
        any28.addTextChangedListener(this);
        any29.addTextChangedListener(this);
        any30.addTextChangedListener(this);
        any30.addTextChangedListener(this);
        any32.addTextChangedListener(this);
        any33.addTextChangedListener(this);
        any34.addTextChangedListener(this);
        any35.addTextChangedListener(this);
        any36.addTextChangedListener(this);
        any37.addTextChangedListener(this);
        any38.addTextChangedListener(this);
        any39.addTextChangedListener(this);
        any40.addTextChangedListener(this);
        any41.addTextChangedListener(this);
        any42.addTextChangedListener(this);
        any43.addTextChangedListener(this);
        any44.addTextChangedListener(this);
        any45.addTextChangedListener(this);
        any46.addTextChangedListener(this);
        any47.addTextChangedListener(this);
        any48.addTextChangedListener(this);
        any49.addTextChangedListener(this);
        any50.addTextChangedListener(this);
        higher1.addTextChangedListener(this);
        higher2.addTextChangedListener(this);
        higher3.addTextChangedListener(this);
        higher4.addTextChangedListener(this);
        higher5.addTextChangedListener(this);
        higher6.addTextChangedListener(this);
        higher7.addTextChangedListener(this);
        higher8.addTextChangedListener(this);
        higher9.addTextChangedListener(this);
        higher10.addTextChangedListener(this);
        higher11.addTextChangedListener(this);
        higher12.addTextChangedListener(this);
        higher13.addTextChangedListener(this);
        higher14.addTextChangedListener(this);
        higher15.addTextChangedListener(this);
        higher16.addTextChangedListener(this);
        higher17.addTextChangedListener(this);
        higher18.addTextChangedListener(this);
        higher19.addTextChangedListener(this);
        higher20.addTextChangedListener(this);
        higher21.addTextChangedListener(this);
        higher22.addTextChangedListener(this);
        higher23.addTextChangedListener(this);
        higher24.addTextChangedListener(this);
        higher25.addTextChangedListener(this);

        return root;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable s) {

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("academie.duello.bluecordhandbook", Context.MODE_PRIVATE);

        String initials1 = new String(any1.getText().toString());
        String initials2 = new String(any2.getText().toString());
        String initials3 = new String(any3.getText().toString());
        String initials4 = new String(any4.getText().toString());
        String initials5 = new String(any5.getText().toString());
        String initials6 = new String(any6.getText().toString());
        String initials7 = new String(any7.getText().toString());
        String initials8 = new String(any8.getText().toString());
        String initials9 = new String(any9.getText().toString());
        String initials10 = new String(any10.getText().toString());
        String initials11 = new String(any11.getText().toString());
        String initials12 = new String(any12.getText().toString());
        String initials13 = new String(any13.getText().toString());
        String initials14 = new String(any14.getText().toString());
        String initials15 = new String(any15.getText().toString());
        String initials16 = new String(any16.getText().toString());
        String initials17 = new String(any17.getText().toString());
        String initials18 = new String(any18.getText().toString());
        String initials19 = new String(any19.getText().toString());
        String initials20 = new String(any20.getText().toString());
        String initials21 = new String(any21.getText().toString());
        String initials22 = new String(any22.getText().toString());
        String initials23 = new String(any23.getText().toString());
        String initials24 = new String(any24.getText().toString());
        String initials25 = new String(any25.getText().toString());
        String initials26 = new String(any26.getText().toString());
        String initials27 = new String(any27.getText().toString());
        String initials28 = new String(any28.getText().toString());
        String initials29 = new String(any29.getText().toString());
        String initials30 = new String(any30.getText().toString());
        String initials31 = new String(any31.getText().toString());
        String initials32 = new String(any32.getText().toString());
        String initials33 = new String(any33.getText().toString());
        String initials34 = new String(any34.getText().toString());
        String initials35 = new String(any35.getText().toString());
        String initials36 = new String(any36.getText().toString());
        String initials37 = new String(any37.getText().toString());
        String initials38 = new String(any38.getText().toString());
        String initials39 = new String(any39.getText().toString());
        String initials40 = new String(any40.getText().toString());
        String initials41 = new String(any41.getText().toString());
        String initials42 = new String(any42.getText().toString());
        String initials43 = new String(any43.getText().toString());
        String initials44 = new String(any44.getText().toString());
        String initials45 = new String(any45.getText().toString());
        String initials46 = new String(any46.getText().toString());
        String initials47 = new String(any47.getText().toString());
        String initials48 = new String(any48.getText().toString());
        String initials49 = new String(any49.getText().toString());
        String initials50 = new String(any50.getText().toString());

        sharedPreferences.edit().putString("any1", initials1).apply();
        sharedPreferences.edit().putString("any2", initials2).apply();
        sharedPreferences.edit().putString("any3", initials3).apply();
        sharedPreferences.edit().putString("any4", initials4).apply();
        sharedPreferences.edit().putString("any5", initials5).apply();
        sharedPreferences.edit().putString("any6", initials6).apply();
        sharedPreferences.edit().putString("any7", initials7).apply();
        sharedPreferences.edit().putString("any8", initials8).apply();
        sharedPreferences.edit().putString("any9", initials9).apply();
        sharedPreferences.edit().putString("any10", initials10).apply();
        sharedPreferences.edit().putString("any11", initials11).apply();
        sharedPreferences.edit().putString("any12", initials12).apply();
        sharedPreferences.edit().putString("any13", initials13).apply();
        sharedPreferences.edit().putString("any14", initials14).apply();
        sharedPreferences.edit().putString("any15", initials15).apply();
        sharedPreferences.edit().putString("any16", initials16).apply();
        sharedPreferences.edit().putString("any17", initials17).apply();
        sharedPreferences.edit().putString("any18", initials18).apply();
        sharedPreferences.edit().putString("any19", initials9).apply();
        sharedPreferences.edit().putString("any20", initials20).apply();
        sharedPreferences.edit().putString("any21", initials21).apply();
        sharedPreferences.edit().putString("any22", initials22).apply();
        sharedPreferences.edit().putString("any23", initials23).apply();
        sharedPreferences.edit().putString("any24", initials24).apply();
        sharedPreferences.edit().putString("any25", initials25).apply();
        sharedPreferences.edit().putString("any26", initials26).apply();
        sharedPreferences.edit().putString("any27", initials27).apply();
        sharedPreferences.edit().putString("any28", initials28).apply();
        sharedPreferences.edit().putString("any29", initials29).apply();
        sharedPreferences.edit().putString("any30", initials30).apply();
        sharedPreferences.edit().putString("any31", initials31).apply();
        sharedPreferences.edit().putString("any32", initials32).apply();
        sharedPreferences.edit().putString("any33", initials33).apply();
        sharedPreferences.edit().putString("any34", initials34).apply();
        sharedPreferences.edit().putString("any35", initials35).apply();
        sharedPreferences.edit().putString("any36", initials36).apply();
        sharedPreferences.edit().putString("any37", initials37).apply();
        sharedPreferences.edit().putString("any38", initials38).apply();
        sharedPreferences.edit().putString("any39", initials39).apply();
        sharedPreferences.edit().putString("any40", initials40).apply();
        sharedPreferences.edit().putString("any41", initials41).apply();
        sharedPreferences.edit().putString("any42", initials42).apply();
        sharedPreferences.edit().putString("any43", initials43).apply();
        sharedPreferences.edit().putString("any44", initials44).apply();
        sharedPreferences.edit().putString("any45", initials45).apply();
        sharedPreferences.edit().putString("any46", initials46).apply();
        sharedPreferences.edit().putString("any47", initials47).apply();
        sharedPreferences.edit().putString("any48", initials48).apply();
        sharedPreferences.edit().putString("any49", initials49).apply();
        sharedPreferences.edit().putString("any50", initials50).apply();

        String initialsH1 = new String(higher1.getText().toString());
        String initialsH2 = new String(higher2.getText().toString());
        String initialsH3 = new String(higher3.getText().toString());
        String initialsH4 = new String(higher4.getText().toString());
        String initialsH5 = new String(higher5.getText().toString());
        String initialsH6 = new String(higher6.getText().toString());
        String initialsH7 = new String(higher7.getText().toString());
        String initialsH8 = new String(higher8.getText().toString());
        String initialsH9 = new String(higher9.getText().toString());
        String initialsH10 = new String(higher10.getText().toString());
        String initialsH11 = new String(higher11.getText().toString());
        String initialsH12 = new String(higher12.getText().toString());
        String initialsH13 = new String(higher13.getText().toString());
        String initialsH14 = new String(higher14.getText().toString());
        String initialsH15 = new String(higher15.getText().toString());
        String initialsH16 = new String(higher16.getText().toString());
        String initialsH17 = new String(higher17.getText().toString());
        String initialsH18 = new String(higher18.getText().toString());
        String initialsH19 = new String(higher19.getText().toString());
        String initialsH20 = new String(higher20.getText().toString());
        String initialsH21 = new String(higher21.getText().toString());
        String initialsH22 = new String(higher22.getText().toString());
        String initialsH23 = new String(higher23.getText().toString());
        String initialsH24 = new String(higher24.getText().toString());
        String initialsH25 = new String(higher25.getText().toString());

        sharedPreferences.edit().putString("higher1", initialsH1).apply();
        sharedPreferences.edit().putString("higher2", initialsH2).apply();
        sharedPreferences.edit().putString("higher3", initialsH3).apply();
        sharedPreferences.edit().putString("higher4", initialsH4).apply();
        sharedPreferences.edit().putString("higher5", initialsH5).apply();
        sharedPreferences.edit().putString("higher6", initialsH6).apply();
        sharedPreferences.edit().putString("higher7", initialsH7).apply();
        sharedPreferences.edit().putString("higher8", initialsH8).apply();
        sharedPreferences.edit().putString("higher9", initialsH9).apply();
        sharedPreferences.edit().putString("higher10", initialsH10).apply();
        sharedPreferences.edit().putString("higher11", initialsH11).apply();
        sharedPreferences.edit().putString("higher12", initialsH12).apply();
        sharedPreferences.edit().putString("higher13", initialsH13).apply();
        sharedPreferences.edit().putString("higher14", initialsH14).apply();
        sharedPreferences.edit().putString("higher15", initialsH15).apply();
        sharedPreferences.edit().putString("higher16", initialsH16).apply();
        sharedPreferences.edit().putString("higher17", initialsH17).apply();
        sharedPreferences.edit().putString("higher18", initialsH18).apply();
        sharedPreferences.edit().putString("higher19", initialsH19).apply();
        sharedPreferences.edit().putString("higher20", initialsH20).apply();
        sharedPreferences.edit().putString("higher21", initialsH21).apply();
        sharedPreferences.edit().putString("higher22", initialsH22).apply();
        sharedPreferences.edit().putString("higher23", initialsH23).apply();
        sharedPreferences.edit().putString("higher24", initialsH24).apply();
        sharedPreferences.edit().putString("higher25", initialsH25).apply();



        if (any1.getText().hashCode() == s.hashCode() || any2.getText().hashCode() == s.hashCode()|| any3.getText().hashCode() == s.hashCode() || any4.getText().hashCode() == s.hashCode() || any5.getText().hashCode() == s.hashCode() || any6.getText().hashCode() == s.hashCode() || any7.getText().hashCode() == s.hashCode()|| any8.getText().hashCode() == s.hashCode()|| any9.getText().hashCode() == s.hashCode()|| any10.getText().hashCode() == s.hashCode()|| any11.getText().hashCode() == s.hashCode()|| any12.getText().hashCode() == s.hashCode()|| any13.getText().hashCode() == s.hashCode()|| any14.getText().hashCode() == s.hashCode()|| any15.getText().hashCode() == s.hashCode()|| any16.getText().hashCode() == s.hashCode()|| any17.getText().hashCode() == s.hashCode()|| any18.getText().hashCode() == s.hashCode()|| any19.getText().hashCode() == s.hashCode()|| any20.getText().hashCode() == s.hashCode()|| any21.getText().hashCode() == s.hashCode()|| any22.getText().hashCode() == s.hashCode()|| any23.getText().hashCode() == s.hashCode()|| any24.getText().hashCode() == s.hashCode()|| any25.getText().hashCode() == s.hashCode()|| any26.getText().hashCode() == s.hashCode()|| any27.getText().hashCode() == s.hashCode()|| any28.getText().hashCode() == s.hashCode()|| any29.getText().hashCode() == s.hashCode()|| any30.getText().hashCode() == s.hashCode()|| any31.getText().hashCode() == s.hashCode()|| any32.getText().hashCode() == s.hashCode()|| any33.getText().hashCode() == s.hashCode()|| any34.getText().hashCode() == s.hashCode()|| any35.getText().hashCode() == s.hashCode()|| any36.getText().hashCode() == s.hashCode()|| any37.getText().hashCode() == s.hashCode()|| any38.getText().hashCode() == s.hashCode()|| any39.getText().hashCode() == s.hashCode()|| any40.getText().hashCode() == s.hashCode()|| any41.getText().hashCode() == s.hashCode()|| any42.getText().hashCode() == s.hashCode()|| any43.getText().hashCode() == s.hashCode()|| any44.getText().hashCode() == s.hashCode()|| any45.getText().hashCode() == s.hashCode()|| any46.getText().hashCode() == s.hashCode()|| any47.getText().hashCode() == s.hashCode()|| any48.getText().hashCode() == s.hashCode()|| any49.getText().hashCode() == s.hashCode()|| any50.getText().hashCode() == s.hashCode()){

            if (initials1.equals("")) {
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials2.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials3.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials4.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials5.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials6.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials7.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials8.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials9.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials10.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials11.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials12.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials13.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials14.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials15.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials16.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials17.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials18.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials19.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials20.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials21.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials22.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials23.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials24.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials25.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials26.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials27.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials28.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials29.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials30.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials31.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials32.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials33.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials34.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials35.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials36.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials37.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }else if (initials38.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials39.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials40.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials41.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials42.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials43.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials44.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials45.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials46.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials47.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials48.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials49.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }
            else if (initials50.equals("")){
                any_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("any_complete", null).apply();
                return;
            }

            any_comp.setVisibility(View.VISIBLE);
            sharedPreferences.edit().putString("any_complete", "complete").apply();
        }
        else if (higher1.getText().hashCode() == s.hashCode() || higher2.getText().hashCode() == s.hashCode()|| higher3.getText().hashCode() == s.hashCode() || higher4.getText().hashCode() == s.hashCode() || higher5.getText().hashCode() == s.hashCode() || higher6.getText().hashCode() == s.hashCode() || higher7.getText().hashCode() == s.hashCode()|| higher8.getText().hashCode() == s.hashCode()|| higher9.getText().hashCode() == s.hashCode()|| higher10.getText().hashCode() == s.hashCode()|| higher11.getText().hashCode() == s.hashCode()|| higher12.getText().hashCode() == s.hashCode()|| higher13.getText().hashCode() == s.hashCode()|| higher14.getText().hashCode() == s.hashCode()|| higher15.getText().hashCode() == s.hashCode()|| higher16.getText().hashCode() == s.hashCode()|| higher17.getText().hashCode() == s.hashCode()|| higher18.getText().hashCode() == s.hashCode()|| higher19.getText().hashCode() == s.hashCode()|| higher20.getText().hashCode() == s.hashCode()|| higher21.getText().hashCode() == s.hashCode()|| higher22.getText().hashCode() == s.hashCode()|| higher23.getText().hashCode() == s.hashCode()|| higher24.getText().hashCode() == s.hashCode()|| higher25.getText().hashCode() == s.hashCode()){

            if (initialsH1.equals("")) {
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH2.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH3.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH4.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH5.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH6.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH7.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH8.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH9.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH10.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH11.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH12.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH13.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH14.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH15.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH16.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH17.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH18.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH19.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH20.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH21.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH22.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH23.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH24.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }else if (initialsH25.equals("")){
                higher_comp.setVisibility(View.GONE);
                sharedPreferences.edit().putString("higher_complete", null).apply();
                return;
            }

            higher_comp.setVisibility(View.VISIBLE);
            sharedPreferences.edit().putString("higher_complete", "complete").apply();
        }
    }
}
