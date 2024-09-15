package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path


interface DeviceRegistrationApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param id
     * @return [kotlin.String]
     */
    @DELETE("v1/self/device/registration/{id}")
    suspend fun delete5(@Path("id") id: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/self/device/registration")
    suspend fun registerDevice(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/self/device/registration")
    suspend fun retrieveAllDeviceRegistrations(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param id
     * @return [kotlin.String]
     */
    @GET("v1/self/device/registration/{id}")
    suspend fun retrieveDeviceRegiistration(@Path("id") id: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/self/device/registration/client/{clientId}")
    suspend fun retrieveDeviceRegistrationByClientId(@Path("clientId") clientId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param id
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/self/device/registration/{id}")
    suspend fun updateDeviceRegistration(
        @Path("id") id: Long,
        @Body body: String? = null
    ): String

}
