package android.training.notepadwithjetpackcompose.feature_note.data.presentation.notes

import android.training.notepadwithjetpackcompose.feature_note.data.domain.util.NoteOrder
import android.training.notepadwithjetpackcompose.feature_note.data.domain.util.OrderType

data class NotesState(
    val notes: List<android.training.notepadwithjetpackcompose.feature_note.data.domain.model.Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
