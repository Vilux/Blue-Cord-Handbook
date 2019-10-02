package academie.duello.bluecordhandbook.ui.skills;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import academie.duello.bluecordhandbook.MainActivity;
import academie.duello.bluecordhandbook.R;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class AbrazareFragment extends Fragment implements View.OnClickListener {
    TextView abrazare_item, abrazare_item2, abrazare_item3, abrazare_item4, abrazare_item5, abrazare_complete;
    Spinner abrazare_checkbox, abrazare_checkbox2, abrazare_checkbox3, abrazare_checkbox4, abrazare_checkbox5, abrazare_complete_checkbox;
    TextView abrazare_expandable;
    ImageView abrazare_indicator;
    TextView strike_item, strike_item2, strike_item3, strike_item4, strike_complete;
    Spinner strike_checkbox, strike_checkbox2, strike_checkbox3, strike_checkbox4, strike_complete_checkbox;
    TextView strike_expandable;
    ImageView strike_indicator;
    TextView wrest_comp;
    String final_instructor_wrest = "";
    TextView strike_comp;
    String final_instructor_strike = "";
    private String [] instructors = {"AL","DB","MO","MM","WW",""};
    private ArrayAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_abrazare, container, false);
        final TextView textView = root.findViewById(R.id.abrazare_text);

        ((MainActivity) getActivity())
                .setActionBarTitle("Abrazare");

        textView.setText("Lorem ipsum dolor sit amet, consectetur adipiscing " +
                "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
                "ex ea commodo consequat.");

        abrazare_item = (TextView) root.findViewById(R.id.abrazare_item);
        abrazare_item.setVisibility(View.GONE);
        abrazare_checkbox = (Spinner) root.findViewById(R.id.abrazare_checkbox);
        abrazare_checkbox.setVisibility(View.GONE);
        abrazare_item2 = (TextView) root.findViewById(R.id.abrazare_item2);
        abrazare_item2.setVisibility(View.GONE);
        abrazare_checkbox2 = (Spinner) root.findViewById(R.id.abrazare_checkbox2);
        abrazare_checkbox2.setVisibility(View.GONE);
        abrazare_item3 = (TextView) root.findViewById(R.id.abrazare_item3);
        abrazare_item3.setVisibility(View.GONE);
        abrazare_checkbox3 = (Spinner) root.findViewById(R.id.abrazare_checkbox3);
        abrazare_checkbox3.setVisibility(View.GONE);
        abrazare_item4 = (TextView) root.findViewById(R.id.abrazare_item4);
        abrazare_item4.setVisibility(View.GONE);
        abrazare_checkbox4 = (Spinner) root.findViewById(R.id.abrazare_checkbox4);
        abrazare_checkbox4.setVisibility(View.GONE);
        abrazare_item5 = (TextView) root.findViewById(R.id.abrazare_item5);
        abrazare_item5.setVisibility(View.GONE);
        abrazare_checkbox5 = (Spinner) root.findViewById(R.id.abrazare_checkbox5);
        abrazare_checkbox5.setVisibility(View.GONE);
        abrazare_complete = (TextView) root.findViewById(R.id.abrazare_complete);
        abrazare_complete.setVisibility(View.GONE);
        abrazare_complete_checkbox = (Spinner) root.findViewById(R.id.abrazare_complete_check);
        abrazare_complete_checkbox.setVisibility(View.GONE);

        strike_item = (TextView) root.findViewById(R.id.strike_item);
        strike_item.setVisibility(View.GONE);
        strike_checkbox = (Spinner) root.findViewById(R.id.strike_checkbox);
        strike_checkbox.setVisibility(View.GONE);
        strike_item2 = (TextView) root.findViewById(R.id.strike_item2);
        strike_item2.setVisibility(View.GONE);
        strike_checkbox2 = (Spinner) root.findViewById(R.id.strike_checkbox2);
        strike_checkbox2.setVisibility(View.GONE);
        strike_item3 = (TextView) root.findViewById(R.id.strike_item3);
        strike_item3.setVisibility(View.GONE);
        strike_checkbox3 = (Spinner) root.findViewById(R.id.strike_checkbox3);
        strike_checkbox3.setVisibility(View.GONE);
        strike_item4 = (TextView) root.findViewById(R.id.strike_item4);
        strike_item4.setVisibility(View.GONE);
        strike_checkbox4 = (Spinner) root.findViewById(R.id.strike_checkbox4);
        strike_checkbox4.setVisibility(View.GONE);
        strike_complete = (TextView) root.findViewById(R.id.strike_complete);
        strike_complete.setVisibility(View.GONE);
        strike_complete_checkbox = (Spinner) root.findViewById(R.id.strike_complete_check);
        strike_complete_checkbox.setVisibility(View.GONE);

        wrest_comp = (TextView) root.findViewById(R.id.wrest_comp);
        wrest_comp.setVisibility(View.GONE);
        strike_comp = (TextView) root.findViewById(R.id.strike_comp);
        strike_comp.setVisibility(View.GONE);

        abrazare_expandable = (TextView)root.findViewById(R.id.expandableListView);
        abrazare_expandable.setOnClickListener(this);
        strike_expandable = (TextView)root.findViewById(R.id.expandableListView2);
        strike_expandable.setOnClickListener(this);

        abrazare_indicator = (ImageView) root.findViewById(R.id.indicator);
        abrazare_indicator.setOnClickListener(this);
        strike_indicator = (ImageView) root.findViewById(R.id.indicator2);
        strike_indicator.setOnClickListener(this);

        adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_dropdown_item, instructors);

        abrazare_checkbox.setAdapter(adapter);
        abrazare_checkbox.setSelection(5);
        abrazare_checkbox2.setAdapter(adapter);
        abrazare_checkbox2.setSelection(5);
        abrazare_checkbox3.setAdapter(adapter);
        abrazare_checkbox3.setSelection(5);
        abrazare_checkbox4.setAdapter(adapter);
        abrazare_checkbox4.setSelection(5);
        abrazare_checkbox5.setAdapter(adapter);
        abrazare_checkbox5.setSelection(5);
        abrazare_complete_checkbox.setAdapter(adapter);
        abrazare_complete_checkbox.setSelection(5);

        strike_checkbox.setAdapter(adapter);
        strike_checkbox.setSelection(5);
        strike_checkbox2.setAdapter(adapter);
        strike_checkbox2.setSelection(5);
        strike_checkbox3.setAdapter(adapter);
        strike_checkbox3.setSelection(5);
        strike_checkbox4.setAdapter(adapter);
        strike_checkbox4.setSelection(5);
        strike_complete_checkbox.setAdapter(adapter);
        strike_complete_checkbox.setSelection(5);

        final SharedPreferences sharedPreferences = getActivity().getSharedPreferences("academie.duello.bluecordhandbook", Context.MODE_PRIVATE);

        abrazare_checkbox.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("wrestCheck1", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        abrazare_checkbox2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("wrestCheck2", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        abrazare_checkbox3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("wrestCheck3", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        abrazare_checkbox4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("wrestCheck4", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        abrazare_checkbox5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("wrestCheck5", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        abrazare_complete_checkbox.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                final_instructor_wrest = parent.getItemAtPosition(pos).toString();
                sharedPreferences.edit().putString("wrestComplete", final_instructor_wrest).apply();
                if (!final_instructor_wrest.equals("")){
                    wrest_comp.setVisibility(View.VISIBLE);
                }else {
                    wrest_comp.setVisibility(View.GONE);
                }
                sharedPreferences.edit().putInt("wrestCheck6", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        strike_checkbox.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("strikeCheck1", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        strike_checkbox2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("strikeCheck2", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        strike_checkbox3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("strikeCheck3", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        strike_checkbox4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                sharedPreferences.edit().putInt("strikeCheck4", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        strike_complete_checkbox.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view, int pos, long id){
                final_instructor_strike = parent.getItemAtPosition(pos).toString();
                sharedPreferences.edit().putString("strikeComplete", final_instructor_strike).apply();
                if (!final_instructor_strike.equals("")){
                    strike_comp.setVisibility(View.VISIBLE);
                }else {
                    strike_comp.setVisibility(View.GONE);
                }
                sharedPreferences.edit().putInt("strikeCheck5", pos).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        int wrest1 = (int) sharedPreferences.getInt("wrestCheck1", -1);
        int wrest2 = (int) sharedPreferences.getInt("wrestCheck2", -1);
        int wrest3 = (int) sharedPreferences.getInt("wrestCheck3", -1);
        int wrest4 = (int) sharedPreferences.getInt("wrestCheck4", -1);
        int wrest5 = (int) sharedPreferences.getInt("wrestCheck5", -1);
        int wrest6 = (int) sharedPreferences.getInt("wrestCheck6", -1);

        String wrestComplete = (String) sharedPreferences.getString("wrestComplete", null);

        int strike1 = (int) sharedPreferences.getInt("strikeCheck1", -1);
        int strike2 = (int) sharedPreferences.getInt("strikeCheck2", -1);
        int strike3 = (int) sharedPreferences.getInt("strikeCheck3", -1);
        int strike4 = (int) sharedPreferences.getInt("strikeCheck4", -1);
        int strike5 = (int) sharedPreferences.getInt("strikeCheck5", -1);

        String strikeComplete = (String) sharedPreferences.getString("strikeComplete", null);

        if (wrest1 != -1) {
            abrazare_checkbox.setSelection(wrest1);
        }
        if (wrest2 != -1) {
            abrazare_checkbox2.setSelection(wrest2);
        }
        if (wrest3 != -1) {
            abrazare_checkbox3.setSelection(wrest3);
        }
        if (wrest4 != -1) {
            abrazare_checkbox4.setSelection(wrest4);
        }
        if (wrest5 != -1) {
            abrazare_checkbox5.setSelection(wrest5);
        }
        if (wrest6 != -1) {
            abrazare_complete_checkbox.setSelection(wrest6);
        }

        if (wrestComplete != null && !wrestComplete.equals("")){
            wrest_comp.setVisibility(View.VISIBLE);
        }
        else{
            wrest_comp.setVisibility(View.GONE);
        }

        if (strike1 != -1) {
            strike_checkbox.setSelection(strike1);
        }
        if (strike2 != -1) {
            strike_checkbox2.setSelection(strike2);
        }
        if (strike3 != -1) {
            strike_checkbox3.setSelection(strike3);
        }
        if (strike4 != -1) {
            strike_checkbox4.setSelection(strike4);
        }
        if (strike5 != -1) {
            strike_complete_checkbox.setSelection(strike5);
        }

        if (strikeComplete != null && !strikeComplete.equals("")){
            strike_comp.setVisibility(View.VISIBLE);
        }
        else{
            strike_comp.setVisibility(View.GONE);
        }

        return root;
    }

    public void toggle_abrazare_contents(View v) {
        if(abrazare_item.isShown()){
            slide_up(abrazare_item);
            slide_up(abrazare_checkbox);
            slide_up(abrazare_checkbox2);
            slide_up(abrazare_item2);
            slide_up(abrazare_item3);
            slide_up(abrazare_checkbox3);
            slide_up(abrazare_checkbox4);
            slide_up(abrazare_item4);
            slide_up(abrazare_item5);
            slide_up(abrazare_checkbox5);
            slide_up(abrazare_complete_checkbox);
            slide_up(abrazare_complete);
            abrazare_indicator.setImageResource(R.drawable.arrow_down);
        }
        else{
            slide_down(abrazare_item);
            slide_down(abrazare_checkbox);
            slide_down(abrazare_item2);
            slide_down(abrazare_checkbox2);
            slide_down(abrazare_item3);
            slide_down(abrazare_checkbox3);
            slide_down(abrazare_item4);
            slide_down(abrazare_checkbox4);
            slide_down(abrazare_item5);
            slide_down(abrazare_checkbox5);
            slide_down(abrazare_complete_checkbox);
            slide_down(abrazare_complete);
            abrazare_indicator.setImageResource(R.drawable.arrow_up);
        }

    }

    public void toggle_strike_contents(View v) {
        if(strike_item.isShown()){
            slide_up(strike_item);
            slide_up(strike_checkbox);
            slide_up(strike_checkbox2);
            slide_up(strike_item2);
            slide_up(strike_item3);
            slide_up(strike_checkbox3);
            slide_up(strike_checkbox4);
            slide_up(strike_item4);
            slide_up(strike_complete_checkbox);
            slide_up(strike_complete);
            strike_indicator.setImageResource(R.drawable.arrow_down);
        }
        else{
            slide_down(strike_item);
            slide_down(strike_checkbox);
            slide_down(strike_item2);
            slide_down(strike_checkbox2);
            slide_down(strike_item3);
            slide_down(strike_checkbox3);
            slide_down(strike_item4);
            slide_down(strike_checkbox4);
            slide_down(strike_complete_checkbox);
            slide_down(strike_complete);
            strike_indicator.setImageResource(R.drawable.arrow_up);
        }

    }

    public void slide_down(final View v){

        Animation a = AnimationUtils.loadAnimation(this.getActivity(), R.anim.slide_down);
        if(a != null){
            a.reset();
            if(v != null){
                v.clearAnimation();
                v.startAnimation(a);
                v.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        v.setVisibility(View.VISIBLE);
                    }
                }, 200);
            }
        }
    }

    public void slide_up(final View v){

        Animation b = AnimationUtils.loadAnimation(this.getActivity(), R.anim.slide_up);
        if(b != null){
            b.reset();
            if(v != null){
                v.clearAnimation();
                v.startAnimation(b);
                v.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        v.setVisibility(View.GONE);
                    }
                }, 200);

            }
        }
    }

    @Override
    public void onClick(View v) {
        if (v == abrazare_expandable || v == abrazare_indicator) {
            toggle_abrazare_contents(v);
        }
        else if (v == strike_expandable || v == strike_indicator) {
            toggle_strike_contents(v);
        }
    }
}
