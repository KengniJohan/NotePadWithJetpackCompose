package android.training.notepadwithjetpackcompose.feature_note.data.domain.use_case

import android.training.notepadwithjetpackcompose.feature_note.data.domain.model.Note
import android.training.notepadwithjetpackcompose.feature_note.data.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note : Note){

        repository.deleteNote(note)

    }

}