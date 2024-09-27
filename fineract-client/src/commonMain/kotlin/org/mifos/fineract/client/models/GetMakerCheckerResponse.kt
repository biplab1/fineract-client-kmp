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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetMakerCheckerResponse
 *
 * @param actionName
 * @param checkedOnDate
 * @param checker
 * @param clientId
 * @param clientName
 * @param commandAsJson
 * @param entityName
 * @param groupLevelName
 * @param groupName
 * @param id
 * @param loanAccountNo
 * @param loanId
 * @param madeOnDate
 * @param maker
 * @param officeName
 * @param processingResult
 * @param resourceId
 * @param savingsAccountNo
 * @param subresourceId
 * @param url
 */

@Serializable
data class GetMakerCheckerResponse(

    val actionName: kotlin.String? = null,

    @Contextual
    val checkedOnDate: LocalDateTime? = null,

    val checker: kotlin.String? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val commandAsJson: kotlin.String? = null,

    val entityName: kotlin.String? = null,

    val groupLevelName: kotlin.String? = null,

    val groupName: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val loanAccountNo: kotlin.String? = null,

    val loanId: kotlin.Long? = null,

    @Contextual
    val madeOnDate: LocalDateTime? = null,

    val maker: kotlin.String? = null,

    val officeName: kotlin.String? = null,

    val processingResult: kotlin.String? = null,

    val resourceId: kotlin.Long? = null,

    val savingsAccountNo: kotlin.String? = null,

    val subresourceId: kotlin.Long? = null,

    val url: kotlin.String? = null,

)
