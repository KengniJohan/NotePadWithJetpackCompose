package android.training.notepadwithjetpackcompose.feature_note.data.presentation.notes

import android.training.notepadwithjetpackcompose.feature_note.data.domain.model.Note
import android.training.notepadwithjetpackcompose.feature_note.data.domain.util.NoteOrder

sealed class NotesEvent {

    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note : Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
