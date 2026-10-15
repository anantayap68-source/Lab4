package com.example.lab3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;

public class AddNoteActivity extends AppCompatActivity {

    private EditText etUserName, etStudentFaculty, etNoteTitle, etTextContent, etChecklistContent;
    private Button btnSaveTextNote, btnSaveCheckListNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        etUserName = findViewById(R.id.etUserName);
        etStudentFaculty = findViewById(R.id.etStudentFaculty);
        etNoteTitle = findViewById(R.id.etNoteTitle);
        etTextContent = findViewById(R.id.etTextContent);
        etChecklistContent = findViewById(R.id.etChecklistContent);

        btnSaveTextNote = findViewById(R.id.btnSaveTextNote);
        btnSaveCheckListNote = findViewById(R.id.btnSaveCheckListNote);

        // Event 1: บันทึก TextNote
        btnSaveTextNote.setOnClickListener(v -> {
            User user = new StudentUser("U001", etUserName.getText().toString(), "email@test.com", "pass", etStudentFaculty.getText().toString());
            TextNote textNote = new TextNote(etNoteTitle.getText().toString(), etTextContent.getText().toString(), "15 Oct 2026", user);

            Toast.makeText(this, "บันทึก TextNote เรียบร้อยแล้ว!", Toast.LENGTH_SHORT).show();
            finish();
        });

        // Event 2: บันทึก CheckListNote
        btnSaveCheckListNote.setOnClickListener(v -> {
            User user = new StudentUser("U001", etUserName.getText().toString(), "email@test.com", "pass", etStudentFaculty.getText().toString());
            String itemsString = etChecklistContent.getText().toString();

            CheckListNote checkListNote = new CheckListNote(
                    etNoteTitle.getText().toString(),
                    Arrays.asList(itemsString.split(",")),
                    "15 Oct 2026",
                    user
            );

            Toast.makeText(this, "บันทึก CheckListNote เรียบร้อยแล้ว!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}