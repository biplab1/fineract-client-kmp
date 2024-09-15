package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.openapitools.client.models.DeleteCodeValueDataResponse
import org.openapitools.client.models.GetCodeValuesDataResponse
import org.openapitools.client.models.PostCodeValueDataResponse
import org.openapitools.client.models.PostCodeValuesDataRequest
import org.openapitools.client.models.PutCodeValueDataResponse
import org.openapitools.client.models.PutCodeValuesDataRequest

interface CodeValuesApi {
    /**
     * Create a Code description
     *
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param postCodeValuesDataRequest
     * @return [PostCodeValueDataResponse]
     */
    @POST("v1/codes/{codeId}/codevalues")
    suspend fun createCodeValue(
        @Path("codeId") codeId: Long,
        @Body postCodeValuesDataRequest: PostCodeValuesDataRequest
    ): PostCodeValueDataResponse

    /**
     * Delete a Code description
     * Deletes a code description
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param codeValueId codeValueId
     * @return [DeleteCodeValueDataResponse]
     */
    @DELETE("v1/codes/{codeId}/codevalues/{codeValueId}")
    suspend fun deleteCodeValue(
        @Path("codeId") codeId: Long,
        @Path("codeValueId") codeValueId: Long
    ): DeleteCodeValueDataResponse

    /**
     * List Code Values
     * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
     * Responses:
     *  - 200: A List of code values for a given code
     *
     * @param codeId codeId
     * @return [kotlin.collections.List<GetCodeValuesDataResponse>]
     */
    @GET("v1/codes/{codeId}/codevalues")
    suspend fun retrieveAllCodeValues(@Path("codeId") codeId: Long): List<GetCodeValuesDataResponse>

    /**
     * Retrieve a Code description
     * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
     * Responses:
     *  - 200: OK
     *
     * @param codeValueId codeValueId
     * @param codeId codeId
     * @return [GetCodeValuesDataResponse]
     */
    @GET("v1/codes/{codeId}/codevalues/{codeValueId}")
    suspend fun retrieveCodeValue(
        @Path("codeValueId") codeValueId: Long,
        @Path("codeId") codeId: Long
    ): GetCodeValuesDataResponse

    /**
     * Update a Code description
     * Updates the details of a code description.
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param codeValueId codeValueId
     * @param putCodeValuesDataRequest
     * @return [PutCodeValueDataResponse]
     */
    @PUT("v1/codes/{codeId}/codevalues/{codeValueId}")
    suspend fun updateCodeValue(
        @Path("codeId") codeId: Long,
        @Path("codeValueId") codeValueId: Long,
        @Body putCodeValuesDataRequest: PutCodeValuesDataRequest
    ): PutCodeValueDataResponse

}
