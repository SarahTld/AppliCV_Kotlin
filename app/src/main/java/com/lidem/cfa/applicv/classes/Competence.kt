package com.lidem.cfa.applicv.classes

import android.os.Parcel
import android.os.Parcelable

data class Competence(val title: String?, val description: String?): Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Competence> {
        override fun createFromParcel(parcel: Parcel): Competence {
            return Competence(parcel)
        }

        override fun newArray(size: Int): Array<Competence?> {
            return arrayOfNulls(size)
        }
    }
}