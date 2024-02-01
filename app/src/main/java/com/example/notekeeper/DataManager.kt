package com.example.notekeeper

import android.icu.text.CaseMap.Title

class DataManager {
    val courses = HashMap<String , CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents", "Android programming with intents")
        courses.set(course.courseID, course)

        course = CourseInfo("android_async", "Android async programming and services")
        courses.set(course.courseID, course)

//        an example of using named parameters
        course = CourseInfo(courseID = "java_lang", title = "Java fundamentals: the java language")
        courses.set(course.courseID, course)

        course = CourseInfo("java_core", "Java fundamentals: the core language")
        courses.set(course.courseID, course)
    }
}
