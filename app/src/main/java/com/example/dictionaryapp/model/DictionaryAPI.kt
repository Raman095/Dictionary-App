package com.example.dictionaryapp.model

import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryAPI {
    @GET("api/v2/entries/en/{word}")

    suspend fun getWordDefinition(
        @Path("word") word: String
    ): List<DictionaryData>
}

//       @Path("word") word: String
//       The API endpoint is -> https://api.dictionaryapi.dev/api/v2/entries/en/{word}
//       When you write -> @Path("word") word: String
//       Replace {word} in the URL, With whatever value the user passes
//       So, if you call getWordDefinition("hello"), the URL will be -> https://api.dictionaryapi.dev/api/v2/entries/en/hello
//       word: String, this word holds the value of the word the user passes
//       Then, @Path("word") injects it into the URL. And after it, data is sent.