package academie.duello.bluecordhandbook.ui.misc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashSet;

import academie.duello.bluecordhandbook.MainActivity;
import academie.duello.bluecordhandbook.R;

public class NotesFragment extends Fragment {

    static ArrayList<String> notes = new ArrayList<>();
    static ArrayAdapter arrayAdapter;

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater){
        menuInflater.inflate(R.menu.add_note_menu, menu);

        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.add_note) {
            Intent intent = new Intent(getActivity(), NoteEditor.class);

            startActivity(intent);

            return true;
        }
        return false;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_notes, container, false);

        ListView listView = (ListView) root.findViewById(R.id.notes_list);

        ((MainActivity) getActivity())
                .setActionBarTitle("Notes");

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("academie.duello.bluecordhandbook", Context.MODE_PRIVATE);

        HashSet<String> set = (HashSet<String>) sharedPreferences.getStringSet("notes", null);

        if (set != null) {
            notes = new ArrayList(set);
        }

        arrayAdapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_list_item_1, notes);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), NoteEditor.class);
                intent.putExtra("noteId", i);
                startActivity(intent);

            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l){

                final int itemToDelete = i;

                new AlertDialog.Builder(getActivity())
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want to delete this note?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                notes.remove(itemToDelete);
                                arrayAdapter.notifyDataSetChanged();

                                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("academie.duello.bluecordhandbook", Context.MODE_PRIVATE);

                                HashSet<String> set = new HashSet(NotesFragment.notes);

                                sharedPreferences.edit().putStringSet("notes", set).apply();
                            }
                        }
                        )
                        .setNegativeButton("No", null)
                        .show();

                return true;
            }
        });

        setHasOptionsMenu(true);

        return root;
    }

}
