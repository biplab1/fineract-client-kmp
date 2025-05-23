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
 *
 *
 * @param active
 * @param amount
 * @param chargeAppliesTo
 * @param chargeCalculationType
 * @param chargeTimeType
 * @param currency
 * @param id
 * @param name
 * @param penalty
 */

@Serializable
data class GetLoanChargeTemplateChargeOptions(

    val active: kotlin.Boolean? = null,

    val amount: kotlin.Double? = null,

    val chargeAppliesTo: GetLoanChargeTemplateChargeAppliesTo? = null,

    val chargeCalculationType: GetLoanChargeCalculationType? = null,

    val chargeTimeType: GetLoanChargeTemplateChargeTimeType? = null,

    val currency: GetLoanChargeCurrency? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

)
