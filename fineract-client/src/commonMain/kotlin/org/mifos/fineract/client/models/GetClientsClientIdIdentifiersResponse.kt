/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package org.mifos.fineract.client.models

import kotlinx.serialization.Serializable

/**
 * GetClientsClientIdIdentifiersResponse
 *
 * @param clientId
 * @param description
 * @param documentKey
 * @param documentType
 * @param id
 */

@Serializable
data class GetClientsClientIdIdentifiersResponse(

    val clientId: kotlin.Long? = null,

    val description: kotlin.String? = null,

    val documentKey: kotlin.String? = null,

    val documentType: GetClientsDocumentType? = null,

    val id: kotlin.Long? = null,

)
