package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path


interface ProductMixApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/loanproducts/{productId}/productmix")
    suspend fun createProductMix(
        @Path("productId") productId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @return [kotlin.String]
     */
    @DELETE("v1/loanproducts/{productId}/productmix")
    suspend fun deleteProductMix(@Path("productId") productId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @return [kotlin.String]
     */
    @GET("v1/loanproducts/{productId}/productmix")
    suspend fun retrieveTemplate12(@Path("productId") productId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loanproducts/{productId}/productmix")
    suspend fun updateProductMix(
        @Path("productId") productId: Long,
        @Body body: String? = null
    ): String

}
