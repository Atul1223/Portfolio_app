package com.example.portfolio.model

import com.google.firebase.firestore.QuerySnapshot
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class ProfileProvider {

    private lateinit var name : String
    private lateinit var about : String
    private lateinit var role : String

    private lateinit var querySnapshot: QuerySnapshot
    private val fetchDetails:FetchDetails= FetchDetails()


//    private var profile :Profile =Profile()
    private fun getProfile(){
    CoroutineScope.launch(
        CoroutineContext.
    )
            querySnapshot=fetchDetails.fetchDetails()
            for(doc in querySnapshot){
                name=doc.getString("name").toString()
                role =  doc.getString("role").toString()
            }
    }
}