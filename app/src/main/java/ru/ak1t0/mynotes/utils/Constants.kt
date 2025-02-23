package ru.ak1t0.mynotes.utils

import ru.ak1t0.mynotes.database.DatabaseRepository

const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"
const val TYPE_FIREBASE = "type_firebase"

lateinit var REPOSITORY: DatabaseRepository

object Constants {
    object Keys {
        const val TITLE = "Title"
        const val SUBTITLE = "Subtitle"
        const val ID = "id"
        const val NONE = "none"
        const val UPDATE = "UPDATE"
        const val UPDATE_NOTE = "Update_Note"
        const val DELETE = "DELETE"
        const val NAV_BACK = "NAV_BACK"
        const val EDIT_NOTE = "Edit Note"
        const val EMPTY = ""

    }

}