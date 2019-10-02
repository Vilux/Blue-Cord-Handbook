package academie.duello.bluecordhandbook.ui.misc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.HashSet;

import academie.duello.bluecordhandbook.R;

public class NoteEditor extends AppCompatActivity {

    int noteId;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        EditText note = (EditText) findViewById(R.id.editNote);

        Intent intent = getIntent();
        noteId = intent.getIntExtra("noteId", -1);

        if (noteId != -1) {
            note.setText(NotesFragment.notes.get(noteId));
        } else {
            NotesFragment.notes.add("");
            noteId = NotesFragment.notes.size() - 1;
            NotesFragment.arrayAdapter.notifyDataSetChanged();
        }

        note.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                NotesFragment.notes.set(noteId, String.valueOf(charSequence));
                NotesFragment.arrayAdapter.notifyDataSetChanged();

                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("academie.duello.bluecordhandbook", Context.MODE_PRIVATE);

                HashSet<String> set = new HashSet(NotesFragment.notes);

                sharedPreferences.edit().putStringSet("notes", set).apply();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
