package com.example.notekeeper

class CourseInfo(val courseID : String, val title: String){

}

class NoteInfo(var Course: CourseInfo, var title: String, text: String){

}