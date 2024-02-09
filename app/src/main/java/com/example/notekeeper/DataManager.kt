package com.example.notekeeper

object DataManager {
    val courses = HashMap<String , CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
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
    private fun initializeNotes(){
        var note = NoteInfo(courses.get("android_intents")!!, title = "Example", text = "Nothing much")
        notes.add(note)
        note = NoteInfo(courses.get("android_intents")!!, title = "Example 2", text = "Testing more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_async")!!, title = "Example 3", text = "This is so cool")
        notes.add(note)
        note = NoteInfo(courses.get("android_async")!!, title = "Example 2", text = " Lorem ipsum dolor" +
                " sit amet, consectetur adipiscing elit. Nam in scelerisque sem. Mauris\n volutpat, dolor " +
                " id interdum ullamcorper, risus dolor egestas lectus, sit amet mattis purus\n" )
        notes.add(note)
        note = NoteInfo(courses.get("android_async")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_intents")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("java_core")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("java_lang")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("java_core")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_async")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("java_lang")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("java_lang")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_intents")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_intents")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_intents")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_intents")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
        note = NoteInfo(courses.get("android_intents")!!, title = "Example 2", text = "TEsting more much")
        notes.add(note)
    }
}
