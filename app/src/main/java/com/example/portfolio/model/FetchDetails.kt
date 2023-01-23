package com.example.portfolio.model

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot

class FetchDetails {

    private var firebaseFirestore : FirebaseFirestore = FirebaseFirestore.getInstance()
    private var collectionRef : CollectionReference = firebaseFirestore.collection("portfolio")
    private lateinit var querySnapshot: QuerySnapshot

    suspend fun fetchDetails(): QuerySnapshot {
        collectionRef.addSnapshotListener { value, e ->
            if (e != null) {
                return@addSnapshotListener
            }
            if (value != null) {
               querySnapshot=value
            }
        }
        return querySnapshot
    }

}