package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path
import org.openapitools.client.models.LookupTableData

interface SPMAPILookUpTableApi {
    /**
     * Create a Lookup Table entry
     * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param lookupTableData  (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/{surveyId}/lookuptables")
    suspend fun createLookupTable(
        @Path("surveyId") surveyId: Long,
        @Body lookupTableData: LookupTableData? = null
    )

    /**
     * List all Lookup Table entries
     * List all Lookup Table entries for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @return [kotlin.collections.List<LookupTableData]
     */
    @GET("v1/surveys/{surveyId}/lookuptables")
    suspend fun fetchLookupTables(@Path("surveyId") surveyId: Long): List<LookupTableData>

    /**
     * Retrieve a Lookup Table entry
     * Retrieve a Lookup Table entry for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param key Enter key
     * @return [LookupTableData]
     */
    @GET("v1/surveys/{surveyId}/lookuptables/{key}")
    suspend fun findLookupTable(
        @Path("surveyId") surveyId: Long,
        @Path("key") key: String
    ): LookupTableData

}
