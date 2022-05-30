package com.example.aviknotes.listeners;

import com.example.aviknotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
