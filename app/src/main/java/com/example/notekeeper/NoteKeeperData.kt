package com.example.notekeeper

class CourseInfo(val courseID : String, val title: String){
    override fun toString(): String {
        return title
    }
}

class NoteInfo(var Course: CourseInfo, var title: String, text: String){

}