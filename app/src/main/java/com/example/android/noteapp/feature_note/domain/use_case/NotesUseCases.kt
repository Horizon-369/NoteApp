package com.example.android.noteapp.feature_note.domain.use_case

data class NotesUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNode,
    val addNote: AddNote,
    val getNote: GetNote
)
